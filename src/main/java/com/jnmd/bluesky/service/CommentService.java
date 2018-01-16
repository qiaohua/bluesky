package com.jnmd.bluesky.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jnmd.bluesky.domain.comment;
import com.jnmd.bluesky.domain.replyComment;
import com.jnmd.bluesky.mapper.CommentMapper;

@Service
public class CommentService {
	@Resource
	private CommentMapper commentMapper;
	
	public int setComment(comment c){
		System.out.println("进入comment service");
		return commentMapper.insertComment(c);
	}
	
	public int setReplyComment(replyComment rc){
		System.out.println("进入replycomment service");
		int rc_id = commentMapper.insertReplyComment(rc);
		System.out.println(rc_id);
		return rc_id;
	}
	public int deleteReplyComment(int del_rc){
		System.out.println("进入deleteReplyComment service");
		System.out.println("del_rc = " + del_rc);
		return commentMapper.deleteReplyComment(del_rc);
	}
	public int deleteComment(int del_co){
		System.out.println("进入deleteComment service");
		System.out.println(del_co);
		return commentMapper.deleteComment(del_co);
	}
	
	public List<comment> getComment(){
		return commentMapper.getComments();
	}
}
