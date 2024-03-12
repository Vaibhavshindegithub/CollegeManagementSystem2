package com.veb.Controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.veb.Service.LoginService;

@Controller
public class LoginController {

	public LoginController() {
		System.out.println("Inside LoginController Constructor");
	}

	@Autowired
	LoginService loginservice;

	@RequestMapping("/login")
	public ModelAndView login(@RequestParam("Uname") String uname, @RequestParam("Pass") String pass) {
		System.out.println("Inside Login Method()");
		System.out.println("Uname= " + uname);

		boolean userPresent = loginservice.logservice(uname, pass);
		if (userPresent) {
			System.out.println("-----success case-----");
			ModelAndView mav = new ModelAndView("Oprations");
			mav.addObject("name", uname);
			return mav;

		} else {
			System.out.println("-----error case-----");
			ModelAndView mav = new ModelAndView("error");
			mav.addObject("name", uname);
			mav.addObject("pass", pass);
			return mav;
		}

	}
	
	@RequestMapping("/signup")
	public ModelAndView create(@RequestParam("name") String name,@RequestParam("password1") String password)
	{
		System.out.println("Inside LoginController create()");
		System.out.println(name);
		int signservice = loginservice.signservice(name, password);
		if(signservice>0)
		{
		ModelAndView mv=new ModelAndView("index");
		return mv;
		}
		else
		{
			ModelAndView mv=new ModelAndView("userpresent");
			mv.addObject("name", name);
			return mv;	
		}
	}
	
	@RequestMapping("/SignUp")
	public String sign()
	{
		return "SignUp";
	}
	
	@RequestMapping("/index")
	public String index()
	{
		return "index";
	}
	
	
}
	



