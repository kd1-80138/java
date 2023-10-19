package com.sunbeam;
import java.util.Objects;
import java.util.Scanner;


public class Book implements Comparable<Book>  {

	

		private String isbn;
		private double price;
		private String authorName;
		private int quantity;

		public Book(String isbn, double price, String authorName, int quantity) {

			this.isbn = isbn;
			this.price = price;
			this.authorName = authorName;
			this.quantity = quantity;
		}

		public Book() {

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
		
		// compareTo method
		
		@Override
		public int compareTo(Book b) {
			int diff = this.isbn.compareTo(b.getIsbn());
		
		return diff;
		}
		
		/*
		public int hashCode()
		{
			int hash = Objects.hash(this.isbn);
			return  hash;
		}
		
		@Override
		public boolean equals(Object obj) {
		if (this==obj)
			 return true;
	  if(obj==null)
		   return false;
	  if(getClass() != obj.getClass())
		  return  false;
	   Book other = (Book )obj;
	   return Objects.equals(isbn, other.isbn);
		}

		*/

	}

