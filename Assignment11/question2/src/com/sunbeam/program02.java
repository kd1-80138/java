package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class program02 {
	public static void main(String [] args)
	{
		Set<Book> set= new LinkedHashSet();
		set.add(new Book("101",500.0,"aa",8));
		set.add(new Book("102",700.0,"bb",7));
		set.add(new Book("103",400.0,"cc",5));
		set.add(new Book("104",700.0,"dd",6));
		set.add(new Book("105",600.0,"ee",4));
		set.add(new Book("106",300.0,"ff",3));
		set.add(new Book("101",500.0,"aa",8));
		
		
		Iterator <Book>itr =  set.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
