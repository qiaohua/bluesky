package com.jnmd.bluesky.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jnmd.bluesky.domain.camera;
import com.jnmd.bluesky.exception.CanmeraException;
import com.jnmd.bluesky.mapper.CanmeraMapper;

@Service
@Transactional
public class CanmeraService {
	@Resource
	private CanmeraMapper canmeraMapper;
	
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public List<camera> getCanmerService(){	
		return canmeraMapper.getCameras();
	}
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public camera getCanmerServiceOne(int id){
		return canmeraMapper.getCamera(id);
	}
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public Map<String, Object> getPictureService(int pb_id){
		return canmeraMapper.getpicture(pb_id);
	}
	
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public List<Map<String, Object>> getPicturesService(int pb_id){
		return canmeraMapper.getListpicture(pb_id);
	}
	
	@Transactional(propagation=Propagation.REQUIRED, rollbackFor=CanmeraException.class)
	public int insertPhoto(String title, String url, int u_id){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("title", title);
		map.put("url", url);
		map.put("u_id", u_id);
		map.put("pb_id", null);
		canmeraMapper.insertPhoto(map);
		return (Integer)map.get("pb_id");
	}
	@Transactional(propagation=Propagation.REQUIRED, rollbackFor=CanmeraException.class)
	public void insertCamera(int pb_id, String photodescribe){
		camera  c = new camera();
		c.setPb_id(pb_id);
		c.setPhotodescribe(photodescribe);
		canmeraMapper.insertCamera(c);
	}
	@Transactional(propagation=Propagation.REQUIRED, rollbackFor=CanmeraException.class)
	public void insertPicture(String img_name, int pb_id, String publi){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("img_name", img_name);
		map.put("pb_id", pb_id);
		map.put("public", publi);
		
		canmeraMapper.insertPicture(map);
	}
}
