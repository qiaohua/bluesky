package com.jnmd.bluesky.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.jnmd.bluesky.domain.User;
import com.jnmd.bluesky.service.UserService;

@Controller
@Scope("prototype")
public class UserController {
	
	@Resource
	private UserService userService;
	
	//登录
	@RequestMapping("/denglu")
	public ModelAndView denglu(String mphone,HttpServletRequest request){
		HttpSession session = request.getSession();
		String uri = (String)session.getAttribute("uri");
		User user = userService.getUserByMphone(mphone);
		if(user == null){
			user = new User();
			user.setHeadImg("IMG_3@2x.png");
			user.setMphone(mphone);
			userService.saveUser(user);
		}
		session.setAttribute("user", user);
		session.setAttribute("u_id", user.getU_id());
		System.out.println(user);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("forward:shouye.vm");
		return mv;
	}
	
	//点击图1
	@RequestMapping("sheyingZS")
	public ModelAndView tu1(){
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("sheyingZS");
		return mv;
	}
	
	@RequestMapping("/wode")
	public ModelAndView wode(HttpServletRequest request){
		
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		
		if(user.getCity()== null){
			user.setCity("未知");
		}
		ModelAndView mv = new ModelAndView();
		mv.setViewName("wode");
		mv.addObject("user", user);
		return mv;
	}
	
	@RequestMapping("mytx")
	public ModelAndView mytx(HttpServletRequest request){
		
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		if(user.getNickName() == null){
			user.setNickName("(null)");
		}
		
		if(user.getCity()== null){
			user.setCity("未知");
		}
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", user);
		mv.setViewName("mytx");
		
		return mv;
	}
	
	@RequestMapping("xiugai")
	public ModelAndView xiugai(HttpServletRequest request){
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("xiugai");
		mv.addObject("user", user);
		return mv;
	}
	
	@RequestMapping("updateUser")
	public ModelAndView updateUser(
			HttpServletRequest request,@RequestParam("file")MultipartFile file,
			String nickName,int sex,int age,String shi
	){
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		
		
		if(!file.isEmpty()){
			String path = 
					request.getSession().getServletContext().getRealPath("/headImg");
			//生成uuid作为文件名称  
			String uuid = UUID.randomUUID().toString().replaceAll("-","");    
			//获得文件类型（可以判断如果不是图片，禁止上传）    
			String contentType=file.getContentType();    
			//获得文件后缀名   
			String suffixName=contentType.substring(contentType.indexOf("/")+1);
			//得到 文件名  
			String fileName=uuid+"."+suffixName;   
			user.setHeadImg(fileName);
			File save = new File(path, fileName);
			
			try {
				// 直接将文件保存在指定的目录中
				file.transferTo(save);
				System.out.println("上传成功。。");
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		user.setNickName(nickName);
		user.setSex(sex);
		user.setAge(age);
		user.setCity(shi);
		userService.updateUser(user);
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", user);
		mv.setViewName("mytx");
		
		return mv;
	}
	
	
	
	@RequestMapping("fabuwenzhang")
	public ModelAndView tu3(){
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("fabuwenzhang");
		return mv;
	}
	@RequestMapping("tixianGL")
	public ModelAndView tixiang(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("tixianGL");
		return mv;
		
		
	}
	
	

}
