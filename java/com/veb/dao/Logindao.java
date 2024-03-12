package com.veb.dao;




import org.hibernate.Criteria;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

import com.veb.dto.StudentPojo;

@Repository
public class Logindao {

	@Autowired
	SessionFactory sessionfactory;

	public Logindao() {
		System.out.println("Inside Logindao Constructor");
	}

	public boolean logdao(String uname, String pass) {
		System.out.println("Inside Logindao logdao()");

		Session session = sessionfactory.openSession();
		String hql = "from StudentPojo where uname='" + uname + "' And passsword='" + pass + "'";

		Query query = session.createQuery(hql);

		StudentPojo user = (StudentPojo) query.uniqueResult();
		if (user != null) {
			System.out.println("Success Case");
			return true;

		} else {

			System.out.println("Error Case");

			return false;

		}

	}//jabx 2.3.0

	public int signdao(String name, String pass) {
		Session session = sessionfactory.openSession();
		Transaction tr = session.beginTransaction();
		StudentPojo sp = new StudentPojo();
		// String hql="select Uname from StudentPojo where";
		@SuppressWarnings("deprecation")
		Criteria cr = session.createCriteria(StudentPojo.class);
		Criterion eq = Restrictions.eq("Uname", name);
		cr.add(eq);
		StudentPojo sp1 = (StudentPojo) cr.uniqueResult();
		System.out.println("Name from DataBase =" + sp1);

		if (sp1 == null) {
			sp.setUname(name);
			sp.setPassword(pass);
			session.save(sp);
			tr.commit();
			return 1;
		} else {
			return 0;
		}

		

	}
}
