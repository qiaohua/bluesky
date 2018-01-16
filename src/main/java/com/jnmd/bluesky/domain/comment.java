package com.jnmd.bluesky.domain;

import java.util.Date;
import java.util.List;

public class comment {
	/*
	 *   `co_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_id` int(11) NOT NULL,
  `co_prw_id` varchar(255) NOT NULL,		-- 可以代表摄像/文章/工单的主键ID值
  `co_content` varchar(255) NOT NULL,	-- 评论内容
  `co_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP,		-- 评论时间	
  `co_mark` int(11) NOT NULL,		-- 标识(1:摄像, 2:文章, 3:工单)
  */

	private int co_id;
	private User user;
	private int u_id;
	private String co_content;
	private int co_mark;
	private String co_prw_id;
	private String co_time;
	private List<replyComment> rc_list;
	
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<replyComment> getRc_list() {
		return rc_list;
	}
	public void setRc_list(List<replyComment> rc_list) {
		this.rc_list = rc_list;
	}
	public int getCo_id() {
		return co_id;
	}
	public void setCo_id(int co_id) {
		this.co_id = co_id;
	}
	public String getCo_content() {
		return co_content;
	}
	public void setCo_content(String co_content) {
		this.co_content = co_content;
	}
	public int getCo_mark() {
		return co_mark;
	}
	public void setCo_mark(int co_mark) {
		this.co_mark = co_mark;
	}
	public String getCo_prw_id() {
		return co_prw_id;
	}
	public void setCo_prw_id(String co_prw_id) {
		this.co_prw_id = co_prw_id;
	}
	public String getCo_time() {
		return co_time;
	}
	public void setCo_time(String co_time) {
		this.co_time = co_time;
	}
	public comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public comment(int co_id, int u_id, String co_content, int co_mark, String co_prw_id, String co_time) {
		super();
		this.co_id = co_id;
		this.co_content = co_content;
		this.co_mark = co_mark;
		this.co_prw_id = co_prw_id;
		this.co_time = co_time;
	}

	
	public comment(int u_id, String co_content, int co_mark, String co_prw_id, String co_time) {
		super();
		this.co_content = co_content;
		this.co_mark = co_mark;
		this.co_prw_id = co_prw_id;
		this.co_time = co_time;
	}
	@Override
	public String toString() {
		return "comment [co_id=" + co_id +  ", co_content=" + co_content + ", co_mark=" + co_mark
				+ ", co_prw_id=" + co_prw_id + ", co_time=" + co_time + "]";
	}
	public comment(int co_id, int u_id, String co_content, String co_time, List<replyComment> rc_list) {
		super();
		this.co_id = co_id;
		this.co_content = co_content;
		this.co_time = co_time;
		this.rc_list = rc_list;
	}
	
	
	
	
}