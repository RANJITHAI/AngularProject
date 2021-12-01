package com.practice.samplepratice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_address")

public class UserAddress {

	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false, updatable = false, insertable = false)
	private User user;
	@Id
	@Column(name = "add_id")
	private Integer add_id;

	@Column(name = "street")
	private String street;

	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;

	@Column(name = "country")
	private String country;

	@Column(name = "user_id")
	private Integer user_id;

	public UserAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserAddress(User user, Integer add_id, String street, String city, String state, String country,
			Integer user_id) {
		super();
		this.user = user;
		this.add_id = add_id;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "UserAddress [user=" + user + ", add_id=" + add_id + ", street=" + street + ", city=" + city + ", state="
				+ state + ", country=" + country + ", user_id=" + user_id + ", getUser()=" + getUser()
				+ ", getAdd_id()=" + getAdd_id() + ", getStreet()=" + getStreet() + ", getCity()=" + getCity()
				+ ", getState()=" + getState() + ", getCountry()=" + getCountry() + ", getUser_id()=" + getUser_id()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getAdd_id() {
		return add_id;
	}

	public void setAdd_id(Integer add_id) {
		this.add_id = add_id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

}