package com.jnmd.bluesky.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jnmd.bluesky.domain.comment;
import com.jnmd.bluesky.domain.replyComment;

@Repository
public interface CommentMapper {
	public int insertComment(comment c);
	public int insertReplyComment(replyComment rc);
	public int deleteComment(int del_co);
	public int deleteReplyComment(int del_rc);
	public List<comment> getComments();
}
