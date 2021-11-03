package com.string.builder;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
StringBuilder str = new StringBuilder();
		
		str.append("StringBuffer ");
		str.append("is a peer class of String ");
		str.append("that provides much of ");
		str.append("the functionality of strings ");
		
		System.out.println(str);
		
		StringBuilder str1 = new StringBuilder();
		StringBuilder str2 = new StringBuilder();
		
		str1.append("It is used to _ at the specified index position");
		str2.append("This method returns the reversed object on which it was called");
		str1.insert(str1.indexOf("_"),"insert text" );
		
		
		System.out.println(str1);
		
		str1.replace(str1.indexOf("_"),(str1.indexOf("_")+1), "");

	
		
		System.out.println(str1);
		
		
		System.out.println(str2.reverse());
		

	}
}