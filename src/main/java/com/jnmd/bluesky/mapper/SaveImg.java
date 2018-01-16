package com.jnmd.bluesky.mapper;

import org.springframework.stereotype.Repository;

import com.jnmd.bluesky.domain.Photobook;
import com.jnmd.bluesky.domain.Picture;

@Repository
public interface SaveImg {
	
	public int savephoto(Photobook photobook);
	public void savepicture(Picture picture);
}
