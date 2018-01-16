package com.jnmd.bluesky.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.jnmd.bluesky.domain.comment;
import com.jnmd.bluesky.domain.replyComment;
import com.jnmd.bluesky.service.CommentService;

@Controller
@Scope("prototype")
public class CommentController {
	@Resource
	private CommentService commentservice;
	
	@RequestMapping("testAJAX")
	public ModelAndView insertComment(){
		System.out.println("进入Controller");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("liuyan");
		return mv;
	}

	
	@RequestMapping("testAjaxController")
	@ResponseBody       //将方法返回的 对象 自动封装成为JSON格式
	public comment addconmment(comment c) {
		System.out.println("进入test");

		System.out.println(commentservice.setComment(c));
		System.out.println(c); 
		return c;  
	}
	
	@RequestMapping("testAjaxController1")
	@ResponseBody       //将方法返回的 对象 自动封装成为JSON格式
	public replyComment addreplyConmment(replyComment rc) {
		System.out.println("进入reply test");

		System.out.println(commentservice.setReplyComment(rc));
		System.out.println(rc); 
		return rc;  
	}
	
	@RequestMapping("deleteCO")
	@ResponseBody       //将方法返回的 对象 自动封装成为JSON格式
	public int test(int del_co) {
		System.out.println("进入deleteComment test");
		System.out.println(commentservice.deleteComment(del_co));
		return del_co;  
	}
	
	@RequestMapping("deleteRC")
	@ResponseBody       //将方法返回的 对象 自动封装成为JSON格式
	public int test2(int del_rc) {
		System.out.println("进入deletereplyComment test"); 
		System.out.println(commentservice.deleteReplyComment(del_rc));
		return del_rc;  
	}
	
	@RequestMapping("getCO")
	@ResponseBody       //将方法返回的 对象 自动封装成为JSON格式
	public JSONObject getComment() {
		System.out.println("进入getComment");
		System.out.println(commentservice.getComment());
		List<comment> list = commentservice.getComment();  
		JSONObject json = new JSONObject();
		json.put("list", list);
		for(int i = 0 ; i < list.size() ; i++){
			System.out.println(list.get(i));
		}
		
		return json;
	}
	
}
