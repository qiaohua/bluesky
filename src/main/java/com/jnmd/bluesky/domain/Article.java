package com.jnmd.bluesky.domain;
import java.sql.Date;
public class Article {
	private int a_id;
	private String title;
	private String content;
	private String illustrated;
	private Date time;
	private int u_id;
	private int collect;
	private int comment;
	private User user;
	private int like;
	
	public Article() {
	}
	
	public Article(int a_id, int collect) {
		super();
		this.a_id = a_id;
		this.collect = collect;
	}

	public Article(String title, String content, String illustrated, Date time, int u_id) {
		super();
		this.title = title;
		this.content = content;
		this.illustrated = illustrated;
		this.time = time;
		this.u_id = u_id;
	}
	public Article(int a_id, String title, String content, String illustrated, Date time, int u_id, int collect,
			int comment, User user) {
		super();
		this.a_id = a_id;
		this.title = title;
		this.content = content;
		this.illustrated = illustrated;
		this.time = time;
		this.u_id = u_id;
		this.collect = collect;
		this.comment = comment;
		this.user = user;
	}
	
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getIllustrated() {
		return illustrated;
	}
	public void setIllustrated(String illustrated) {
		this.illustrated = illustrated;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public int getCollect() {
		return collect;
	}
	public void setCollect(int collect) {
		this.collect = collect;
	}
	public int getComment() {
		return comment;
	}
	public void setComment(int comment) {
		this.comment = comment;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Article [a_id=" + a_id + ", title=" + title + ", content=" + content + ", illustrated=" + illustrated
				+ ", time=" + time + ", u_id=" + u_id + ", collect=" + collect + ", comment=" + comment + ", user="
				+ user + "]";
	}
	
}
