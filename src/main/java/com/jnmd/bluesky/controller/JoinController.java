package com.jnmd.bluesky.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jnmd.bluesky.exception.ActivityUserException;
import com.jnmd.bluesky.service.ActivityUserService;

@Controller
@Scope("prototype")
public class JoinController {
	
	@Resource
	private ActivityUserService activityUserService;
	
	@RequestMapping("/delAcUserNohis")
	public String delAcUser(int aid,int uid) throws ActivityUserException{
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("aid", aid);
		map.put("uid", uid);
		activityUserService.delAcUser(map);
		
		return "redirect:/queryActivity?aid="+aid;
	}
	
	@RequestMapping("/addAcUserNohis")
	public String addAcUser(int aid,int uid) throws ActivityUserException{
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("aid", aid);
		map.put("uid", uid);
		activityUserService.addAcUser(map);
		
		return "redirect:/queryActivity?aid="+aid;
	}
}
