package com.jnmd.bluesky.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jnmd.bluesky.domain.Photobook;
import com.jnmd.bluesky.mapper.PhotoMapper;

@Service
@Transactional(propagation=Propagation.REQUIRED)
public class PhotoService {

		@Resource
		private PhotoMapper photoMapper;
		
		public List<Photobook> geturl(int u_id){
			//System.out.println(u_id+"u_id");
			return photoMapper.getPhoto(u_id);
		}
		
		public List<Photobook> getPhotosTest(int u_id){
			//System.out.println(u_id+"u_id");
			return photoMapper.getPhotosTest(u_id);
		}
}
