package edu.ycp.cs320.calculator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to the calculator, dawg");
		System.out.println("Welcome to the calculator");
		System.out.println("Fasten your seatbelt!");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		
		double a = keyboard.nextDouble();
		double b = keyboard.nextDouble();
		
		double c = a + b;
		
		System.out.printf("Here is the sum of a and b: %d", c);
		
	}
}
