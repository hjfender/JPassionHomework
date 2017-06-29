package com.jpassion.mvc.interceptors;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor {

	private static final Logger logger = LoggerFactory.getLogger(MyInterceptor.class);

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		Enumeration headerInfo = arg0.getHeaderNames();
		while (headerInfo.hasMoreElements()) {
			String element = (String) headerInfo.nextElement();
			logger.info("Contents of the Accept request header: " + element + " - " + arg0.getHeader(element));
		}
		logger.info("Contents of Content-Type response header: " + arg1.getContentType());
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		return true;
	}

}
