package com.jpassion.mvc.controllers;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/today")
public class MyController {

	@RequestMapping(method=RequestMethod.GET, params = "format=body", produces = "application/json")
	public @ResponseBody String jsonHandler(Model model){
		Calendar today = Calendar.getInstance();
		model.addAttribute("year", today.get(Calendar.YEAR));
		model.addAttribute("month", today.get(Calendar.MONTH));
		model.addAttribute("day", today.get(Calendar.DAY_OF_MONTH));
		return model.asMap().toString();
	}
	
	@RequestMapping(method=RequestMethod.GET, params = "format=view")
	public ModelAndView jspHandler(){
		ModelAndView mav = new ModelAndView("view_today");
		Date today = Calendar.getInstance().getTime();
		mav.addObject(today);
		return mav;
	}
}
