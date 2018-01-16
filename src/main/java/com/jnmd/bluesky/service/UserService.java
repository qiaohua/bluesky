package com.jnmd.bluesky.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jnmd.bluesky.domain.User;
import com.jnmd.bluesky.mapper.UserMapper;

@Service
@Transactional(propagation=Propagation.REQUIRED)
public class UserService {
	@Resource
	private UserMapper userMapper;
	
	public User getUserByMphone(String mphone){
		return userMapper.getUserByMphone(mphone);
	};
	
	
	public void saveUser(User user){
		userMapper.saveUser(user);
	};
	
	public void updateUser(User user){
		userMapper.updateUser(user);
	};
	
	public User getUser(int uid){
		
		return userMapper.getUser(uid);
	};
}
