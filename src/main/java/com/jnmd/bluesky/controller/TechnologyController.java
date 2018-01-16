 package com.jnmd.bluesky.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.jnmd.bluesky.domain.Technology;
import com.jnmd.bluesky.domain.User;
import com.jnmd.bluesky.service.TechnologyService;


@Controller
@Scope("prototype")
public class TechnologyController {
	@Resource
	private TechnologyService technologyService;
	@Resource
	private ArticleController articleController;

	@RequestMapping("/register/AllTec")
	@ResponseBody
	public List<Technology> AllTec(HttpServletResponse response) {
		//System.out.println("执行controller----AllTec");
		List<Technology> list=technologyService.AllTec();
		String str = JSON.toJSONString(list);
		System.out.println(str+"=============");
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
			//System.out.println("关闭资源");
			pw.close();
		}
		/*mv.addObject("list",list);
		mv.setViewName("sheyingZS");*/
		return list;
	}
	@RequestMapping("/insertT")
	public String insertT(Technology yui){
		User user=new User();
		user.setU_id(3);
		yui.setUser(user);
		technologyService.insertT(yui);
		//articleController.getAllArticles();
		//mv.setViewName("sheyingZS");
		return "forward:register/getCanmera";
		//return mv;
	}
	@RequestMapping("fabujc")
	public ModelAndView fabu(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("jsfb");
		return mv;
	}

}
