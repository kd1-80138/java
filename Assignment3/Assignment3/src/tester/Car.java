package que4;

import java.util.Scanner;

public class Car {
 double totalMilesPerGallon;
 double costPerGallon;
 double avgMilesPerGallon;
 double parkFees;
 double tolls;
  Scanner sc=new Scanner(System.in);
 
 public Car(double totalMilesPerGallon, double costPerGallon, double avgMilesPerGallon, double parkFees, double tolls) {
	this.totalMilesPerGallon = totalMilesPerGallon;
	this.costPerGallon = costPerGallon;
	this.avgMilesPerGallon = avgMilesPerGallon;
	this.parkFees = parkFees;
	this.tolls = tolls;
     }
   public Car() {
      }
   public void accept()
   {
	System.out.println("enter the total miles driven per day=");
	totalMilesPerGallon=sc.nextDouble();
	System.out.println("enter the cost per gallon of gasoline=");
	costPerGallon=sc.nextDouble();
	System.out.println("enter the average miles per gallon=");
	avgMilesPerGallon=sc.nextDouble();
	System.out.println("enter the parking fees per day=");
	parkFees=sc.nextDouble();
	System.out.println("enter the tolls per day=");
	tolls=sc.nextDouble();
	
   }
  public void calculateDailyDrivingCost()
  {
	  double totalCost;
	  totalCost=((totalMilesPerGallon/avgMilesPerGallon)*costPerGallon)+parkFees+tolls;
   System.out.println("Total of daily driving cost="+totalCost);
  }
 
 
}
