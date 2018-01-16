package com.jnmd.bluesky.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.jnmd.bluesky.domain.Share;
import com.jnmd.bluesky.exception.ShareExciption;
import com.jnmd.bluesky.service.ShareService;

@Controller
@Scope("prototype")
@RequestMapping("/register")
public class ShareController {
	@Resource
	private ShareService shareService;
	
	@RequestMapping("/shareNohis")
	public void share(HttpServletResponse response,int uid,int aid) throws ShareExciption{
		int flag=0;
		Date time = new Date();
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("uid", uid);
		map.put("aid", aid);
		map.put("time", time);
		Share share=shareService.getShare(map);
		if(share==null){
			shareService.saveShare(map);
		}else{
			flag=1;
		}
		String str = JSON.toJSONString(flag);
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			pw.write(str);
			pw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			pw.close();
		}
	}
	
	@RequestMapping("shareListNohis")
	public void shareList(HttpServletResponse response){
		List<Share> list = shareService.getAcList();
		String str = JSON.toJSONString(list);
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			pw.write(str);
			pw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			pw.close();
		}
	}
}
