package com.practice.samplepratice.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_address")

public class UserAddress {

	@Id
	@GeneratedValue

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
	}
	
	public UserAddress(Integer add_id, String street, String city, String state, String country,Integer user_id) {
		super();
		this.add_id = add_id;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.user_id = user_id;
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

	public Integer getId() {
		return user_id;
	}

	public void setId(Integer user_id) {
		this.user_id = user_id;
	}
	
	@Override
	public String toString() {
		return "UserAddress [add_id=" + add_id + ", id=" + user_id + ", street=" + street + ", city=" + city + ", state="
				+ state + ", country=" + country + "]";
	}
}
