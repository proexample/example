package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMP_SYSTEM")

public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)	private int id;
	private String Name;
	private String Address;
	private String Email;
	private String PhoneNumber;
	private int Salary;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getAddress() {
		return Address;
	}


	
	public void setAddress(String address) {
		Address = address;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}
	


	public String getPhoneNumber() {
		return PhoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}


	public int getSalary() {
		return Salary;
	}


	public void setSalary(int salary) {
		Salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", Address=" + Address + ", Email=" + Email + ", PhoneNumber="
				+ PhoneNumber + ", Salary=" + Salary + "]";
	}
	
	
	}


