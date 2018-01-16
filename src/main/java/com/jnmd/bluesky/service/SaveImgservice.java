package com.jnmd.bluesky.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jnmd.bluesky.domain.Photobook;
import com.jnmd.bluesky.domain.Picture;
import com.jnmd.bluesky.mapper.SaveImg;

@Service
public class SaveImgservice {
	
	@Resource
	private SaveImg saveImg;
	
	public int savephoto(Photobook photobook){
		return saveImg.savephoto(photobook);
	}
	
	public void savepicture(Picture	picture){
		saveImg.savepicture(picture);
	}
}
