package com.exception.handling;

import java.util.Scanner;

public class ExceptionHandlingDemo2 {

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
		catch (UnsupportedOperationException e) {
			
			System.out.println("Error: "+e.getMessage());
			  
			if (e.getCause()!=null) {
				
				System.out.println("Cause by :"+ e.getCause());	
			}
		}		
	}
	
	 public static void name( int n1, int n2) throws UnsupportedOperationException {
		  
		 try {
			System.out.println(n1/n2);
		} catch (Exception e) {
			throw new UnsupportedOperationException("Exception:", e );
		} 
	 } 
}
