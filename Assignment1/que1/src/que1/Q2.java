package que1;
import java.util.*;
/*2. Accept 2 double values from User (using Scanner). Check data type. If arguments are not
doubles, supply suitable error message & terminate.
If numbers are double values, print its average.*/

public class Q2 {
		public static void main(String[]args)
		{
			double num1;
			double num2 ;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter num1 ");
			num1=sc.nextDouble();
			System.out.println("Enter num2");
			num2=sc.nextDouble();
		  if (sc.hasNextDouble())
		  {
			  double avg=(num1+num2)/2;
			  System.out.println("Average of both numbers is "+avg);
		  }
		  else {
			  System.out.println("invalid input");
		  }
			
			
		}
}
