package com.sunbeam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Test {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		try (FileReader fr=new FileReader("File.txt")){
		try (BufferedReader br= new BufferedReader(fr)){
			
		String line;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		}//bw close
		}//fw close
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
