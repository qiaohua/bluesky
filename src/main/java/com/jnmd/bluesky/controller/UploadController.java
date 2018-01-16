package com.jnmd.bluesky.controller;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.jnmd.bluesky.domain.Photobook;
import com.jnmd.bluesky.domain.Picture;
import com.jnmd.bluesky.service.SaveImgservice;

@Controller
@Scope("prototype")
public class UploadController {
	
	@Resource
	private SaveImgservice saveImgservice;
	//int u_id = 1;
	
	//设置上传图片路径
	//private String path = "upload/"+u_id+"/"+"我的相册/";
	/*@RequestMapping("/upload")
	public String uploadimg(HttpServletRequest request, @RequestParam("file")MultipartFile file){
		//System.out.println(123456);
		//获取上传图片的名字
		String fileName = file.getOriginalFilename();
		//System.out.println("fileName = " + fileName);
		//新建文件
		File save = new File(path, fileName);
		
		try {
			// 直接将文件保存在指定的目录中
			file.transferTo(save);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//返回视图
		return "datu";
	}*/

	
	
	//新建文件夹  传入创建的地址
	public Boolean createFolder(String path){
		File file = null;
		try {
			//创建文件夹，判断是否存在
			file = new File(path);
			if (!file.exists()) {
				return file.mkdirs();
			}
			else{
				return false;
			}
		} catch (Exception e) {
		} finally {
			file = null;
		}
		return false;
	}
	
	/*@RequestMapping("uploadController")
	public void uploadFile(HttpServletRequest request, @RequestParam("file")MultipartFile file){
		String path = 
				request.getSession().getServletContext().getRealPath("/upload");
		
		String fileName = file.getOriginalFilename();
		//System.out.println("fileName = " + fileName);
		
		File save = new File(path, fileName);
		
		try {
			// 直接将文件保存在指定的目录中
			file.transferTo(save);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}*/
	
	
	//上传图片
	 @RequestMapping("springUpload")
	    public String  springUpload(HttpSession session, HttpServletRequest request) throws IllegalStateException, IOException
	    {
		 int u_id = (Integer) session.getAttribute("u_id");
		 System.out.println(u_id+"=-=-=-=-=-=-=-=-=-=-=");
		 Photobook photobook =null;
		 Picture picture = null;
		 //接收前台传来的参数，是否公开
		String ispublic = request.getParameter("private_input");
		 long  startTime=System.currentTimeMillis();
	         //将当前上下文初始化给  CommonsMutipartResolver （多部分解析器）
	        CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver(
	                request.getSession().getServletContext());
	        //检查form中是否有enctype="multipart/form-data"
	        if(multipartResolver.isMultipart(request))
	        {
	            //将request变成多部分request
	            MultipartHttpServletRequest multiRequest=(MultipartHttpServletRequest)request;
	           //获取multiRequest 中所有的文件名
	            Iterator iter=multiRequest.getFileNames();
	             
	            while(iter.hasNext())
	            {
	                //一次遍历所有文件
	                MultipartFile file=multiRequest.getFile(iter.next().toString());
	                if(file!=null)
	                {	
	                    String path=request.getServletContext().getRealPath("/upload/"+u_id+"/我的相册/"+file.getOriginalFilename());
	                    createFolder(path); 
	                    //System.out.println(path+"+++++++++++++++");
	                    //上传
	                    file.transferTo(new File(path));
	                    //String url ="upload/"+u_id+"/我的相册";
	                    String url ="upload/"+u_id+"/我的相册";
	                    String img_name = file.getOriginalFilename();
	                    String title = "我的相册";
	                    photobook = new Photobook(title, url, u_id);
	                   saveImgservice.savephoto(photobook);
	                   picture = new Picture(img_name,photobook.getPb_id(), ispublic);
	                   saveImgservice.savepicture(picture);
	                }
	                 
	            }
	           
	        }
	       return "datu";
	    //return mv; 
	    }
	
}
