package com.app.fruits;

public class Apple extends Fruit{

	
	
public Apple(String name, String colour, double weight, boolean isFresh) {
	super(name, colour, weight, isFresh);
	}

public Apple() {
	super("Apple",25,"red");
	
}
	
	public String  taste()
	{
		return "Sweet n Sour";
	}
	public String tostring()
	{
		return (super.toString()+" taste =  "+this.taste());
	}
}
