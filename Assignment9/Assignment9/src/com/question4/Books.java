package com.question4;

import java.util.Scanner;

public class Books {
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;

	public Books(String isbn, double price, String authorName, int quantity) {

		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public Books() {

	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Books [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}

	public void accept()
	{
		System.out.println("Enter ISBN number");
		this.isbn= new Scanner(System.in).next();
		System.out.println("Enter price  ");
		this.price = new Scanner(System.in).nextDouble();
		System.out.println("Enter author name ");
		this.authorName=new Scanner(System.in).next();
		System.out.println("Enter Quantity of the books");
		this.quantity= new Scanner(System.in).nextInt();
	}

}
