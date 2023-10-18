package com.payroll;
import java.util.*;

public class BaseCommEmp extends CommEmp {
	private  double basicSal;

	public BaseCommEmp(String fname, String lname, long ssn, int commrate, int grossSale, double basicSal) {
		super(fname, lname, ssn, commrate, grossSale);
		this.basicSal = basicSal;
	}

	public BaseCommEmp() {
		super();
	}

	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(double basicSal) {
		basicSal = basicSal;
	}
	
	public void accept()
	{
		super.accept();
		System.out.println("Enter Basic Salary");
		this.basicSal=new Scanner(System.in).nextDouble();
	}
	@Override
	public String toString() {
	
		return (super.toString()+"   basic Salary = "+this.basicSal);
	}
	@Override
	public void calculateSal() {
		
		double  totalSal=0;
		totalSal= this.basicSal+this.getGrosssale()*this.getCommrate();
		System.out.println("total Salary of the Base-Salaried Commission Employee  = "+totalSal);
	}
	public void increament()
	{
		double totalSal;
		totalSal=this.basicSal +(this.basicSal*0.10)+(this.getGrosssale()*this.getCommrate());
		System.out.println("total Salary of the Base-Salaried Commission Employee  after  raise  = "+totalSal);

	}

}
