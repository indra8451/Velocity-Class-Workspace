package com.insertoperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		// step-1
		System.out.println("line 1");
		Configuration configuration= new Configuration();
		
		System.out.println("line 2");
		configuration.configure("hibernate.cfg.xml");
		
		System.out.println("line 3");
		SessionFactory sessionfactory=configuration.buildSessionFactory();
		
		Session session=sessionfactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		// insert data into database
		Employee emp = new Employee();
		
		emp.setName("pravin");
		emp.setSalary(200000);
		
		session.save(emp);
		transaction.commit();
		session.close();
		
		System.out.println("Record saved");

	}

}
