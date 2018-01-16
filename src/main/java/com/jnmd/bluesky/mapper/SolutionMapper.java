package com.jnmd.bluesky.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jnmd.bluesky.domain.Solution;

@Repository
public interface SolutionMapper {
	//保存回复
	public void saveSolution(Solution solution);
	//删除回复
	public void deleteSolution(Solution solution);
	//查询回复
	public List<Solution> getSolution(int qid);
}
