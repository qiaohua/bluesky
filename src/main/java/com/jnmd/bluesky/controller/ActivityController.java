package com.jnmd.bluesky.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.jnmd.bluesky.domain.Activity;
import com.jnmd.bluesky.domain.ActivityUser;
import com.jnmd.bluesky.domain.User;
import com.jnmd.bluesky.service.ActivityService;
import com.jnmd.bluesky.service.ActivityUserService;

@Controller
@Scope("prototype")
public class ActivityController {

	@Resource
	private ActivityService activityService;

	@Resource
	private ActivityUserService activityUserService;

	@RequestMapping("/register/acListNohis")
	public void getList(HttpServletResponse response) {

		List<Activity> list = activityService.getAcList();

		String str = JSON.toJSONString(list);
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			pw.write(str);
			pw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			pw.close();
		}

	}

	@RequestMapping("/register/queryActivity")
	public ModelAndView queryActivity(ModelAndView mv,int aid,HttpServletRequest request){
		
		Activity activity= activityService.getActivity(aid);
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("aid", aid);
		map1.put("count", 3);
		List<ActivityUser> userList =activityUserService.getUser(map1); 
		int userCount=activityUserService.getCount(aid);
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("aid", aid);
		map2.put("count", 0);
		List<ActivityUser> users = activityUserService.getUser(map2);
		mv.setViewName("queryActivity");
		mv.addObject("activity",activity);
		mv.addObject("userList",userList);
		mv.addObject("count",userCount);
		mv.addObject("users",users);
		
		/*
		 * session添加用户后期删除
		 * 测试*/
		User user = new User(1, null, null, null, null, 0, 0, null, 0);
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		//测试代码结束
		
		return mv;
	}
}
