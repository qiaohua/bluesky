package com.jnmd.bluesky.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jnmd.bluesky.domain.Questions;
import com.jnmd.bluesky.domain.Solution;
import com.jnmd.bluesky.domain.User;
import com.jnmd.bluesky.service.solutionService;

@Controller
@Scope("prototype")
public class solutionController {
	@Resource
	private solutionService service;
	//查询
	@RequestMapping("/zzz")
	public ModelAndView getSolution(ModelAndView mv){
		List<Solution> list = service.getSolution(1);
		mv.setViewName("aaaaa");
		mv.addObject("slist", list);
		return mv;
	}
	//保存解答
	@RequestMapping("/vvv")
	@ResponseBody
	public int saveSolution(int qid,int uid,String nr,Date tm){
		//获取问题id
		Questions questions = new Questions();
		questions.setQid(qid);
		//获取解答用户id
		User user  = new User();
		user.setUid(uid);
		Solution solution = new Solution(questions, user, tm, nr);
		service.saveSolution(solution);
		return solution.getSid();
	}
	//删除问题解答（只能删除自己）
	@RequestMapping("/xxx")
	@ResponseBody
	public void deleteSolution(int sid,int uid){
		
		Solution solution = new Solution();
		solution.setSid(sid);
		User user  = new User();
		user.setUid(uid);
		solution.setUser(user);
		//获取对象的id
		//判断与问题的uid是否相等
		if (uid==1) {
			service.deleteSolution(solution);
		}
	}
}
