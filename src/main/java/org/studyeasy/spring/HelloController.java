package org.studyeasy.spring;




import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
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
	public ModelAndView displayuserinfo( @ModelAttribute("user") @Valid  User user,BindingResult result) {
		ModelAndView modelAndView=new ModelAndView("displayUserInfo");
		//System.out.println(user);
		modelAndView.addObject("user", user);
		if(result.hasErrors()) {
			System.out.print(result.hasErrors()+" has errors !!");
			ModelAndView repmodelAndView = new ModelAndView("userFormView");
			Map<String,String> genderMap= new HashMap<String,String>();
			genderMap.put("male", "Male");
			genderMap.put("female", "Female");
			Map<String,String> countryMap= new HashMap<String,String>();
			countryMap.put("Tunisia", "tunis");
			countryMap.put("Algeria", "Algeria");
			countryMap.put("Maroc", "Maroc");
			countryMap.put("Egypt", "Egypt");
			repmodelAndView.addObject("countryMap",countryMap);
			repmodelAndView.addObject("genderMap",genderMap);
			repmodelAndView.addObject("user",user);
			return repmodelAndView;
		}else {
			return modelAndView;
		}
		
	}
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		StringTrimmerEditor trim=new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, trim);
	}
}