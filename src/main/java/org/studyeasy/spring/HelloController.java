package org.studyeasy.spring;




import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.studyeasy.model.User;

@Controller
public class HelloController {
	
	@GetMapping("/")
	public ModelAndView home(){
		ModelAndView modelAndView = new ModelAndView("userFormView");
		User user = new User();
		Map<String,String> genderMap= new HashMap<String,String>();
		genderMap.put("male", "Male");
		genderMap.put("female", "Female");
		Map<String,String> countryMap= new HashMap<String,String>();
		countryMap.put("Tunisia", "tunis");
		countryMap.put("Algeria", "Algeria");
		countryMap.put("Maroc", "Maroc");
		countryMap.put("Egypt", "Egypt");
		modelAndView.addObject("countryMap",countryMap);
		modelAndView.addObject("genderMap",genderMap);
		modelAndView.addObject("user",user);
		return modelAndView;
	}
	@PostMapping("/displayUserInfo")
	public ModelAndView displayuserinfo(@ModelAttribute User user) {
		ModelAndView modelAndView=new ModelAndView("displayUserInfo");
		//System.out.println(user);
		modelAndView.addObject("user", user);
		return modelAndView;
	}
	
}