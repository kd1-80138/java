package com.payroll;
import java.util.*;

public class HourEmp  extends Employee{
	private int wage;
	private int hours;
	public HourEmp(String fname, String lname, long ssn, int wage, int hours) {
		super(fname, lname, ssn);
		this.wage = wage;
		this.hours = hours;
	}
	public HourEmp() {
		super();
	}
	public int getWage() {
		return wage;
	}
	public void setWage(int wage) {
		this.wage = wage;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public void accept()
	{
		super.accept();
		System.out.println("enter wages");
		this.wage=new Scanner(System.in).nextInt();
		System.out.println("Enter no of hours worked");
		this.hours=new Scanner(System.in).nextInt();
		
	}
	@Override
	public String toString() {
		
		return (super.toString()+"  Wages = "+this.wage+"  hours worked ="+this.hours);
	}
	@Override
	public void calculateSal()
	{
		if(hours<=40)
			System.out.println("total salary = "+wage*hours);
		else if (hours>40)
		{
			System.out.println("Total Salary= "+(40*this.wage+(this.hours-40)*this.wage*1.5));
		}
	}

}
