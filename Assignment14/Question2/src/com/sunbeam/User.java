package com.sunbeam;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class User {
	private int id;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private String dob;
	private boolean status;
	private String role ;
	public User(int id, String fnamename, String lname, String email, String password, String dob, boolean status,
			String role) {
		super();
		this.id = id;
		this.fname = fnamename;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.status = status;
		this.role = role;
	}
	public User() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fnamename) {
		this.fname = fnamename;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", fnamename=" + fname + ", lname=" + lname + ", email=" + email + ", password="
				+ password + ", dob=" + dob + ", status=" + status + ", role=" + role + "]";
	}
	
	
	
	public void accept () 
	{ Scanner sc = new Scanner(System.in);
		System.out.println("Enter firstname ");
		fname = sc.next();
		System.out.println("Enter last name  ");
		lname = sc.next();
		System.out.println("Enter email address ");
		email = sc.next();
		System.out.println("Enter password  ");
		password = sc.next();
		System.out.println("Enter DateofBirth");
		dob = sc.next();
		
	   
		
	}
	

}
