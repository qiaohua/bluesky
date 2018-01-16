package com.jnmd.bluesky.service;

import java.sql.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jnmd.bluesky.domain.Article;
import com.jnmd.bluesky.exception.ArticleException;
import com.jnmd.bluesky.mapper.ArticleMapper;


@Service
public class ArticleService {
	@Resource
	private ArticleMapper articleMapper;
	//查询所有用户的文章
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	public List<Article> getAllArticles(){
		return articleMapper.getAllArticles();
	}
	//查询一个用户的所有文章
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	public List<Article> getArticles(int u_id){
		return articleMapper.getArticles(u_id);
		
	};
	//查询一篇文章
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	public Article getArticle(int a_id){
		return articleMapper.getArticle(a_id);
		
	};
	//添加文章
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=ArticleException.class)
	public void addArticle(Article article){
		articleMapper.addArticle(article);
		System.out.println(article);
	};
	//删除文章
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=ArticleException.class)
	public void deleteArticle(int a_id){
		articleMapper.deleteArticle(a_id);
	};
	//收藏
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=ArticleException.class)
	public void updateCollect(int collect,int a_id){
		System.out.println("service"+collect+"/t"+a_id);
		articleMapper.updateCollect(collect,a_id);
	};
	//评论
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=ArticleException.class)
	public void updateComment(int a_comment){
		articleMapper.updateComment(a_comment);
	};
	//点赞
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=ArticleException.class)
	public int likes(int like){
		return articleMapper.likes(like);
		
	}
}
