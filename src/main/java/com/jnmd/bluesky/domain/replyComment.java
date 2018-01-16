package com.jnmd.bluesky.domain;

import java.sql.Date;

public class replyComment {

	
	private int rc_id;
	private int co_id;
	private int rc_rc_id;
	private int u_id;
	private User user;
	private String time;
	private String content;
	public replyComment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getRc_id() {
		return rc_id;
	}
	public void setRc_id(int rc_id) {
		this.rc_id = rc_id;
	}
	public int getCo_id() {
		return co_id;
	}
	public void setCo_id(int co_id) {
		this.co_id = co_id;
	}
	public int getRc_rc_id() {
		return rc_rc_id;
	}
	public void setRc_rc_id(int rc_rc_id) {
		this.rc_rc_id = rc_rc_id;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public replyComment(int rc_id, int co_id, int rc_rc_id, int u_id, String time, String content) {
		super();
		this.rc_id = rc_id;
		this.co_id = co_id;
		this.rc_rc_id = rc_rc_id;
		this.u_id = u_id;
		this.time = time;
		this.content = content;
	}
	public replyComment(int co_id, int rc_rc_id, int u_id, String time, String content) {
		super();
		this.co_id = co_id;
		this.rc_rc_id = rc_rc_id;
		this.u_id = u_id;
		this.time = time;
		this.content = content;
	}
	

	public replyComment(int rc_id,  int rc_rc_id, int u_id, User user, String time, String content) {
		super();
		this.rc_id = rc_id;
		this.rc_rc_id = rc_rc_id;
		this.u_id = u_id;
		this.user = user;
		this.time = time;
		this.content = content;
	}
	@Override
	public String toString() {
		return "replyComment [rc_id=" + rc_id + ", co_id=" + co_id + ", rc_rc_id=" + rc_rc_id + ", u_id=" + u_id
				+ ", time=" + time + ", content=" + content + "]";
	}

	
}
