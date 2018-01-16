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
import com.google.gson.Gson;
import com.jnmd.bluesky.domain.Jump;
import com.jnmd.bluesky.service.JumpService;

@Controller
@Scope("prototype")
public class JumpController {
	
	@Resource 
	private JumpService jumpService;
	
	@RequestMapping("/register/getjump")
	@ResponseBody
	public List<Jump> getJumps(HttpServletResponse response){
		ModelAndView mv = new ModelAndView();
		List<Jump> list=jumpService.getjumps();
		Gson gson = new Gson();
		String str = JSON.toJSONString(list);
		System.out.println(str+"=============");
		
		/*mv.setViewName("sheyingZS");
		mv.addObject("list", list);
		mv.addObject("tab", 1);
		mv.addObject("i", 1);
		return mv;*/
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
}
