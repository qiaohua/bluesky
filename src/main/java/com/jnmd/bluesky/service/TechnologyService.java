package com.jnmd.bluesky.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jnmd.bluesky.domain.Technology;
import com.jnmd.bluesky.domain.User;
import com.jnmd.bluesky.mapper.TechnologyMapper;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class TechnologyService {
	@Resource
	private TechnologyMapper technologyMapper;

	@Transactional(propagation = Propagation.SUPPORTS)
	public List<Technology> AllTec() {

		return technologyMapper.AllTec();
	}

	public void insertT(Technology yui) {
		technologyMapper.insertT(yui);

	}
}
