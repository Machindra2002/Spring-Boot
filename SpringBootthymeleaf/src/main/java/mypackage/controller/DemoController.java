package mypackage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mypackage.model.User;

@Controller    
public class DemoController   
{    
	@RequestMapping("/")    
	public String index()  
	{    
	return"index";    
	}   
	
	@RequestMapping("/student")    
	public String student()  
	{    
	return"student";    
	}   
@RequestMapping(value="/save", method=RequestMethod.POST)    
public ModelAndView save(@ModelAttribute User user)  
{    
	ModelAndView modelAndView = new ModelAndView();    
	modelAndView.setViewName("demo");        
	modelAndView.addObject("user", user);      
	return modelAndView;    
}    

}