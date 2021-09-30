package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User extends BaseEntity {
	
	@Column(length=20)
	private String fname;
	@Column(length=20)
	private String lname;
	@Column(length=10)
	private String gender;
	@Column(length=30,unique=true)
	private String email;
	@Column(length=20)
	private String password;
	@Enumerated(EnumType.STRING)
	private Roles role;
	public User() {
		super();
	}
	public User(String fname, String lname, String gender, String email, String password, Roles role) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.email = email;
		this.password = password;
		this.role = role;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	public Roles getRole() {
		return role;
	}
	public void setRole(Roles role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Users [fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", email=" + email + ", password="
				+ password + ", role=" + role + "]";
	}

}
