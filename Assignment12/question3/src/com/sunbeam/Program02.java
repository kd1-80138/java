//3. Create a functional interface Arithmetic with single abstract method double calc(double,double). Write a static method calculate() in main
//class as follows. In main(), write a menu driven program that inputs two numbers from the user and calls calculate() method with appropriate lambda
//expression (in arg3) to perform addition, subtraction, multiplication and division operations.

package com.sunbeam;

import java.util.function.*;
import java.util.*;

interface Arithmetic {
	public double calc(double b1, double b2);
}

public class Program02 {

	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: " + result);
	}

	public static void main(String[] args) {
		double a = 0;
		double b = 0;

		Scanner sc = new Scanner(System.in);
		int ch = 0;
		do {
			System.out.println("enter two numbers");
			a = sc.nextDouble();
			b = sc.nextDouble();
			System.out.println("1- Addition \n 2- Substraction \n 3-Multiplication \n 4- Division");
			System.out.println("Enter your choice ");
			ch = sc.nextInt();

			switch (ch) {
			case 1:// addition

				System.out.println("Addition = ");
				calculate(a, b, (x, y) -> x + y);

				break;
			case 2: // Substraction

				System.out.println("Substraction  = ");
				calculate(a, b, (x, y) -> x -y);

				break;
			case 3: // multiplication

				System.out.println("Substraction  = ");
				calculate(a, b, (x, y) -> x * y);

				break;

			case 4: // Division

				System.out.println("Substraction  = ");
				calculate(a, b, (x, y) -> x / y);

				break;

			}

		} while (ch != 0);
	}

}
