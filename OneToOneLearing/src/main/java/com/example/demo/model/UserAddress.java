package com.example.demo.model;

import javax.persistence.Id;

@Entity
@Table(name = "studentuseraddress")
public class UserAddress {

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

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", nullable = false, updatable = false, insertable = false)

	private User user;

	public UserAddress() {
		super();
	}

	public UserAddress(Integer add_id, String street, String city, String state, String country, Integer user_id,
			User user) {
		super();
		this.add_id = add_id;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.user_id = user_id;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
