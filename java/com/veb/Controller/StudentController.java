package com.veb.Controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.veb.Service.StudentService;
import com.veb.dto.StudPojo;
import com.veb.dto.StudentPojo;

@Controller
public class StudentController {
	
	public StudentController() {
	System.out.println("Inside StudentController Constructor");
	}
	
	
	@Autowired
	StudentService studentservice;
	
	@Autowired
	SessionFactory sessionfactory;
	
	@RequestMapping("/create")
	public ModelAndView studeController(@RequestParam("fname") String fname,
			@RequestParam("lname") String lname,
			@RequestParam("address") String address,
			@RequestParam("email") String email)
	{
		System.out.println("Inside StudentController studeController()");
		int student = studentservice.studentservice(fname, lname, address, email);
		if(student>0)
		{
			ModelAndView mv=new ModelAndView("create-success");
			return mv;
		}
		else
		{
			ModelAndView mv=new ModelAndView("create-error");
			return mv;
		}
		
	}
	
	
	@RequestMapping("/display")
	public ModelAndView display() {
		System.out.println("Inside Display Method()");
		Session session=sessionfactory.openSession();
		Criteria cr=session.createCriteria(StudPojo.class);
		List list = new ArrayList(cr.list());
		
		list.stream().forEach(e->System.out.println(e));
		ModelAndView mv=new ModelAndView("getData");
		mv.addObject("list", list);
		return mv;
		
	}
	
	@RequestMapping("/deletestudent")
	public ModelAndView delete(@RequestParam("id") int id)
	{
		System.out.println("Inside Delete Method");
		System.out.println(id);
		boolean deleteservice = studentservice.deleteservice(id);
		if(deleteservice==false)
		{
			ModelAndView mv=new ModelAndView("error");
			return mv;
		}
		return display();
	}
	
	
	@RequestMapping("/updatestudent")
	public ModelAndView update(@RequestParam("id") int id)
	{
		
		StudPojo sp = studentservice.update2service(id);
		
		System.out.println(sp);
		String fname=sp.getFname();
		String lname=sp.getLname();
		String address=sp.getAddress();
		String email=sp.getEmail();
		ModelAndView mv=new ModelAndView("updatestudent");
		mv.addObject("id", id);
		mv.addObject("fname", fname);
		mv.addObject("lname", lname);
		mv.addObject("address", address);
		mv.addObject("email", email);
		return mv;
		
		
	}
	@RequestMapping("/update")
	public ModelAndView update2(@RequestParam("id") int id,
			@RequestParam("fname") String fname,
			@RequestParam("lname") String lname,
			@RequestParam("address") String address,
			@RequestParam("email") String email)
	{
		System.out.println("inside Update2() Method");
		boolean status = studentservice.updateservice2(id, fname, lname, address, email);
		System.out.println(status);
		if(status)
		{
			return display();
		}
		else
		{
			ModelAndView mv=new ModelAndView("error");
			return mv;
		}
		
	}
	
	@RequestMapping("/deleteall")
	public  ModelAndView deleteall()
	{
		Session session=sessionfactory.openSession();
		Transaction tr=session.beginTransaction();
		//String hql="truncate StudPojo";
		session.createSQLQuery("truncate table StudPojo").executeUpdate();
		tr.commit();
		return display();
		
	}
	@RequestMapping("/success")
	public String successPage() {
	    return "success"; 
	}
	@RequestMapping("/getData")
	public String getdataPage() {
	    return "getData"; 
	}
	@RequestMapping("/Oprations")
	public String oprations() {
	    return "Oprations"; 
	}
	@RequestMapping("/delete")
	public String delete() {
	    return "delete"; 
	}
	

}
