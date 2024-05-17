package com.manyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingMain {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		//creating objects of emp class
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		Emp e3 = new Emp();
		
		//set values of emp class
		e1.setEid(12);
		e1.setName("Ram");
		
		e2.setEid(13);
		e2.setName("Shyam");
		
		e3.setEid(123);
		e3.setName("Sunder");
		
		//creating objects of project class
		Projects p1 = new Projects();
		Projects p2 = new Projects();
		Projects p3 = new Projects();
		Projects p4 = new Projects();
		Projects p5 = new Projects();
		
		//set the values of projects
		p1.setPid(2);
		p1.setProjectName("Library Management");
		
		p2.setPid(3);
		p2.setProjectName("ChatBox");
		
		p3.setPid(13);
		p3.setProjectName("Ecom Website");
		
		p4.setPid(42);
		p4.setProjectName("School Management");
		
		p5.setPid(35);
		p5.setProjectName("Online Booking");
		
		
		//creating list to set all the objects
		List<Emp> list1 = new ArrayList<Emp>();
		List<Projects> list2 = new ArrayList<Projects>();
		
		list1.add(e1);
		list1.add(e2);
		list1.add(e3);
		
		list2.add(p1);
		list2.add(p2);
		list2.add(p3);
		list2.add(p4);
		list2.add(p5);
		
		
		//set projects in emp and emp in project
		e1.setProjects(list2);
		p2.setEmps(list1);
		
		
		//Now Save
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p4);
		session.save(p5);
		
		
		tx.commit();
		session.close();
		
		
		factory.close();
	}
	
}
