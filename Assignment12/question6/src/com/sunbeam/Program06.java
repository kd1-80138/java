//Calculate the factorial of the given number using stream operations.


package com.sunbeam;
import java.util.*;
import java.util.stream.Stream;

public class Program06 {
	
	public static void main (String[]args)
	{
		System.out.println("Enter no to calculate factorial for ");
		int n = new Scanner(System.in).nextInt();
		Stream<Integer> strm3 = Stream.iterate(1, x -> x + 1).limit(n);
		
		 long ans =strm3.reduce(1,(x,y)->x*y);
		System.out.println("Ans = "+ans);
//		strm3.forEach((k)->System.out.println(k));
	 
		
		
	}
	

}
