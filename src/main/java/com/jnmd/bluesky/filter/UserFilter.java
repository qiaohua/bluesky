package com.jnmd.bluesky.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jnmd.bluesky.domain.User;

@WebFilter(filterName="UserFilter",urlPatterns={"/register/*"})
public class UserFilter implements Filter {

	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		HttpSession session = req.getSession();
		
		User user = (User)session.getAttribute("user");
		
		String url = req.getRequestURI();
		System.out.println(url);
		String uri = url.substring(8);
		
		System.out.println(uri);
		//   /bluesky/sheyingZS
		if(uri.lastIndexOf(".css") != -1|| uri.lastIndexOf(".js") != -1||uri.lastIndexOf(".png") != -1){
			uri=uri.substring(9);
			
	
			request.getRequestDispatcher(uri).forward(request, response);
			
		}else if(uri.contains("denglu")){
			request.getRequestDispatcher("/denglu").forward(request, response);
			
		}else{
			if(user == null){
				
			
				System.out.println("没有登录");
				request.getRequestDispatcher("/WEB-INF/velocity/denglu.vm").forward(request, response);
				session.setAttribute("uri", uri);
			}else{
				System.out.println("登录成功");
				chain.doFilter(request, response);
			}
			
		}
		
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
