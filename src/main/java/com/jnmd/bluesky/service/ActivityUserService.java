package com.jnmd.bluesky.service;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.jnmd.bluesky.domain.ActivityUser;
import com.jnmd.bluesky.exception.ActivityUserException;
import com.jnmd.bluesky.mapper.ActivityUserMapper;

@Service
@Transactional
public class ActivityUserService {
	
	@Resource
	private ActivityUserMapper activityUserMapper;

	public List<ActivityUser> getUser(Map<String, Integer> map) {
		
		return activityUserMapper.getUser(map);
	}

	public int getCount(int aid) {
		
		return activityUserMapper.getCount(aid);
	}

	public void delAcUser(Map<String,Integer> map) throws ActivityUserException{
		
		activityUserMapper.delAcUser(map);
	}

	public void addAcUser(Map<String, Integer> map) throws ActivityUserException{
		
		activityUserMapper.addAcUser(map);
	}
	
}
