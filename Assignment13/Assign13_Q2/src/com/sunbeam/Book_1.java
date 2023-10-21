/*2. In menu-driven program of Books (with ArrayList - Day12 Q1) add two more menus.
Save books in ﬁle and load books from ﬁle. Use ObjectOutputStream
and ObjectInputStream.*/

package com.sunbeam;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class Book_1 implements Serializable{




	private String isbn;
	private double price;
	private String author_name;
	private int quantity;

	public Book_1(){

	}

	public Book_1(String isbn, double price, String author_name, int quantity) {
		this.isbn = isbn;
		this.price = price;
		this.author_name = author_name;
		this.quantity = quantity;
	}

	public void acceptData() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter ISBN = ");
		this.isbn = scan.next();
		System.out.print("Enter Price = ");
		this.price = scan.nextDouble();
		System.out.print("Enter Author Name = ");
		this.author_name = scan.next();
		System.out.print("Enter Quantity= ");
		this.quantity = scan.nextInt();

	}

	@Override
	public String toString() {
		return "Book [ISBN=" + isbn + ", Price=" + price + ", " + "Author_Name=" + author_name + ", Quantity="
				+ quantity + "]";
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

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book_1 other = (Book_1) obj;
		return Objects.equals(isbn, other.isbn);
	}


}
