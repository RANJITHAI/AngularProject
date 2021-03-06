package com.example.demo.Model;

import javax.persistence.*;

@Entity
@Table(name = "college")
public class College {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "university_id")
	private int id;

	@Column(name = "college_name")
	private String clgName;

	@Column(name = "deparment")
	private String department;

	@Column(name = "blocks")
	private String blocks;

	@Column(name = "fees")
	private int fees;

	public College() {
		super();
	}

	public College(int id, String clgName, String department, String blocks, int fees) {
		super();
		this.id = id;
		this.clgName = clgName;
		this.department = department;
		this.blocks = blocks;
		this.fees = fees;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getBlocks() {
		return blocks;
	}

	public void setBlocks(String blocks) {
		this.blocks = blocks;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", clgName=" + clgName + ", department=" + department + ", blocks=" + blocks
				+ ", fees=" + fees + ", getId()=" + getId() + ", getClgName()=" + getClgName() + ", getDepartment()="
				+ getDepartment() + ", getBlocks()=" + getBlocks() + ", getFees()=" + getFees() + ", getClgBus()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
