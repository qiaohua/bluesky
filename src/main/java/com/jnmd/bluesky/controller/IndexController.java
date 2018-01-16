package com.jnmd.bluesky.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Scope("prototype")
public class IndexController {
	
	@RequestMapping("/reActivity")
	public ModelAndView reActivity(ModelAndView mv){
		mv.setViewName("activity");
		mv.addObject("index",2);
		return mv;
	}
	
	@RequestMapping("/reShare")
	public ModelAndView reShare(ModelAndView mv){
		mv.setViewName("queryActivity");
		mv.addObject("index",3);
		return mv;
	}
	
	@RequestMapping("bbb")
	public String save2(ModelAndView mv){

		return "wode";
	}
	@RequestMapping("aaa")
	public ModelAndView save(ModelAndView mv){

		mv.setViewName("activity");
		
		return mv;
	}
	@RequestMapping("ccc")
	public ModelAndView save3(ModelAndView mv){
		
		mv.setViewName("shouye");
		
		return mv;
	}

}
