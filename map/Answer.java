package com.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {

	@Id
	private int answerId;
	private String Answer;
	
	//bidirectional Mapping
	@OneToOne(mappedBy = "answer")
	private Question question;
	
	
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswer() {
		return Answer;
	}
	public void setAnswer(String answer) {
		Answer = answer;
	}
	
	
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public Answer(int answerId, String answer) {
		super();
		this.answerId = answerId;
		Answer = answer;
	}
	
	
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
