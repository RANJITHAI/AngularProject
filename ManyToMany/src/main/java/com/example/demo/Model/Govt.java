package com.example.demo.Model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "govt_job")
public class Govt {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "job_id")
	private int id;

	@Column(name = "title")
	private String title;

	@Column(name = "eligible")
	private String eligible;

	@Column(name = "age_limit")
	private int age_limit;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "govt_applicant", joinColumns = { @JoinColumn(name = "job_id") }, inverseJoinColumns = {
			@JoinColumn(name = "person_id") })

	private List<Personal> personal;

	public Govt() {
		super();
	}

	public Govt(String title, String eligible, int age_limit, List<Personal> personal) {
		super();
		this.title = title;
		this.eligible = eligible;
		this.age_limit = age_limit;
		this.personal = personal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEligible() {
		return eligible;
	}

	public void setEligible(String eligible) {
		this.eligible = eligible;
	}

	public int getAge_limit() {
		return age_limit;
	}

	public void setAge_limit(int age_limit) {
		this.age_limit = age_limit;
	}

	public List<Personal> getPersonal() {
		return personal;
	}

	public void setPersonal(List<Personal> personal) {
		this.personal = personal;
	}

	

}
