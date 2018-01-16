package com.jnmd.bluesky.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jnmd.bluesky.domain.Jump;
import com.jnmd.bluesky.mapper.JumpMapper;

@Service
public class JumpService {

	@Resource 
	private JumpMapper jumpMapper;
	
	public List<Jump> getjumps(){
		return jumpMapper.getJump();
	}
}
