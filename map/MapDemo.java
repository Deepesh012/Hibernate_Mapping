package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		 SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		// creating question 
		 Question q1 = new Question();
		 q1.setQuestionId(101);
		 q1.setQuestion("What is java?");
		 
		 Question q2 = new Question();
		 q2.setQuestionId(102);
		 q2.setQuestion("What is Collection Framework?");
		 
		 //creating answer
		 Answer answer = new Answer();
		 answer.setAnswerId(10001);
		 answer.setAnswer("Java is a programming Language");
		 answer.setQuestion(q1);
		 q1.setAnswer(answer);
		 
		 Answer answer1 = new Answer();
		 answer1.setAnswerId(10002);
		 answer1.setAnswer("API to work with group of Objects");
		 answer1.setQuestion(q2);
		 q2.setAnswer(answer1);
		 
		 //save by using session
		 Session session = factory.openSession();
		 Transaction tx = session.beginTransaction();
		 //save
		 session.save(q1);
		 session.save(answer);
		 session.save(q2);
		 session.save(answer1);
		 
		 tx.commit();
		 
		 //fetching data
		 Question qfetch = session.get(Question.class, 101);
		 System.out.println(qfetch.getQuestion());
		 System.out.println(qfetch.getAnswer().getAnswer());
		 
		 session.close();
		 
		 factory.close();
	}
	
}
