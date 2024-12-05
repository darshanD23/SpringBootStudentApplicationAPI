package com.studentdetails.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentdetails")
public class StudentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollno;
	@Column
	private String name;
	@Column
	private float percantage;
	@Column
	private String branch ;
	
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPercantage() {
		return percantage;
	}

	public void setPercantage(float percantage) {
		this.percantage = percantage;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public StudentEntity() {
		// TODO Auto-generated constructor stub
	}

	public StudentEntity(int rollno, String name, float percantage, String branch) {
		super();
		this.name = name;
		this.percantage = percantage;
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "StudentEntity [rollno=" + rollno + ", name=" + name + ", percantage=" + percantage + ", branch="
				+ branch + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}
