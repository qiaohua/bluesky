package com.jnmd.bluesky.domain;

import java.util.List;

public class camera {
	private int ca_id;
	private String photodescribe;
	private int collectNumber;
	private String comment;
	private int pb_id;
	private Photobook p;
	private List<Photobook> photobook;
	public int getCa_id() {
		return ca_id;
	}
	public void setCa_id(int ca_id) {
		this.ca_id = ca_id;
	}
	public String getPhotodescribe() {
		return photodescribe;
	}
	public void setPhotodescribe(String photodescribe) {
		this.photodescribe = photodescribe;
	}
	public int getCollectNumber() {
		return collectNumber;
	}
	public void setCollectNumber(int collectNumber) {
		this.collectNumber = collectNumber;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getPb_id() {
		return pb_id;
	}
	public void setPb_id(int pb_id) {
		this.pb_id = pb_id;
	}
	public Photobook getP() {
		return p;
	}
	public void setP(Photobook p) {
		this.p = p;
	}
	public List<Photobook> getPhotobook() {
		return photobook;
	}
	public void setPhotobook(List<Photobook> photobook) {
		this.photobook = photobook;
	}
	@Override
	public String toString() {
		return "camera [ca_id=" + ca_id + ", photodescribe=" + photodescribe + ", collectNumber=" + collectNumber
				+ ", comment=" + comment + ", pb_id=" + pb_id + ", p=" + p + ", photobook=" + photobook + "]";
	}
	public camera(int ca_id, String photodescribe, int collectNumber, String comment, int pb_id,
			com.jnmd.bluesky.domain.Photobook p, List<com.jnmd.bluesky.domain.Photobook> photobook) {
		super();
		this.ca_id = ca_id;
		this.photodescribe = photodescribe;
		this.collectNumber = collectNumber;
		this.comment = comment;
		this.pb_id = pb_id;
		this.p = p;
		this.photobook = photobook;
	}
	public camera() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
