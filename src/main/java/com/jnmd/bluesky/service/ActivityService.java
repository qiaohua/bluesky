package com.jnmd.bluesky.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jnmd.bluesky.domain.Activity;
import com.jnmd.bluesky.mapper.ActivityMapper;

@Service
@Transactional
public class ActivityService {
	
	@Resource
	private ActivityMapper activityMapper;

	public List<Activity> getAcList() {
		
		return activityMapper.getAcList();
	}

	public Activity getActivity(int aid) {
		// TODO Auto-generated method stub
		return activityMapper.getActivity(aid);
	}

}
