package com.payroll;
import java.util.*;

public class test {
	public static void main(String[]args)
	{
		//Salaried Employee;
		/*
		Employee e1 = new SalariedEmp();
		e1.accept();
		System.out.println(e1.toString());
	  e1.calculateSal();
	  */
		
		//hourly Employee
/*
    Employee emp=new HourEmp();
	emp.accept();
	System.out.println(emp.toString());
	emp.calculateSal();
	*/	
		
		// Commission Employee;
	/*	
		Employee emp=new CommEmp();
		emp.accept();
		System.out.println(emp.toString());
		emp.calculateSal();*/
		
		
		//base commission Employee
		Employee e1= new BaseCommEmp();
		e1.accept();
		System.out.println(e1.toString());
		e1.calculateSal(); 
		
		System.out.println("After giving 10% raise ");
		if(e1 instanceof BaseCommEmp)
		{
			BaseCommEmp emp=(BaseCommEmp)e1;
			 emp.increament();
		}
		
	}

}