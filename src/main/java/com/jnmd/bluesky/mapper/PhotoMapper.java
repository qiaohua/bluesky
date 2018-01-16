package com.jnmd.bluesky.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jnmd.bluesky.domain.Photobook;

@Repository
public interface PhotoMapper {
	
	public List<Photobook> getPhoto(int u_id);
	
	public List<Photobook> getPhotosTest(int u_id);
}
