package com.veb.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.veb.dto.StudPojo;

@Repository
public class StudentDao {
	public StudentDao() {
		System.out.println("Inside StudentDao Constructor");
	}
	
	@Autowired
	SessionFactory sessionfactory;
	
	public int studdao(String fname,String lname,String address,String email)
	{
		System.out.println("inside StudentDao.studdao()");
		Session session=sessionfactory.openSession();
		Transaction tr=session.beginTransaction();
		StudPojo sp=new StudPojo();
		sp.setFname(fname);
		sp.setLname(lname);
		sp.setAddress(address);
		sp.setEmail(email);
		 
		int save =(int) session.save(sp);
		tr.commit();
		return save;
	}
	public boolean deleteStud(int id)
	{
		Session session=sessionfactory.openSession();
		Transaction tr=session.beginTransaction();
		StudPojo sp=new StudPojo();
		sp.setId(id);
		session.delete(sp);
	     tr.commit();
		return true;
	}
	
	public StudPojo updatedao(int id)
	{
		
		System.out.println("Inside Update Method()");
		System.out.println(id);
		Session session=sessionfactory.openSession();
		Criteria cr=session.createCriteria(StudPojo.class);
		Criterion eq = Restrictions.eq("id", id);
		cr.add(eq);
		StudPojo sp = (StudPojo) cr.uniqueResult();
		System.out.println(sp);
		return sp;
	}
	
	public boolean updatedao2(int id ,String fname,String lname,String address,String email)
	{
		
		Session session=sessionfactory.openSession();
		Transaction tr=session.beginTransaction();
		StudPojo sp=new StudPojo();
		sp.setId(id);
		sp.setFname(fname);
		sp.setLname(lname);
		sp.setAddress(address);
		sp.setEmail(email);
		 
		 session.update(sp);
		tr.commit();
		return true;
	}
}
