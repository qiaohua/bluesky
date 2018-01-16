package com.jnmd.bluesky.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jnmd.bluesky.domain.Questions;

@Repository
public interface QuestionMapper {
	//保存问题
	public void saveQuestion(Questions questions);
	//查询问题
	public List<Questions> getQuestions();
	//删除问题
	public void deleteQuestions(int qid);
	//修改问题（收藏数+1）
	public void updataQuestions(Questions questions);
}
