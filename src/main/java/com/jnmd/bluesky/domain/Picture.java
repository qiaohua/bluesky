package com.jnmd.bluesky.domain;

public class Picture {
	private int p_id;
	private String img_name;
	private int pb_id;
	private String ispublic;
	
	
	public Picture() {
		super();
	}
	public Picture(int p_id, String img_name, int pb_id, String ispublic) {
		super();
		this.p_id = p_id;
		this.img_name = img_name;
		this.pb_id = pb_id;
		this.ispublic = ispublic;
	}
	public Picture(String img_name, int pb_id, String ispublic) {
		super();
		
		this.img_name = img_name;
		this.pb_id = pb_id;
		this.ispublic = ispublic;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getImg_name() {
		return img_name;
	}
	public void setImg_name(String img_name) {
		this.img_name = img_name;
	}
	public void setName(String name) {
		this.img_name = name;
	}
	public int getPbid() {
		return pb_id;
	}
	public void setPbid(int pb_id) {
		this.pb_id = pb_id;
	}
	public String getIspublic() {
		return ispublic;
	}
	public void setIspublic(String ispublic) {
		this.ispublic = ispublic;
	}
	@Override
	public String toString() {
		return img_name;
		//return "Picture [p_id=" + p_id + ", name=" + img_name + ", pbid=" + pb_id + ", ispublic=" + ispublic + "]";
	}
	
}
