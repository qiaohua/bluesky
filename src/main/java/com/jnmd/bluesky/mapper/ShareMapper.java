package com.jnmd.bluesky.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.jnmd.bluesky.domain.Share;

@Repository
public interface ShareMapper {
	
	public int saveShare(Map<String, Object> map);

	public Share getShare(Map<String, Object> map);

	public List<Share> getList();
}