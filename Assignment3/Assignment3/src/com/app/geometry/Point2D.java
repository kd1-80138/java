package com.app.geometry;
import java.util.*;

public class Point2D {
	private int x;
	private int y;
	 public Point2D() {
		this(0,0);
	}
	public Point2D(int x, int y) {
		this.x=x;
		this.y = y;
	}
	public  String getDetails()
	{
		String s = "X-coordinate:"+this.x+" Y-coordinate:"+this.y;
		return s;
	}
	public boolean isEqual()
	{
		if(this.x==this.y)
			return true;
		
		return false;
	}
	public double calculateDistance(Point2D p)
	{
		double x= this.x -p.x ;
		double y= this.y-p.y ;
		
		return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		
	}
	public void accept()
	{
		System.out.println("Enter X-coordinate");
		this.x=new Scanner(System.in).nextInt();
		System.out.println("Enter Y-coordinate");
		this.y=new Scanner(System.in).nextInt();
	}
}
