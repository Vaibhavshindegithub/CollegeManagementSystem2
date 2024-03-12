package com.veb.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veb.dao.Logindao;

@Service
public class LoginService {
	
	public LoginService() {
	System.out.println("Inside LoginService Constructor");
	}
	
	@Autowired
	Logindao logindao;
	
	public boolean logservice(String uname,String pass)
	{
		System.out.println("Inside LoginService logservice()");
		
		boolean response=logindao.logdao(uname, pass);
		System.out.println("Response "+response);
		
		
		return response;
	}

	public int signservice(String name,String pass)
	{
		System.out.println("Inside LoginService signservice()");
		 int save=logindao.signdao(name, pass);
		//System.out.println(signdao);
		return save;
	}
	
}
