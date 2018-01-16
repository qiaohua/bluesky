package com.jnmd.bluesky.controller;

import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.jnmd.bluesky.domain.History;
import com.jnmd.bluesky.domain.User;
import com.jnmd.bluesky.exception.HistoryExciption;
import com.jnmd.bluesky.service.HistoryService;

@Controller
@Scope("prototype")
public class HistoryController {
	
	@Resource
	private HistoryService historyService;
	
	@RequestMapping("/myjiluNohis")
	public ModelAndView getList(ModelAndView mv,HttpServletRequest request,int isTF){
		/*
		 *代码替换 List<History> list= historyService.getList();
		 *
		 * HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		int uid = user.getUid();*/
//		List<History> list= historyService.getList(uid);
		
		/*
		 * 测试
		 * 
		 * */
		User user = new User(1, null, null, null, null, 0, 0, null, 0);
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		//测试代码结束
		List<History> list= historyService.getList();
		mv.setViewName("myjilu");
		mv.addObject("list",list);
		mv.addObject("isTF",isTF);
		
		return mv;
	}
	
	@RequestMapping("/delHistoryByIdNohis")
	public String delHistory(int hid) throws HistoryExciption{
		
		historyService.delById(hid);
		
		return "redirect:/myjiluNohis?isTF=0";
	}
	@RequestMapping("/delHistoryAllNohis")
	public String delHistoryAllNohis(int uid) throws HistoryExciption{
		
		historyService.delHistoryAllNohis(uid);
		return "redirect:/myjiluNohis?isTF=0";
	}
}
