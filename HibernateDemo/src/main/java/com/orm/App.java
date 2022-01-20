package com.orm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	
	 public static void main(String[] args)throws Exception {
			Emp1 emp = new Emp1();
			emp.setEmpid(102);
			emp.setEmpname("jack");
			
			
			Configuration con = new Configuration().configure().addAnnotatedClass(Emp1.class);
			SessionFactory sf = con.buildSessionFactory();
			Session session = sf.openSession();
			Transaction txc =  session.beginTransaction();
			session.save(emp);
			txc.commit();
		}
	

}
