package com.jnmd.bluesky.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jnmd.bluesky.domain.Photobook;
import com.jnmd.bluesky.domain.Picture;
import com.jnmd.bluesky.service.PhotoService;

@Controller
@Scope("prototype")
public class Photocontroller {
	int u_id = 1;
	@Resource
	private PhotoService photoService;
	//获取图片地址
	@RequestMapping("/getphotos")
	public ModelAndView getPhotos(){
		List<Photobook> photos = photoService.geturl(u_id);
		List<String> lists = new ArrayList<String>();
		//遍历每一张图片的地址
		for(int i = 0; i < photos.size(); i++){
			for (Picture p : photos.get(i).getImgs()) {
				lists.add(photos.get(i).getUrl()+"/"+p);
				System.out.println(photos.get(i).getUrl()+"/"+p);
			}
		}
		
		ModelAndView mv = new ModelAndView();
		//设置跳转页面
		mv.setViewName("wodexiangce");
		//将集合放到作用域
		mv.addObject("lists", lists);
		return mv;
	}
	
}
