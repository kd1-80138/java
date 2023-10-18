package com.app.fruits;
import java.util.*;

public class FruitBasket {
	public static void main(String[]args)
	{
		int index;
		Fruit arr[] =null;
		System.out.println("Enter no of fruits u want to add in Fruit Basket");
		index=new Scanner(System.in).nextInt();
				arr=new Fruit[index];
		
		int choice =1;
		int count=0;
		while(choice!=0)
		{
			System.out.println("0 - EXIT");
			System.out.println("1 - ADD MANGO");
			System.out.println("2 - ADD ORANGE");
			System.out.println("3 - ADD APPLE");
			System.out.println("4 - DISPLAY ALL NAME OF FRUITS IN BASKEET");
			System.out.println("5 - DISPLAY NAME , COLOUR ,WEIGHT, TASTE OF ALL FRESH FRUITS");
			System.out.println("6 - DISPLAY TASTES OF ALL STALE FRUITS IN BASKET");
			System.out.println("7 - ENTER NO TO MARK AS STALE");
			System.out.println("8 - MARK ALL SOUR FRUITS STALE ");
			choice=new Scanner(System.in).nextInt();
			switch(choice)
			{
			case 1:
				if (count>=index)
				{
					System.out.println("Basket is Full !!!!");
				}
				else {
				
				arr[count]=new Mango();
				count++;
				}
				break;
				
				
			case 2:
				if (count>=index)
				{
					System.out.println("Basket is Full !!!!");
				}
				else {
				arr[count]=new Orange();
				count++;
				}
				break;	
			case 3:
				if (count>=index)
				{
					System.out.println("Basket is Full !!!!");
				}
				else {
				arr[count]=new Apple();
				count++;
				}
				break;
			case 4:
				for(Fruit fruit:arr) { 
					if (fruit != null)
					System.out.println(fruit.getName());
					
					//or
					
//				if (fruit != null){
//					if(fruit instanceof Mango)
//					{        	 Mango mango=(Mango) fruit;
//						System.out.println("Name = "+mango.getName());
//					}
//					else if(fruit instanceof Orange)
//					{
//				     	 Orange orange=(Orange) fruit;
//							System.out.println("Name = "+orange.getName());	
//					}
//					else if(fruit instanceof Apple)
//					{
//				     	 Apple apple=(Apple) fruit;
//							System.out.println("Name = "+apple.getName());
//                   	}
//					}
				}
				break;
			case 5:   //Displaying all details of the 
				for(Fruit fruit :arr)
				{
					
					if(fruit instanceof Mango)
					{        	 Mango mango=(Mango) fruit;
					System.out.println(mango.tostring());			
						}
					else if(fruit instanceof Orange)
					{
				     	 Orange orange=(Orange) fruit;
				     	System.out.println(orange.tostring());
					}
					else if(fruit instanceof Apple)
					{
				     	 Apple apple=(Apple) fruit;
							System.out.println(apple.tostring());                   	}
				}
				
				break;
			case 6:
				System.out.println("taste of Stale Fruits :-");
				int ch=0;
				   for(Fruit fruit:arr)
				   {
					   if(fruit.isFresh()==false)
					   {  ch++;
						   if(fruit instanceof Mango)
							{        	 Mango mango=(Mango) fruit;
							System.out.println("Taste  of mango= "+mango.taste());		
								}
							else if(fruit instanceof Orange)
							{
						     	 Orange orange=(Orange) fruit;
						     	System.out.println("Taste  of Orange= "+orange.taste());
							}
							else if(fruit instanceof Apple)
							{
						     	 Apple apple=(Apple) fruit;
						     	System.out.println("Taste Apple  = "+apple.taste());
					 	   }
					   }
				   }
				   if (ch==0)
				   {
					   System.out.println("No Stale fruits In the Basket ");
				   }
				break;
			case 7:
				System.out.println("Enter fruit no which u want to mark as stake ");
				int ind=new Scanner(System.in).nextInt();
				if(ind>index)
					System.out.println("Invalid Index selected");
				else    
				  arr[ind-1].setFresh(false);
				
				break;
			case 8:
				String s;
				for(Fruit fruit:arr)
				{
				  if((s=fruit.taste())=="Sour")
					{
				     	 fruit.setFresh(false);
				     	
					}
					
				}
				 break;
			}
			
		}
		System.out.println("Thank you for Using our App !!!!!!!.........");
	}

}
