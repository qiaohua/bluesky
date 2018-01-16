package com.jnmd.bluesky.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jnmd.bluesky.domain.Technology;
@Repository
public interface TechnologyMapper {
	public List<Technology> AllTec();

	public void insertT(Technology yui);
}
