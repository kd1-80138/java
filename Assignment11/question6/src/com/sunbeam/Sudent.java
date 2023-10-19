package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Sudent {
	
	private int rollno ;
	private String  name;
	private double marks ;
	public Sudent() {
		
	}
	public Sudent(int rollno, String name, double marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
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
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public void accept()
	{
	 System.out.println("Enter your Roll no");
	 this.rollno= new Scanner(System.in).nextInt();
	 System.out.println("Enter your Name");
	 this.name= new Scanner(System.in).next();
	 System.out.println("Enter your Marks ");
	 this.marks = new Scanner(System.in).nextDouble();
			 
	}
	@Override
	public String toString() {
		return "Sudent [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

}
