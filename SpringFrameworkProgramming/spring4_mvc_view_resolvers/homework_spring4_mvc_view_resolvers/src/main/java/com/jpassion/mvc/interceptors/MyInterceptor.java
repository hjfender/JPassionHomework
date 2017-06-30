package com.jpassion.mvc.interceptors;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor {

	private static final Logger logger = LoggerFactory.getLogger(MyInterceptor.class);
	
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// Nothing TODO
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// Nothing TODO
		
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		Calendar now = Calendar.getInstance();
		if(now.get(Calendar.HOUR_OF_DAY) < 9 || now.get(Calendar.HOUR_OF_DAY)>16){
			logger.info("Request DENIED: request made out of business hours.");
			return false;
		} else {
			logger.info("Request ACCEPTED: request made during business hours.");
			return true;
		}
	}

}
