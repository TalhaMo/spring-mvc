package org.studyeasy.spring;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET,value = "/")
	public String homepage(){
		return "hello";
	}
	
	@GetMapping("displayname")
	public ModelAndView displayname(@RequestParam("firstName") String firstName) {
		ModelAndView modelAndView=new ModelAndView("displayName");
		modelAndView.addObject("name", firstName);
		Date date =new Date();
		modelAndView.addObject("date", date);
		List<String> list=new ArrayList();
		list.add("mohamed");
		list.add("talha");
		list.add("imen");
		modelAndView.addObject("team",list);
		return modelAndView;
	}
}