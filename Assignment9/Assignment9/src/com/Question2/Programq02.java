package com.Question2;

import java.util.*;

public class Programq02 {
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j<arr.length; j++) {
		if(c.compare(arr[i], arr[j]) > 0) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		   }
	    	}
    	}
	}
	
	
	public static void main (String []args)
	{
		Double arr[]= {1.1,1.54,1.9,2.0,1.3};
		
		class  comparatorDouble  implements Comparator<Double>
		{
			@Override
			public int compare(Double d1, Double d2) {
				int diff= d1.compareTo(d2);
				return diff;
			}
			
		}
		comparatorDouble d1= new comparatorDouble();
		selectionSort(arr,d1);
		for(Double e:arr)
			 System.out.println(e);
		
		
		
	}

}
