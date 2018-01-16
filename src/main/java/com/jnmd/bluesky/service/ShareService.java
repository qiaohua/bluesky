package com.jnmd.bluesky.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jnmd.bluesky.domain.Share;
import com.jnmd.bluesky.exception.ShareExciption;
import com.jnmd.bluesky.mapper.ShareMapper;

@Service
@Transactional
public class ShareService {
	
	@Resource
	private ShareMapper shareMapper;

	public int saveShare(Map<String, Object> map) throws ShareExciption{
		return shareMapper.saveShare(map);
	}

	public Share getShare(Map<String, Object> map) {
		return shareMapper.getShare(map);
	}

	public List<Share> getAcList() {
		// TODO Auto-generated method stub
		return shareMapper.getList();
	}
	
	
}
