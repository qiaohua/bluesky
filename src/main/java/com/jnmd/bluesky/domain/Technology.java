package com.jnmd.bluesky.domain;

import java.sql.Date;

public class Technology {
	private int te_id;
	private String title;
	private String content;
	private Date time;
	private User user;
	private int amount;
	public int getTe_id() {
		return te_id;
	}
	public void setTe_id(int te_id) {
		this.te_id = te_id;
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
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Technology(int te_id, String title, String content, Date time, int amount) {
		super();
		this.te_id = te_id;
		this.title = title;
		this.content = content;
		this.time = time;
		this.amount = amount;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public Technology() {
		
	}

}
