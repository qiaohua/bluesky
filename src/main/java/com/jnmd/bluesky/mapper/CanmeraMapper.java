package com.jnmd.bluesky.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.jnmd.bluesky.domain.camera;
@Repository
public interface CanmeraMapper {
	public List<camera> getCameras();
	public camera getCamera(int id);
	public void insertPhoto(Map<String, Object> map);
	public void insertCamera(camera c);
	public void insertPicture(Map<String, Object> map);
	public Map<String, Object> getpicture(int pb_id);
	public List<Map<String, Object>> getListpicture(int pb_id);
	
}
