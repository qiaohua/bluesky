package com.jnmd.bluesky.domain;

import java.util.Date;

public class Solution {
	private int sid;
	private Questions questions;
	private User user;
	private Date time;
	private String content;
	private int uid;
	private int qid;
	
	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public Solution() {
		super();
	}

	public Solution(Questions questions, User user, Date time, String content) {
		super();
		this.questions = questions;
		this.user = user;
		this.time = time;
		this.content = content;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public Questions getQuestions() {
		return questions;
	}

	public void setQuestions(Questions questions) {
		this.questions = questions;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Solution [time=" + time + ", content=" + content + ", uid=" + uid + "]";
	}


	
}
