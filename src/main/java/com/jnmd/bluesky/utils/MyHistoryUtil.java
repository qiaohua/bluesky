package com.jnmd.bluesky.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MyHistoryUtil {
	public static String getValue(String url,String key){
		Properties prop = new Properties();
		try {
			//装载配置文件
			prop.load(new FileInputStream(new File(MyHistoryUtil.class.getResource("/").getPath()+"myHistory.properties")));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		//返回获取的值
		String property = prop.getProperty(key);
		if(property==null){
			property=url;
		}
		return property;
	}
}
