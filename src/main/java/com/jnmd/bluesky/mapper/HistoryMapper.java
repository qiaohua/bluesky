package com.jnmd.bluesky.mapper;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jnmd.bluesky.domain.History;

@Repository
public interface HistoryMapper {
	
	public List<History> getList();

	public void saveHistory(History history);

	public void delHistory(Date time2);

	public void delById(int hid);

	public void delHistoryAll(int uid);
}
