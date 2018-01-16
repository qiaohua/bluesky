package com.jnmd.bluesky.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jnmd.bluesky.domain.Questions;
import com.jnmd.bluesky.exception.myException;
import com.jnmd.bluesky.mapper.QuestionMapper;

@Service
@Transactional(propagation=Propagation.REQUIRED)
public class questionService {
	@Resource
	private QuestionMapper questionMapper;

	// 保存问题
	@Transactional(rollbackFor = myException.class)
	public void saveQuestions(Questions questions) {
		questionMapper.saveQuestion(questions);
	}
	//查找问题
	@Transactional(readOnly=true)
	public List<Questions> getQuestions() {
		return questionMapper.getQuestions();				
	}
	//删除问题
	@Transactional(rollbackFor = myException.class)
	public void deleteQuestions(int qid) {
		questionMapper.deleteQuestions(qid);				
	}
	//修改问题
	@Transactional(rollbackFor = myException.class)
	public void updateQuestions(Questions questions) {
		System.out.println(1);
		questionMapper.updataQuestions(questions);
		
	}
}
