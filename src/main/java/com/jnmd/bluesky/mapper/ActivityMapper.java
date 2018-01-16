package com.jnmd.bluesky.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jnmd.bluesky.domain.Activity;

@Repository
public interface ActivityMapper {
	
	public List<Activity> getAcList();

	public Activity getActivity(int aid);
	
}
