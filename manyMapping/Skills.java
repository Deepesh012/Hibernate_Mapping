package manyMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Skills {

	@Id
	private int id;
	private String skills;
	
	
	@ManyToOne
	private Person name;
	
	

	public Person getName() {
		return name;
	}
	public void setName(Person name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}


	public Skills(int id, String skills, Person name) {
		super();
		this.id = id;
		this.skills = skills;
		this.name = name;
	}
	public Skills() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
