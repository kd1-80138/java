package com.question1;
import java.util.*;

public class Demoq1 {
	
	public static <T  extends Number> T minFromArray(T[] arr)
	{  T min=arr[0];
			for(int i=0;i<arr.length;i++)
			{
				if (min.doubleValue()>arr[i].doubleValue())
				{
					min= arr[i];
					}	
			}
			return min;
					
	}
	
	
	public static void main(String[] args)
	{
		
		Integer[] arr1 = { 22, 55, 77, 11, 33 };
		Integer min1 = minFromArray(arr1);
		System.out.println(min1+" is the Minimum Element");
		Double[] arr2 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
		Double min2 = minFromArray(arr2);
		System.out.println(min2+" is the Minimum Element");
		
		
		
	}

}
