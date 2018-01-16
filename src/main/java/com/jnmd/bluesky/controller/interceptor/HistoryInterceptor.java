package com.jnmd.bluesky.controller.interceptor;


import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.jnmd.bluesky.domain.History;
import com.jnmd.bluesky.domain.User;
import com.jnmd.bluesky.service.HistoryService;
import com.jnmd.bluesky.utils.GetTimeUtil;
import com.jnmd.bluesky.utils.MyHistoryUtil;

public class HistoryInterceptor extends HandlerInterceptorAdapter{
	@Resource
	private HistoryService historyService;
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
			String url = request.getRequestURL().toString();
			String uri = request.getRequestURI().toString();
			String title = MyHistoryUtil.getValue(url,uri);
			url = url+"?"+request.getQueryString();
			Date time = new Date();
			//int u_id=1;
			/*
			 *代码替换History history = new History(url, title, time, u_id);
			 * 
			 * HttpSession session = request.getSession();
			User user = (User) session.getAttribute("user");
			if(user!=null){
				int u_id=user.getUid();
				History history = new History(url, title, time, u_id);
				historyService.saveHistory(history);
			}
			*/
			 HttpSession session = request.getSession();
				User user = (User) session.getAttribute("user");
				if(user!=null){
					int u_id=user.getU_id();
					History history = new History(url, title, time, u_id);
					historyService.saveHistory(history);
				}
				
			/*History history = new History(url, title, time, u_id);
			historyService.saveHistory(history);*/
			Date time2 = GetTimeUtil.getTime(time);
			historyService.delByTime(time2);
			
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}

	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterConcurrentHandlingStarted(request, response, handler);
	}
	
	
}
