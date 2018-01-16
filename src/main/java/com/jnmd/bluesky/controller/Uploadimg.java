package com.jnmd.bluesky.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class Uploadimg {
	@RequestMapping("/toFile2")
	public String toFileUpload2() {
		return "fileUpload2";
	}
	
	@RequestMapping("/threeFile")
	public String threeFileUpload(
			@RequestParam("file") CommonsMultipartFile files[],
			HttpServletRequest request, ModelMap model) {

		List<String> list = new ArrayList<String>();
		// 获得项目的路径
		ServletContext sc = request.getSession().getServletContext();
		// 上传位置
		String path = sc.getRealPath("/img") + "/"; // 设定文件保存的目录
		File f = new File(path);
		if (!f.exists())
			f.mkdirs();

		for (int i = 0; i < files.length; i++) {
			// 获得原始文件名
			String fileName = files[i].getOriginalFilename();
			System.out.println("原始文件名:" + fileName);
			// 新文件名
			String newFileName = UUID.randomUUID() + fileName;
			if (!files[i].isEmpty()) {
				try {
					FileOutputStream fos = new FileOutputStream(path
							+ newFileName);
					InputStream in = files[i].getInputStream();
					int b = 0;
					while ((b = in.read()) != -1) {
						fos.write(b);
					}
					fos.close();
					in.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("上传图片到:" + path + newFileName);
			list.add(path + newFileName);

		}
		// 保存文件地址，用于JSP页面回显
		model.addAttribute("fileList", list);
		return "fileUpload2";
	}
}
