package com.jnmd.bluesky.domain;

import java.util.List;

public class Photobook {
	private int pb_id;
	private String title;
	private String url;
	private int u_id;
	private List<Picture> imgs;

	public List<Picture> getImgs() {
		return imgs;
	}

	public void setImgs(List<Picture> imgs) {
		this.imgs = imgs;
	}

	public Photobook() {
		super();

	}

	public Photobook(String title, String url, int u_id) {
		super();
		this.title = title;
		this.url = url;
		this.u_id = u_id;
	}

	public Photobook(int pb_id, String title, String url, int u_id) {
		super();
		this.pb_id = pb_id;
		this.title = title;
		this.url = url;
		this.u_id = u_id;
	}

	public int getPb_id() {
		return pb_id;
	}

	public void setPb_id(int pb_id) {
		this.pb_id = pb_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	@Override
	public String toString() {
		/*return "Photobook [pb_id=" + pb_id + ", title=" + title + ", url=" + url + ", u_id=" + u_id + ", imgs=" + imgs
				+ "]";*/
		return url+imgs;
	}

}
