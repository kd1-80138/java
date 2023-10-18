package com.app.fruits;

public class Fruit {
	private String name;
	private String colour;
	private double weight;
	private boolean isFresh=true;


	public Fruit(String name, String colour, double weight, boolean isFresh) {
		super();
		this.name = name;
		this.colour = colour;
		this.weight = weight;
		this.isFresh = isFresh;
	}
   public Fruit()
   {
	   this.name="Fruit";
   }
     	
	public Fruit(String name,double weight,String colour ) {
		this.name= name ;
		this.weight=weight;
		this.colour=colour;
		
	}


	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
   public String taste()
   {
	   return "no specific Taste";
   }
   public String getName()
   {
	   return  this.name ;
   }
   public void setName( String name )
   {
	   this.name= name ;
   }
   
   public String  toString()
   {
	   return  (" name ="+this.name+"  weight ="+this.weight+"  Colour = "+this.colour);
	  
   }
  
	 
  
	
	
}
