package com.string.pool;

public class PrintTheFollowingString {

	public static void main(String[] args) {

		String str1 = "Java String pool refers to collection of Strings which are stored in heap memory";
		String str2 = "java string pool refers to collection of strings which are stored in heap memory";
				
				System.out.println(str1.toLowerCase());
				System.out.println(str1.toUpperCase());
				System.out.println(str1.replace("a", "$"));
				System.out.println(str1.contains("collection"));
				System.out.println(str2.equals(str1));
				System.out.println(str1.equalsIgnoreCase("java string pool refers to collection of strings which are stored in heap memory"));
	}

}
