package com.jnmd.bluesky.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jnmd.bluesky.domain.Questions;
import com.jnmd.bluesky.domain.User;
import com.jnmd.bluesky.service.questionService;

@Controller
@Scope("prototype")
public class questionController {
	@Resource
	private questionService qservice;
	//查询所有
	@RequestMapping("/register/qqq")
	public ModelAndView getQuestions(HttpSession session, ModelAndView mv){
		List<Questions> Questions= qservice.getQuestions();
		mv.setViewName("xianshi");
		mv.addObject("questionsList", Questions);
		//获取作用域中的user
		User user = (User)session.getAttribute("user");
		System.out.println(user+"==============user==========");
		//User user = new User(1,"q", "1", "1", "1", 1, 12, "北京", 1);
		//发给视图
		mv.addObject("user",user);
		return mv;
	}
	@RequestMapping("/tichu")
	public ModelAndView tQuestions(ModelAndView mv){
		mv.setViewName("tiwen");
		return mv;
	}
	//保存问题
	@RequestMapping("register/save")
	@ResponseBody
	public void saveQuestions(HttpSession session, String content,Date date){
		System.out.println(content+"----intro");
		//获取对象
	//	User user = new User(1,"q", "1", "1", "1", 1, 12, "北京", 1);
		User user = (User)session.getAttribute("user");
		System.out.println(user+"--------------user---------------");
		//获取时间
		Questions questions1 = new Questions(content, date, user,23);
		System.out.println(questions1+"---------question1");
		qservice.saveQuestions(questions1);
		//return "redirect:qqq";
	}
	//删除问题
	@RequestMapping("/delete")
	@ResponseBody
	public String deleteQuestions(int uid,int qid){
		//获取对象的id，判断与问题的uid是否相等
		if (uid==1) {
			qservice.deleteQuestions(qid);
			return "sc";
		}
		return "err";
	}
	//修改问题
	@RequestMapping("/updata")
	public ModelAndView updataQuestions(ModelAndView mv){
		Questions questions = new Questions();
		//获取问题对象id
		questions.setQid(1);
		//获取收藏数
		questions.setAmount(12);		
		qservice.updateQuestions(questions);
		mv.setViewName("aaaaa");
		return mv;
	}
}
