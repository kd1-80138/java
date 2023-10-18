package invoice;
import java.util.*;
//Q1. Create a class called Invoice that a hardware store might use to represent an invoice for an item                               
//sold at the store. An Invoice should include four pieces of information as fields—a part number                                     
//(type String), a part description (type String), a quantity of the item being purchased (type int) and a                            
//price per item (double). Your class should have a constructor                                                                       
//that initializes the four instance variables. Provide a set and a get method for each instance variable.                            
//calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the                                
//amount as a double value.                                                                                                           
//If the quantity is not positive, it should be set to 0.                                                                             
//If the price per item is not positive, it should be set to 0.0.                                                                     
//Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.                                           
                                                                                                                                   
 class Invoice {                                                                                                                
	String partno;                                                                                                                    
	String desc;                                                                                                                      
	double price;                                                                                                                     
	int qty;
	
	Invoice() {
		
	}

	Invoice(String partno, String desc, double price, int qty) {
		this.partno = partno;
		this.desc = desc;
		this.price = price;
		this.qty = qty;
	}

	public String getPartno() {
		return partno;
	}

	public void setPartno(String partno) {
		this.partno = partno;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}  
	
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter partno = ");
		this.partno=sc.nextLine();
		System.out.println("Enter description");
		this.desc=sc.next();
		System.out.println("Enter Quantity");
		this.qty=sc.nextInt();
		if (this.qty<0)
		{
			this.qty=0;
		}
		
		System.out.println("Enter Price  ");
		this.price=sc.nextDouble();
		if (this.price<0) {
			this.price=0;
		}
	}
	public void display()
	{
		System.out.println("Part no = "+this.partno);
		System.out.println("Description  = "+this.desc);
		System.out.println("Quantity  = "+this.qty);
		System.out.println("Price  = "+this.price);
		
	}
                                                                                                                            
                                                                                                                                    
}              


 public class InvoiceTest
{
	public static void main(String[]args)
	{
		Invoice i1=new Invoice();
		i1.accept();
		i1.display();	
	}
	
}
 






                                                                                                                                    