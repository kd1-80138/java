package com.app.fruits;

public class Orange extends Fruit {

	
	


	public Orange(String name, String colour, double weight, boolean isFresh) {
		super(name, colour, weight, isFresh);
		// TODO Auto-generated constructor stub
	}

	public Orange() {
		super("orange",40,"orange");
		
	}
	@Override
	public String  taste()
	{
		return "Sour";
	}
    
	public String tostring()
	{
		return (super.toString()+" Taste =  "+this.taste());
	}
}
