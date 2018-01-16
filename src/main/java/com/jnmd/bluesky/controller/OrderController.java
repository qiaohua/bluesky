package com.jnmd.bluesky.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.jnmd.bluesky.domain.Order;
import com.jnmd.bluesky.domain.User;
import com.jnmd.bluesky.service.OrderService;

@Controller
@Scope("prototype")
public class OrderController {
	
	@Resource
	private OrderService orderService;
	
	@RequestMapping("/register/orderShow")
	public ModelAndView orderShow(HttpSession session){
		List<Order> orders = orderService.getOrdersService();
		ModelAndView andView = new ModelAndView();
		andView.setViewName("gongdan");
		andView.addObject("orders", orders);
		/*User user = new User();
		user.setU_id(1);
		session.setAttribute("user", user);*/
		return andView;
	}
	
	@RequestMapping("orderDetails")
	public ModelAndView orderDetails(int o_id){
		Order order = orderService.getOrderService(o_id);
		ModelAndView andView = new ModelAndView();
		andView.setViewName("gongdanjieshao");
		String str = order.getTime();
		str = str.substring(0, 10);
		order.setTime(str);
		andView.addObject("order", order);
		return andView;
	}
	
	@RequestMapping("orderSelect")
	public void getUsersCon(HttpServletResponse response,int params) throws IOException{
		List<Order> orders = orderService.getOrderByTypeSer(params);
		Gson gson = new Gson();
		String str = gson.toJson(orders);
		//指定响应数据格式及编码
		response.setContentType("application/json;charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.write(str);
		pw.flush();
		pw.close();
	}
	
	@RequestMapping("insertOrder")
	public void insertOrderCon(HttpSession session, HttpServletResponse response,String str) throws IOException{

		String title = "";
		String tty_id = "";
		String money = "";
		String time = "";
		String text = "";
		String intro = "";
		long times = 0;
		String[] strs = str.split("&");
		for(int i = 0; i < strs.length;i++){
			String[] strss = strs[i].split("=");
			switch(i){
				case 0:title = strss[1];
				case 1:tty_id = strss[1];
				case 2:money = "￥" + strss[1] + ".00";
				case 3:time = strss[1];
				case 4:text = strss[1];
				case 5:intro = strss[1];
				break;
			}
			
		}
		int u_id = 1;
		/*User user = (User)session.getAttribute("user");
		u_id = user.getU_id();*/
		int ty_id = Integer.parseInt(tty_id);
		Date date = new Date();
		DateFormat df = DateFormat.getDateTimeInstance();
		time = df.format(date);//日期
		times = date.getTime();//现在的毫秒数
		String orderCode = "";
		Random random = new Random();
		int randomNum = random.nextInt(100)+1;
		
		if(ty_id == 1){
			orderCode = "A" + times + "" + u_id + "" +randomNum;
		}else if(ty_id == 2){
			orderCode = "B" + times + "" + u_id + "" +randomNum;
		}else if(ty_id == 3){
			orderCode = "C" + times + "" + u_id + "" +randomNum;
		}
		
		Order order = new Order(orderCode,u_id,title,ty_id,money,time,intro);
		System.out.println("=======================");
		System.out.println(order);
		orderService.insertOrderService(order);
		Gson gson = new Gson();
		String str1 = gson.toJson(order);
		//指定响应数据格式及编码   
		response.setContentType("application/json;charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.write(str1);
		pw.flush();
		pw.close();
	}
	
}
