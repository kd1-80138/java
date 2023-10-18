package invoice;
import java.util.*;
//Q3. Create a class called Date that includes three fields—a month (type int), a day (type int) and a
//year (type int). Provide a constructor that initializes the three instance variables and assumes that
//the values provided are correct. Provide a set and a get method for each instance
//variable. Provide a method displayDate that displays the month, day and year separated by forward
//slashes (/). Write a test application named DateTest that demonstrates class Date’s capabilities.

  class Date {
	
	private int day;
	private int month;
	private int year;
	Date(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
	}
	Date() {
		this(0,0,0);  //constructor chaining;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void accept()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter day");
		this.day=sc.nextInt();
		System.out.println("Enter Month");
		this.month=sc.nextInt();
		System.out.println("Enter Year");
		this.year=sc.nextInt();
		
	}
	public void display()
	{
		System.out.println("Date = "+this.day+"/"+this.month+"/"+this.year);
		
	}
}


   public class Datetest
    {
	   public static void main(String[] args)
	   {
		   Date d1=new Date();
		   d1.accept();
		   d1.display();
		   Date d2= new Date(10,12,2001);
		   d2.display();
	   }
    	
    }




