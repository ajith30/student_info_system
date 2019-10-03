package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
    
	@RequestMapping(value="/admissionForm.html",method=RequestMethod.GET)
	public ModelAndView getAdmissionForm()
	{
		ModelAndView model=new ModelAndView("StudentForm");
		return model;
	}
	
	 @RequestMapping(value="submitAdmissionForm.html",
	    		method=RequestMethod.POST)
	    public ModelAndView submitAdmissionForm(@ModelAttribute("student")Student student)
	    {	    	
	    	
	    	ModelAndView model=new ModelAndView("StudentDetails");	    	
	        return model;
	    }
	
	
    
    
}
