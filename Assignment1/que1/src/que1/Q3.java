/*
3. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa
2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option , display total bill & exit.*/

package que1;
import java.util.Scanner;

public class Q3 {
	public static void main (String[] args)
	{
		int choice=1;
		double total=0;
		
		
		
			
			
			do
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your choice ");
				System.out.println("0- Exit");
				System.out.println("1-Add idili     price= 50");
				System.out.println("2-Add vada    price =60 ");
				System.out.println("3-Add Dosa    price = 50");
				System.out.println("4-Add Somosa   price=30");
				System.out.println("5-Calculate Bill ");
				
			choice = sc.nextInt();
			switch(choice)
				{
			
			case 1:
				System.out.println("Idili Added !!!");
				total +=50;
				break;
			case 2:
				System.out.println("vada  Added !!!");
				total +=60;
				break;
			case 3:
				System.out.println("Dosa Added !!!");
				total+=50;
				break;
			case 4:
				System.out.println("Samosa  Added !!!");
				total =30;
				break;
			case 5:
				System.out.println("Total Bill = "+total);
				break;
				
			case 0:
				System.out.println("Thank you for Ordering !!!!!!!!!!!!!!!");
				break;
				}
			}while(choice!=0);
			
		}
	}


