package tester;  
import java.util.*;
//Q1. (Credit Limit Calculator)
//Develop a Java application that determines whether any of several department-store customers has
//exceeded the credit limit on a charge account.
//For each customer,the following facts are available:
//a) account number
//b) balance at the beginning of the month
//c) total of all items charged by the customer this month
//d) total of all credits applied to the customer’s account this month
//e) allowed credit limit.
//The program should input all these facts as integers, calculate the new balance (= beginning
//balance+ charges – credits), display the new balance and determine whether the new balance
//exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the
//program should display the message "Credit limit exceeded".

 class TestCredit1 {
	private int accno;
   private  int   startbal;
	private int  totalcharge;
	private int  totalcredits;
	public TestCredit1(int accno, int startbal, int totalcharge, int totalcredits) {
		super();
		this.accno = accno;
		this.startbal = startbal;
		this.totalcharge = totalcharge;
		this.totalcredits = totalcredits;
	}
	
	public TestCredit1() {
		
	}

	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getStartbal() {
		return startbal;
	}
	public void setStartbal(int startbal) {
		this.startbal = startbal;
	}
	public int getTotalcharge() {
		return totalcharge;
	}
	public void setTotalcharge(int totalcharge) {
		this.totalcharge = totalcharge;
	}
	public int getTotalcredits() {
		return totalcredits;
	}
	public void setTotalcredits(int totalcredits) {
		this.totalcredits = totalcredits;
	}  

   public void accept()
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter  your account number"); 
	   this.accno=sc.nextInt();
        System.out.println("Enter  your starting balance"); 
       this.startbal=sc.nextInt();   
         System.out.println("Enter  your  total charge");
         this.totalcharge=sc.nextInt();
           System.out.println("Enter  your Total credits");
           this.totalcredits=sc.nextInt();
   }
   public void display()
   {
	   System.out.println(this.accno+" "+this.startbal+" "+this.totalcharge+" "+this.totalcredits);
   }
   public void creditLimit()
   {
	   if(this.startbal + this.totalcharge-this.totalcredits<=6000) {
		 System.out.println("new balance below credit score");
		 
	   }
	   else {
		  System.out.println("Credit Limit exceeded");
	   }                             
   }
   
}




public class TestCredit{
	public static void main(String []args)
	{
		TestCredit1 c1=new TestCredit1();
		c1.accept();
		c1.creditLimit();
	}

}




