package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "studentuser")
public class User {
	@Id
	private Integer id;
	private String name;
	private String email;


	public User() {
		super();
	}

	public User(Integer id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
