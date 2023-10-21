package com.suunbeam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Book> list = new ArrayList<>();
		Book b;
		Book k;
		int index;
		int choice;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("1. Add Book");
			System.out.println("2. Display All Book");
			System.out.println("3. Search Book");
			System.out.println("4. Delete a book at given index");
			System.out.println("5. Delete A Book With given isbn");
			System.out.println("6. Reverse The String");
			System.out.println("7. Sort By Price");
			System.out.println("8. Save Book In Files");
			System.out.println("9. Load Book In File");

			choice = sc.nextInt();

			switch (choice) {
			case 1:// Add Book
				b = new Book();
				b.acceptData();
				if (list.contains(b)) {
					index = list.indexOf(b);
					k = list.get(index);
					k.setQuantity(k.getQuantity() + 1);
				} else
					list.add(b);
				break;

			case 2:// Display All
				for (Book bk : list)

					System.out.println(bk);
				break;
			case 3:// Search Book
				System.out.println("Enter Isbn Which You Want");
				String i = sc.next();
				Book b1 = new Book();
				b1.setIsbn(i);
				if (list.contains(b1)) {
					System.out.println("Book is Present" + i);
				} else
					System.out.println("Book Not Found");
				break;
			case 4:// Remove from specific index
				System.out.println("Enter Index That you want to Remove");
				index = sc.nextInt();
				list.remove(index);
				break;

			case 5:// Delete A Book whit given isbn
				System.out.println("Enter The ISBN YOu Want To Remove");
				Book b2 = new Book();
				String e = sc.next();
				b2.setIsbn(e);
				index = list.indexOf(b2);
				if (index == -1) {
					System.out.println("Not Found");
				} else
					list.remove(index);
				break;
			case 6:// Reverse The String
				for (Book bk : list) {
					Collections.reverse(list);

					System.out.println("Rev =" + list);
				}
				break;
			case 7:// Sort By Price
				class BookPriceSort implements Comparator<Book> {
					public int compare(Book b1, Book b2) {
						int diff = Double.compare(b1.getPrice(), b2.getPrice());
						return diff;

					}
				}

				BookPriceSort comparator = new BookPriceSort();
				list.sort(comparator);
				break;
				
			case 8://Out-Put
				try(FileOutputStream fout = new FileOutputStream("Book.txt")){
					try(DataOutputStream dout=new DataOutputStream(fout)){
						for(Book book:list) {
							dout.writeUTF(book.getIsbn());
							dout.writeUTF(book.getAuthor_name());
							dout.writeDouble(book.getPrice());
							dout.writeInt(book.getQuantity());
							
							
						}
					}//Dout close
				}//Fout close
				catch(Exception e1) {
					e1.printStackTrace();
				}
				System.out.println("Book Saved");
				break;
			case 9:// Input
				try(FileInputStream fin = new FileInputStream("Book.txt")){
				try(DataInputStream dit =new DataInputStream(fin)){
					while(true) {
						Book book= new Book();
						book.setIsbn(dit.readUTF());
						book.setAuthor_name(dit.readUTF());
						book.setPrice(dit.readDouble());
						book.setQuantity(dit.readInt());
						
						list.add(book);
						
						//System.out.println(book);
					}
					
				}//dit close
				}//fin close
				catch(EOFException e1) {
					//do nothing
				}
				catch(Exception e1) {
					e1.printStackTrace();
				}
				break;
			}
			
		} while (choice != 0);
	}

}