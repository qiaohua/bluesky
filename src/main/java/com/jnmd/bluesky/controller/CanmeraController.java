package com.jnmd.bluesky.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.jnmd.bluesky.domain.camera;
import com.jnmd.bluesky.service.CanmeraService;

@Controller
@Scope("prototype")
public class CanmeraController {
	@Resource
	private CanmeraService canmeraService;
	
	@RequestMapping("/register/getCanmera")
	public ModelAndView getCanmera(){
		List<camera> cameras = null;
		Map<String, Object> imgName = null;
		List<String> imgNames = new ArrayList<String>();
		imgNames.add("VM中循环计数从1开始，所以这里的0索引需要占用");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("sheyingZS");
		cameras = canmeraService.getCanmerService();
		for(camera s: cameras){
			imgName = canmeraService.getPictureService(s.getPb_id());
			imgNames.add((String) imgName.get("img_name"));	
		}
		mv.addObject("imgNames",imgNames);
		mv.addObject("cameras", cameras);
		return mv;
	}
	@RequestMapping("/getCanmeras")
	public ModelAndView getCanmeras(int id){
		ModelAndView mv = new ModelAndView();
		camera c = canmeraService.getCanmerServiceOne(id);
		mv.addObject("camera", c);
		mv.setViewName("datu");
		List<Map<String, Object>> picture = new ArrayList<Map<String, Object>>();
		picture = canmeraService.getPicturesService(id);
		System.out.println(picture);
		mv.addObject("picture", picture);
		return mv;
		
	}
	
	@RequestMapping("/uploadFileVM")
	public ModelAndView uploadFileVM(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("fabu2");
		return mv;
	}
	

	@RequestMapping("/uploadFile")
	public String uploadFile(HttpSession session, String miaoshu, String quanxian, String photoname, HttpServletRequest request,@RequestParam("file") CommonsMultipartFile files[]){

		if(!("Y".equals(quanxian))){
			quanxian = "N";
		}	
		int u_id = (Integer)session.getAttribute("u_id");
		String path = 
				request.getSession().getServletContext().getRealPath("/upload/" + u_id/*通过Session得到当前登录用户的uid*/+"/");	
		String url = "upload/" + u_id/*通过Session得到当前登录用户的uid*/+"/";
		
		createFolder(path);
	int pb_id =(int)canmeraService.insertPhoto(photoname, url, u_id);
				canmeraService.insertCamera(pb_id, miaoshu);
		
			for(int i = 0; i < files.length; i++){
				 // 获得原始文件名  
		    	String fileName = files[i].getOriginalFilename();
		    	canmeraService.insertPicture(fileName, pb_id, quanxian);
		    	File save = new File(path, fileName);
		    	
		    	try {
					// 直接将文件保存在指定的目录中
					files[i].transferTo(save);
					
				} catch (IllegalStateException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}		
		
		return "forward:/getCanmeras";
	}
	
	
	//新建文件夹  传入创建的地址
		public Boolean createFolder(String path){
			File file = null;
			try {
				file = new File(path);
				if (!file.exists()) {
					return file.mkdirs();
				}
				else{
					return false;
				}
			} catch (Exception e) {
			} finally {
				file = null;
			}
			return false;
		}
	
}
