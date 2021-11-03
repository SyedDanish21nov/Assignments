package com.exception.handling;

import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
	
		int n1,n2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Dividend: ");
		n1=sc.nextInt();
		
		System.out.println("Enter Divisor: ");
		n2=sc.nextInt();
		
		try {
			int div=n1/n2;
			System.out.println("Result= "+div);
		}
		catch(ArithmeticException e) {
			System.out.println("Error: "+e.getMessage());
			
		}
	}
}