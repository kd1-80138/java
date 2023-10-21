package com.sunbeam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Test {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		try (FileWriter fw=new FileWriter("File.txt")){
		try (BufferedWriter bw= new BufferedWriter(fw)){
			
		
		for(int i=0;i<4;i++) {
			System.out.println("Enter A Text");
			String line=sc.nextLine();
			bw.write(line);
			bw.newLine();
		}
		}//bw close
		}//fw close
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
