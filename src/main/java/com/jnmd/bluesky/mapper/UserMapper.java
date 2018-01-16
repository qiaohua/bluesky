package com.jnmd.bluesky.mapper;

import org.springframework.stereotype.Repository;

import com.jnmd.bluesky.domain.User;



@Repository
public interface UserMapper {
	
	public User getUserByMphone(String mphone);
	
	public void saveUser(User user);
	
	public void updateUser(User user);
	
	public User getUser(int uid);
}
