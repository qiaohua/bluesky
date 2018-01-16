package com.jnmd.bluesky.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GetTimeUtil {
	
	public static Date getTime(Date time){
		
		Calendar c = new GregorianCalendar();
		c.setTime(time);
		//取当前时间两个小时前的时间
		c.add(Calendar.SECOND, -7200);
		//取当前时间的三天前时间
		//c.add(Calendar.DAY_OF_MONTH, -3);
		Date reTime = c.getTime();
		
		return reTime;
	}
}
