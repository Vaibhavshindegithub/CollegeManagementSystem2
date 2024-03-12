package com.veb.Service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veb.dao.StudentDao;
import com.veb.dto.StudPojo;

@Service
public class StudentService {
	public StudentService() {
	System.out.println("Inside StudentService Constructor");
	}
	
	@Autowired
	StudentDao studentdao;

	
	public int studentservice(String fname,String lname,String address,String email) {
		
		System.out.println("Inside StudentService studentservice()");
		
		int stud = studentdao.studdao(fname, lname, address, email);
		return stud;
		
	}

	public boolean deleteservice(int id)
	{
		boolean deleteStud = studentdao.deleteStud(id);
		System.out.println(deleteStud);
		return deleteStud;
	}
	
	public StudPojo update2service(int id) {
		
		StudPojo response = studentdao.updatedao(id);
		System.out.println(response);
		
		return response;
	}
	
	public boolean updateservice2(int id ,String fname,String lname,String address,String email)
	{
		boolean response = studentdao.updatedao2(id, fname, lname, address, email);
		System.out.println(response);
		return true;
	}
}
