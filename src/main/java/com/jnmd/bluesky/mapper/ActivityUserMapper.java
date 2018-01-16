package com.jnmd.bluesky.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.jnmd.bluesky.domain.ActivityUser;

@Repository
public interface ActivityUserMapper {

	public int getCount(int aid);

	public List<ActivityUser> getUser(Map<String, Integer> map);

	public void delAcUser(Map<String, Integer> map);

	public void addAcUser(Map<String, Integer> map);

}
