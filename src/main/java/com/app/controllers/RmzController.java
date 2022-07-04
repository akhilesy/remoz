/**
 * 
 */
package com.app.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.dao.EduDao;
import com.app.vo.UserVo;

/**
 * @author 91826
 *
 */
@Controller
public class RmzController {
	

	/*
	 * @Autowired private BCryptPasswordEncoder Passwordenc;
	 */
	@Autowired(required = true)  
	private EduDao dao;
	
	@RequestMapping("/welcome")
	public String  displayMessage() {
		ModelAndView mdv=new ModelAndView();
		mdv.addObject("msg","welcome to page"); 
		/*
		 * //dao.getstudentdata(); mdv.setViewName("index"); String
		 * val=Passwordenc.encode("12345"); System.out.println("Password "+val);
		 */
		
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
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	  public String init(Model model) {
	    model.addAttribute("msg", "Please Enter Your Login Details");
	    System.out.println("under login init method");
	    return "login";
	  }
	
	@RequestMapping(value = "/data", method = RequestMethod.GET)
	  public String getData(Model model ,HttpServletRequest req, HttpServletResponse resp) {
	    model.addAttribute("msg", "Please Enter Your Login Details");
	    
	    System.out.println("under login init method");
	    return "data";
	  }
	
	
	
	@RequestMapping(value="/enquiry" , method = RequestMethod.POST)
	  public ModelAndView submit( HttpServletRequest request, HttpServletResponse response
			  ,Model model, @ModelAttribute("uservo") UserVo uservo) {
		System.out.println("in enquery method");
		ModelAndView mav=new ModelAndView();
		dao.saveEnquery(uservo);
		mav.addObject("enqueryobject", mav);
		mav.setView(null);

	    return mav;
	  }

}
