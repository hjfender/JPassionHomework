package com.jpassion.mvc.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	@RequestMapping(value="/morning", method = RequestMethod.GET)
	public ModelAndView morning(Locale locale){
		ModelAndView modelAndView = new ModelAndView("morning");
		
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMMMMM d hh:mm:ss z yyyy", locale);
		
		String formattedDate = dateFormat.format(date);
		
		modelAndView.addObject("morning", "Good morning! The current time is " + formattedDate);
		return modelAndView;
	}
	
	@RequestMapping(value="/afternoon", method = RequestMethod.GET)
	public ModelAndView afternoon(Locale locale){
		ModelAndView modelAndView = new ModelAndView("afternoon");
		
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMMMMM d hh:mm:ss z yyyy", locale);
		
		String formattedDate = dateFormat.format(date);
		
		modelAndView.addObject("afternoon", "Good afternoon! The current time is " + formattedDate);
		return modelAndView;
	}
	
	@RequestMapping(value="/evening", method = RequestMethod.GET)
	public ModelAndView evening(Locale locale){
		ModelAndView modelAndView = new ModelAndView("evening");
		
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMMMMM d hh:mm:ss z yyyy", locale);
		
		String formattedDate = dateFormat.format(date);
		
		modelAndView.addObject("evening", "Good evening! The current time is " + formattedDate);
		return modelAndView;
	}
	
	@RequestMapping(value="/calendar/{year}/{month}/{day}", method = RequestMethod.GET)
	public ModelAndView calendarWithDelimeters(@PathVariable String year, @PathVariable String month, @PathVariable String day){
		ModelAndView modelAndView = new ModelAndView("calendarWithDelimiter");
		
		String date = year + "-" + month + "-" + day; 
		
		modelAndView.addObject("date", "Today is " + date);
		return modelAndView;
	}
	
	@RequestMapping(value="/calendar", method = RequestMethod.GET)
	public ModelAndView calendarWithQuery(@RequestParam(value="year", defaultValue="2015", required=true) String year,
										  @RequestParam(value="month", defaultValue="07", required=true) String month,
										  @RequestParam(value="day", defaultValue="23", required=true) String day){
		ModelAndView modelAndView = new ModelAndView("calendarWithQuery");
		
		String date = year + "-" + month + "-" + day; 
		
		modelAndView.addObject("date", "Today is " + date);
		return modelAndView;
	}
}
