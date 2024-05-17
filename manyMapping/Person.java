package manyMapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {

	@Id
	private int id;
	private String name;
	
	@OneToMany(mappedBy = "name", cascade = CascadeType.ALL)
	private List<Skills> skills;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Skills> getSkills() {
		return skills;
	}

	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}

	public Person(int id, String name, List<Skills> skills) {
		super();
		this.id = id;
		this.name = name;
		this.skills = skills;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
