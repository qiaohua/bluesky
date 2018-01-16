package com.jnmd.bluesky.domain;

import java.util.Date;
import java.util.List;

public class Questions {
	private int qid;
	private String intro;
	private Date time;
	private User user;
	private int uid;
	private List<Solution> solutions;
	private int amount;
	public Questions() {
		super();
	}
	
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public Questions(String intro, Date time, User user,int amount) {
		super();
		this.amount=amount;
		this.intro = intro;
		this.time = time;
		this.user = user;
	}
	public Questions(String intro, Date time, User user, List<Solution> solutions, int amount) {
		super();
		this.intro = intro;
		this.time = time;
		this.user = user;
		this.solutions = solutions;
		this.amount = amount;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Solution> getSolutions() {
		return solutions;
	}
	public void setSolutions(List<Solution> solutions) {
		this.solutions = solutions;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Questions [qid=" + qid + ", intro=" + intro + ", time=" + time + ", user=" + user + ", solutions="
				+ solutions + ", amount=" + amount + "]";
	}
	
}
