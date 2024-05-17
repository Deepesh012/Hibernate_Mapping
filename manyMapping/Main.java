package manyMapping;

//import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		//creating session factory to create tables
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		
		//creating Person Object to set values of Person
//		Person p = new Person();
//		p.setId(1010);
//		p.setName("Deepesh");
//		
//		creating Skills Object to set values of Skills
//		Skills s = new Skills();
//		s.setId(1);
//		s.setSkills("Java");
//		s.setName(p);
//		
//		Skills s1 = new Skills();
//		s1.setId(2);
//		s1.setSkills("Html");
//		s1.setName(p);
//		
//		Skills s2 = new Skills();
//		s2.setId(3);
//		s2.setSkills("CSS");
//		s2.setName(p);
//		
//		Skills s3 = new Skills();
//		s3.setId(4);
//		s3.setSkills("SQL");
//		s3.setName(p);
//		
//		Skills s4 = new Skills();
//		s4.setId(5);
//		s4.setSkills("JavaScript");
//		s4.setName(p);
//		
//		Skills s5 = new Skills();
//		s5.setId(6);
//		s5.setSkills("Advance Java");
//		s5.setName(p);
//		
//		
//		//create list to store these objects in one
//		List<Skills> list = new ArrayList<Skills>();
//		list.add(s);
//		list.add(s1);
//		list.add(s2);
//		list.add(s3);
//		list.add(s4);
//		list.add(s5);
//		
//		//to save all the skills in one person
//		p.setSkills(list);
//		
//		
//		
		//save by using session
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		
		//save
//		session.save(p);
//		session.save(s);
//		session.save(s1);
//		session.save(s2);
//		session.save(s3);
//		session.save(s4);
//		session.save(s5);

		
		// fetch data
		Person person = (Person)session.get(Person.class, 1010);
		System.out.println(person.getName());
		for(Skills skills : person.getSkills()) {
			System.out.println(skills.getSkills());
		}
		

		
		//commit
		tx.commit();
		
		//session close
		session.close();
		
		
		
		
		//close factory
		factory.close();
	}
	
}
