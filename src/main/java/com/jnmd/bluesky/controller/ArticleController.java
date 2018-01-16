package com.jnmd.bluesky.controller;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.jnmd.bluesky.domain.Article;
import com.jnmd.bluesky.domain.User;
import com.jnmd.bluesky.service.ArticleService;


@Controller
@Scope("prototype")
public class ArticleController {
	@Resource
	private ArticleService articleService;
	//查询所有的文章
	@RequestMapping("/register/getAllArticles")
	public ModelAndView getAllArticles(){
		ModelAndView mv = new ModelAndView();
		List<Article> articles = articleService.getAllArticles();
		mv.addObject("articles", articles);
		mv.setViewName("fabuwenzhang");
		return mv;
	}
	//查询一个用户的所有文章
	@RequestMapping("getArticles")
	public ModelAndView getArticles(HttpServletRequest request,HttpServletResponse response){
		HttpSession session = request.getSession();
		User user= (User)session.getAttribute("user");
		int u_id = user.getU_id();
		
		System.out.println(u_id);
		
		List<Article> articles = articleService.getArticles(u_id);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("dianjitouxiang");
		mv.addObject("articles", articles);
		return mv;
		
		
	};
	//查询一篇文章
	@RequestMapping("getArticle")
	public ModelAndView getArticle( Article article,HttpServletRequest request,HttpServletResponse response){
		String s = request.getParameter("aid");
		int a_id = Integer.parseInt(s);
		 article = articleService.getArticle(a_id);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("xiangxiNR");
		mv.addObject("article", article);
		return mv;
		
	};
	//添加文章
	@RequestMapping("/addArticle")
	public String addArticle(HttpServletRequest request, @RequestParam("file") 
	MultipartFile file,String title, String content, String illustrated,Date time,Article article){
		int u_id = 1;
		String path =  
				request.getSession().getServletContext().getRealPath("/img/xiangxiNR/"); 
				// 获取上传文件名称 
		String fileName = file.getOriginalFilename(); 
		illustrated ="img/xiangxiNR/"+ fileName;
		article.setIllustrated(illustrated);
		File saveFile = new File(path, illustrated); 

				try { 
				  file.transferTo(saveFile); 
				  System.out.println("=========>文件上传成功"); 
				} catch (IllegalStateException e) { 
				  e.printStackTrace(); 
				} catch (IOException e) { 
				  e.printStackTrace(); 
				}  
		time = new java.sql.Date(System.currentTimeMillis());
		article.setTime(time);
		System.out.println(time+"----------------------time");
		article.setTitle(title);
		article.setContent(content);
	//	article.setU_id(article.getU_id());
		article.setU_id(6);
		articleService.addArticle(article);
		
		return "forward:register/getAllArticles";	
	};
	//删除文章
	@RequestMapping("/deleteArticle")
	public String deleteArticle(Article article){
		articleService.deleteArticle(article.getA_id());
		return "forward:/WEB-INF/velocity/addArticle.vm";
	};
	//收藏
	@RequestMapping("updateCollect")
	public void updateCollect(HttpServletRequest request,HttpServletResponse response){
		String s = request.getParameter("collect");
		int collect = Integer.parseInt(s);
		String a = request.getParameter("a_id");
		int a_id = Integer.parseInt(a);
		System.out.println("收藏的文章为"+a_id);
		System.out.println(collect);
		collect = collect+1;
		System.out.println(collect);
		articleService.updateCollect(collect,a_id);
	};
	//评论
	@RequestMapping("/updateComment")
	public void updateComment(int a_comment){
		articleService.updateComment(a_comment);
	};
	//点赞
	@RequestMapping("updateLikes")
	public int likes(int like){
		return articleService.likes(like);
	}
	//转到发布文章页面
	@RequestMapping("publicArticlePage")
	public ModelAndView publicArticle(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("fabu1");
		return mv;
	}
}
