package com.jnmd.bluesky.domain;

import java.util.Date;

public class Share {
	private int sid;
	private User user;
	private Activity activity;
	private Date time;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Activity getActivity() {
		return activity;
	}
	public void setActivity(Activity activity) {
		this.activity = activity;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Share(int sid, User user, Activity activity, Date time) {
		super();
		this.sid = sid;
		this.user = user;
		this.activity = activity;
		this.time = time;
	}
	public Share(User user, Activity activity, Date time) {
		super();
		this.user = user;
		this.activity = activity;
		this.time = time;
	}
	public Share() {
		super();
	}
	@Override
	public String toString() {
		return "Share [sid=" + sid + ", user=" + user + ", activity=" + activity + ", time=" + time + "]";
	}
	
}
