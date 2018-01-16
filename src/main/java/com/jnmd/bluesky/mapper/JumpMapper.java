package com.jnmd.bluesky.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jnmd.bluesky.domain.Jump;

@Repository
public interface JumpMapper {
	
	public List<Jump> getJump();
}
