package com.example.demo.Model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "student_id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "travel_fees")
	private int fees;

	@Column(name = "emergency_contact")
	private int emcContact;

	@Column(name = "address")
	private String address;

	@ManyToMany(targetEntity = CollegeBus.class, mappedBy = "student", cascade = CascadeType.ALL)

	@JsonBackReference
	private List<CollegeBus> bus;

	public Student() {
		super();
	}

	public Student(int id, String name, String address, int fees, int emcContact, List<CollegeBus> bus) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
		this.emcContact = emcContact;
		this.bus = bus;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public int getEmcContact() {
		return emcContact;
	}

	public void setEmcContact(int emcContact) {
		this.emcContact = emcContact;
	}

	public List<CollegeBus> getBus() {
		return bus;
	}

	public void setBus(List<CollegeBus> bus) {
		this.bus = bus;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", fees=" + fees + ", emcContact="
				+ emcContact + ", bus=" + bus + "]";
	}

}
