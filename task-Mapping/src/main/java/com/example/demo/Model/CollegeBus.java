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
	private String busNo;

	@Column(name = "driver_name")
	private String driverName;

	@Column(name = "trip")
	private String trip;

	public CollegeBus() {
		super();
	}

	@OneToMany(targetEntity = College.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "uni_id", nullable = false, updatable = false, insertable = false)
	private List<College> college;

	@ManyToMany(targetEntity = Student.class, cascade = CascadeType.ALL)
	@JoinTable(name = "clgbus_student", joinColumns = { @JoinColumn(name = "bus_no") }, inverseJoinColumns = {
			@JoinColumn(name = "student_id") })
	@JsonManagedReference
	private List<Student> student;

	public CollegeBus(String busNo, String driverName, String trip, List<College> college, List<Student> student) {
		super();
		this.busNo = busNo;
		this.driverName = driverName;
		this.trip = trip;
		this.college = college;
		this.student = student;
	}

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
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
		return "CollegeBus [BusNo=" + busNo + ", driverName=" + driverName + ", trip=" + trip + ", college=" + college
				+ ", student=" + student + "]";
	}

}
