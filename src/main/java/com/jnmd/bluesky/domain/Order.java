package com.jnmd.bluesky.domain;

import java.util.Date;

public class Order {
	
	private int o_id;
	private String orderCode;//工单编号
	private int u_id;//所属用户ID
	private String title;//工单标题
	private int ty_id;//工单类型id
	private String money;//金额
	private String time;
	private String intro;//描述
	
	private User user;
	private T_type t_type;
	public Order() {
		super();
	}
	public Order(String orderCode, int u_id, String title, int ty_id, String money, String time, String intro) {
		super();
		this.orderCode = orderCode;
		this.u_id = u_id;
		this.title = title;
		this.ty_id = ty_id;
		this.money = money;
		this.time = time;
		this.intro = intro;
	}
	public Order(String orderCode, int u_id, String title, int ty_id, String money, String time, String intro,
			User user, T_type t_type) {
		super();
		this.orderCode = orderCode;
		this.u_id = u_id;
		this.title = title;
		this.ty_id = ty_id;
		this.money = money;
		this.time = time;
		this.intro = intro;
		this.user = user;
		this.t_type = t_type;
	}
	public Order(int o_id, String orderCode, int u_id, String title, int ty_id, String money, String time, String intro,
			User user, T_type t_type) {
		super();
		this.o_id = o_id;
		this.orderCode = orderCode;
		this.u_id = u_id;
		this.title = title;
		this.ty_id = ty_id;
		this.money = money;
		this.time = time;
		this.intro = intro;
		this.user = user;
		this.t_type = t_type;
	}
	public int getO_id() {
		return o_id;
	}
	public void setO_id(int o_id) {
		this.o_id = o_id;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getTy_id() {
		return ty_id;
	}
	public void setTy_id(int ty_id) {
		this.ty_id = ty_id;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public T_type getT_type() {
		return t_type;
	}
	public void setT_type(T_type t_type) {
		this.t_type = t_type;
	}
	@Override
	public String toString() {
		return "Order [o_id=" + o_id + ", orderCode=" + orderCode + ", u_id=" + u_id + ", title=" + title + ", ty_id="
				+ ty_id + ", money=" + money + ", time=" + time + ", intro=" + intro + ", user=" + user + ", t_type="
				+ t_type + "]";
	}
	
	

	
	
}
