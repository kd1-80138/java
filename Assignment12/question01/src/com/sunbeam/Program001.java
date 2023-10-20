//1. Create an interface Emp with abstract method double getSal() and a default method default double calcIncentives(). The default method
//simply returns 0.0. Create a class Manager (with ﬁelds basicSalary and dearanceAllowance) inherited from Emp. In this class override getSal() method
//(basicSalary + dearanceAllowance) as well as calcIncentives() method (20% of basicSalary). Create another class Labor (with ﬁelds hours and rate)
//inherited from Emp interface. In this class override getSal() method (hours * rate) as well as calcIncentives() method (5% of salary if hours > 300,
//otherwise no incentives). Create another class Clerk (with ﬁeld salary) inherited from Emp interface. In this class override getSal() method (salary). Do
//not override, calcIncentives() in Clerk class. In Emp interface create a static method static double calcTotalIncome(Emp arr[]) that calculate
//total income (salary + incentives) of all employees in the given array.

package com.sunbeam;
import java.util.*;

interface Emp
{
   public double getSal();
   default double calIncentives()
   {
	   return 0.0;
   }
   static double calcTotalIncome(Emp arr[])
   {
	   double tsal=0;
	   for(Emp  e: arr)
	   {
		   tsal+= e.getSal()+e.calIncentives();
	   }
	   return tsal;
		   
   }
}


 class Manager implements Emp {
	private double basicSalary;
	private double deAllowance;
	public Manager() {
		
	}
	public Manager(double basicSalary, double deAllowance) {
		
		this.basicSalary = basicSalary;
		this.deAllowance = deAllowance;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getDeAllowance() {
		return deAllowance;
	}
	public void setDeAllowance(double deAllowance) {
		this.deAllowance = deAllowance;
	}
	@Override
	public String toString() {
		return "Manager [basicSalary=" + basicSalary + ", deAllowance=" + deAllowance + "]";
	}
	
	@Override
	public double getSal() {
		
	  return basicSalary+deAllowance;
	}
	@Override
	public double calIncentives() {
		return 0.20*basicSalary;
	}
	
}
 class Labour implements Emp
 {
	 private int hours;
	 private int rate;
	public Labour(int hours, int rate) {
		super();
		this.hours = hours;
		this.rate = rate;
	}
	public Labour() {
		super();
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	  
	
	@Override
	public String toString() {
		return "Labour [hours=" + hours + ", rate=" + rate + "]";
	}
	@Override
	public double getSal() {
		return rate*hours;
	}
	 @Override
	public double calIncentives() {
		double total= 0.0;
		if (hours>300)
			total =total*hours*rate;

		return total;
	}
	 
 }
 class Clerk implements Emp
 {
	 private double  sal;

	public Clerk(double sal) {
		super();
		this.sal = sal;
	}

	public Clerk() {
		super();
	}

	public double getSala() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
	
	@Override
	public String toString() {
		return "Clerk [sal=" + sal + "]";
	}

	@Override
	public double getSal() {
		return 	this.sal;
	}
	
	 
 }

public class Program001 {
	
	public static void main(String[] args)
	{
		Emp arr[]= new Emp[5];
		
		arr[0]= new Manager(8000,1000);
		arr[1]= new Clerk(7000);
		arr[2]= new Manager(9000,1000);
		arr[3]= new Labour(301,50);
		arr[4]= new Clerk(9000);
		for(Emp e: arr)
			System.out.println(e);
		System.out.println("total salary of all Employee is -");
	     System.out.println(Emp.calcTotalIncome(arr));
	}

}
