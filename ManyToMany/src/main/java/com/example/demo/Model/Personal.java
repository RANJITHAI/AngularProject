package com.example.demo.Model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "applicant")
public class Personal {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	@Column(name = "personal_id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "contact")
	private int contact;
	
	@Column(name = "citizen")
	private String citizen;
	
	@Column(name = "education")
	private String educ;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "personal")
	private List<Govt> govt;
	
	

	public Personal() {
		super();
	}

	public Personal(String name, int contact, String citizen, String educ) {
		super();

		this.name = name;
		this.contact = contact;
		this.citizen = citizen;
		this.educ = educ;
	}

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

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getCitizen() {
		return citizen;
	}

	public void setCitizen(String citizen) {
		this.citizen = citizen;
	}

	public String getEduc() {
		return educ;
	}

	public void setEduc(String educ) {
		this.educ = educ;
	}
	

	public List<Govt> getGovt() {
		return govt;
	}

	public void setGovt(List<Govt> govt) {
		this.govt = govt;
	}

	@Override
	public String toString() {
		return "Personal [id=" + id + ", name=" + name + ", contact=" + contact + ", citizen=" + citizen + ", educ="
				+ educ + "]";
	}

}
