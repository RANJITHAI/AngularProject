package com.example.demo.Model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "clg_bus")
public class CollegeBus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bus_no")
	private int id;

	@Column(name = "driver_name")
	private String driverName;

	@Column(name = "root")
	private String root;

	@Column(name = "trip")
	private String trip;

	public CollegeBus() {
		super();
	}

	@OneToMany(mappedBy = "university_id", cascade = CascadeType.ALL)
	private List<College> college;

	@ManyToMany(targetEntity = Student.class, cascade = CascadeType.ALL)
	@JoinTable(name = "clgbus_student", joinColumns = { @JoinColumn(name = "bus_no") }, inverseJoinColumns = {
			@JoinColumn(name = "student_id") })
	@JsonManagedReference
	private List<Student> student;

	public CollegeBus(int id, String driverName, String root, String trip, List<College> college,
			List<Student> student) {
		super();
		this.id = id;
		this.driverName = driverName;
		this.root = root;
		this.trip = trip;
		this.college = college;
		this.student = student;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getRoot() {
		return root;
	}

	public void setRoot(String root) {
		this.root = root;
	}

	public String getTrip() {
		return trip;
	}

	public void setTrip(String trip) {
		this.trip = trip;
	}

	public List<College> getCollege() {
		return college;
	}

	public void setCollege(List<College> college) {
		this.college = college;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "CollegeBus [id=" + id + ", driverName=" + driverName + ", root=" + root + ", trip=" + trip + "]";
	}

}
