package com.jnmd.bluesky.domain;

import java.util.Date;

public class History {
	private int hi_id;
	private String url;
	private String title;
	private Date time;
	private int u_id;
	public int getHi_id() {
		return hi_id;
	}
	public void setHi_id(int hi_id) {
		this.hi_id = hi_id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public History(int hi_id, String url, String title, Date time, int u_id) {
		super();
		this.hi_id = hi_id;
		this.url = url;
		this.title = title;
		this.time = time;
		this.u_id = u_id;
	}
	public History(String url, String title, Date time, int u_id) {
		super();
		this.url = url;
		this.title = title;
		this.time = time;
		this.u_id = u_id;
	}
	public History() {
		super();
	}
	@Override
	public String toString() {
		return "History [hi_id=" + hi_id + ", url=" + url + ", title=" + title + ", time=" + time + ", u_id=" + u_id
				+ "]";
	}
	
	
}
