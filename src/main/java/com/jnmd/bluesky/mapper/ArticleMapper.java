package com.jnmd.bluesky.mapper;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jnmd.bluesky.domain.Article;
@Repository
public interface ArticleMapper {
	//查询所有文章
	public List<Article> getAllArticles();
	//查询一个用户的所有文章
	public List<Article> getArticles(int u_id);
	//查询一篇文章
	public Article getArticle(int a_id);
	//添加文章
	public void addArticle(Article article);
	//删除文章
	public void deleteArticle(int a_id);
	//收藏
	public void updateCollect(int collect,int a_id);
	//评论
	public void updateComment(int comment);
	//点赞
	public int likes(int like);
	//根据用户id查询到用户的昵称
	public String nickName(int u_id);
}

