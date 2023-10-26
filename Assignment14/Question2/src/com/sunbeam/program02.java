package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class program02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<User> list=new ArrayList<User>();
		 
	/*	
		// add user 
		 try (UserDao dao= new UserDao()){
			 User us= new User();
			 us.accept();
			 int cnt=dao.addUser(us);
			 System.out.println("Rows affected"+cnt);
		 }catch(Exception e ) {
			 e.printStackTrace();
			 
		 }
		
		*/
		/*
		//delete user
		try (UserDao dao= new UserDao()){
			System.out.println("enter id to delete for ");
			int id = sc.nextInt();
			int cnt=dao.deleteUser(id);
			System.out.println("Rows affected"+cnt);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		*/
		
		//Display all ;
		try (UserDao dao= new UserDao()){
			list=dao.displayAll();
			list.forEach(m->System.out.println(m));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		//update;;
		
	}

}
