package com.jnmd.bluesky.domain;

public class T_type {
	private int ty_id;
	private String category;
	
	public T_type() {
		super();
	}

	public T_type(int ty_id, String category) {
		super();
		this.ty_id = ty_id;
		this.category = category;
	}

	public int getTy_id() {
		return ty_id;
	}

	public void setTy_id(int ty_id) {
		this.ty_id = ty_id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "T_type [ty_id=" + ty_id + ", category=" + category + "]";
	}

	
	
}
