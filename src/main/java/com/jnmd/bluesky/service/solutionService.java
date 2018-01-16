package com.jnmd.bluesky.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jnmd.bluesky.domain.Solution;
import com.jnmd.bluesky.mapper.SolutionMapper;

@Service
@Transactional(propagation=Propagation.REQUIRED)
public class solutionService {
	@Resource
	private SolutionMapper solutionMapper;
	
	//保存回复
	public void saveSolution(Solution solution){
		solutionMapper.saveSolution(solution);
	}
	//删除回复
	public void deleteSolution(Solution solution){
		solutionMapper.deleteSolution(solution);
	}
	//查询回复(通过问题id)
	public List<Solution> getSolution(int qid){
		return solutionMapper.getSolution(qid);
	}
}
