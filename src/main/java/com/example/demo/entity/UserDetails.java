package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


//it will create column directly by given name default
@Entity
public class UserDetails {
	
	//primary key
	@Id
	
	//it will iterate further after one another 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	//we can asign column name manually for databases
	@Column(name="Name")
	private String fullname;
	private String gender;
	private String dob;
	private String email;
	private String password;
	
	//Getter setter methods
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//toString methods
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", fullname=" + fullname + ", gender=" + gender + ", dob=" + dob + ", email="
				+ email + ", password=" + password + "]";
	}
	
	
	
	
	
	
}
