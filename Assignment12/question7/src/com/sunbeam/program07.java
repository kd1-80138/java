package com.sunbeam;
import java.util.function.*;
import java.util.stream.Stream;
import java.util.*;

public class program07 {

	
	public static void main(String[]args)
	{
		Random r= new Random();
		Stream<Integer>str=  Stream.generate(()->r.nextInt(100))
				.limit(10);
		
		int sum = str.reduce(0, (x,y)->x+y);
		System.out.println("ANS = "+sum);
		
	}
}
