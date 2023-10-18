package test;
import com.app.geometry.*;
import java.util.*;
//Q2. Copy the Point2D class , along with the package from previous assignment.
//a) Create a class "TestPointArray1.java" in "tester" package for the following
//b) Accept , how many no of points to plot from user.
//c) Create suitable data structure
//Hint : Point2D[] points=new Point2D[sc.nextInt()];
//d) Prompt user for x & y co ordinates n store the data suitably
//Hint : for loop
//e) Supply Menu to user with various Options like following
//1. Display details of a specific point
//User i/p : index
//O/p : x & y co-ordinates should be displayed. or error message(eg : Invalid index , pls retry!!!!)
//2) Display x, y co-ordinates of all points
//Hint : for-each
//3) User i/p : 2 indices for the points , validate the indices
//Display distance between specified points (iff they are not located at the same position)
//eg : sop("Enter index of strt point n end point");
//validation : boundary condition (0<=index<length-1)
//isEqual -- false --compute distance --display it.

public class TestPoint {
	
	public static void main(String []args )
	{
		System.out.println("Enter no of points to plot");
		int index=new Scanner(System.in).nextInt();
         Point2D arr[]=new Point2D[index];
         for(int i=0;i<index;i++)
         {
        	 arr[i]=new Point2D();
        	 arr[i].accept();
         }
        int choice=1;
        while(choice!=0)
        {
        	System.out.println("0-EXIT");
        	System.out.println("1-Display details of a specific point");
        	System.out.println("2-Display x, y co-ordinates of all points");
        	System.out.println("3-calculate Distance between two points");
        	choice=new Scanner(System.in).nextInt();
        	
        	switch(choice)
        	{
        	case 1:
        		System.out.println("Enter index of object u want to display");
        		int ind=new Scanner(System.in).nextInt();
        		if(ind>index) {
        			System.out.println("Invalid Index Please retry!!!!");
        		}
        		System.out.println(arr[ind-1].getDetails());
        		
        		
        		break;
        	case 2:
        		System.out.println("Displaying all points");
        		for(int i=0;i<index;i++)
        		{
        			System.out.println(arr[i].getDetails());
        		}
        		
        		break;
        	case 3:
        		System.out.println("Enter two points between which you want to calculate distance");
        		int a =new Scanner (System.in).nextInt();
        		int b= new Scanner(System.in).nextInt();
        		double dis=arr[a-1].calculateDistance(arr[b-1]);
        		System.out.println("Distance = "+dis);
        		break;
        		
        		
        		
        	}
        	
        }
	}

}
