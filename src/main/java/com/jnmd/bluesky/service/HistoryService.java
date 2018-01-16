package com.jnmd.bluesky.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jnmd.bluesky.domain.History;
import com.jnmd.bluesky.exception.HistoryExciption;
import com.jnmd.bluesky.mapper.HistoryMapper;

@Service
@Transactional
public class HistoryService {
	
	@Resource
	private HistoryMapper historyMapper;

	public List<History> getList() {
		List<History> list = historyMapper.getList();
		return list;
	}
	
	public void saveHistory(History history) throws HistoryExciption{
		historyMapper.saveHistory(history);
	}
	
	public void delByTime(Date time2)  throws HistoryExciption{
		historyMapper.delHistory(time2);
	}

	public void delById(int hid) throws HistoryExciption{
		historyMapper.delById(hid);
	}

	public void delHistoryAllNohis(int uid) throws HistoryExciption{
		// TODO Auto-generated method stub
		historyMapper.delHistoryAll(uid);
	}
	
}
