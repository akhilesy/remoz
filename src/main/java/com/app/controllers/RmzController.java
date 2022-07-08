/**
 * 
 */
package com.app.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Enquery;
import com.app.services.EnqueryService;
import com.app.vo.UserVo;

/**
 * @author 91826
 *
 */
@Controller
@RequestMapping("/rmz")
public class RmzController {
	

	/*
	 * @Autowired private BCryptPasswordEncoder Passwordenc;
	 */

	@Autowired
	private EnqueryService enqueryservice;
	
	
	
	@RequestMapping("/welcome")
	public String  displayMessage() {
		ModelAndView mdv=new ModelAndView();
		mdv.addObject("msg","welcome to page"); 
		
		return "index";
		
	}
	@RequestMapping("/aboutus")
	public String  aboutus() {
		ModelAndView mdv=new ModelAndView();
		mdv.addObject("msg","welcome to page"); 
	
		return "aboutus";
		
	}
	
	@RequestMapping("/contactus")
	public String  contactus() {
		ModelAndView mdv=new ModelAndView();
		mdv.addObject("msg","welcome to page"); 
	
		return "contactus";
		
	}


	
	
	
	@RequestMapping(value="/enquiry" , method = RequestMethod.POST)
	@ResponseBody
	  public String submit( HttpServletRequest request, HttpServletResponse response
			  ,Model model, @ModelAttribute("uservo") UserVo uservo) {
		String returnmsg="";
		try {
			enqueryservice.saveEnquery(uservo);
			return "sucess";
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	    return "";
	  }
	
	@RequestMapping(value="/getenquert" , method = RequestMethod.GET)
	public List<Enquery> getAllEnquery() {
		return enqueryservice.getAllEnquery();
		
	}

}
