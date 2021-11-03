package com.string.buffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer();
		
		str.append("StringBuffer ");
		str.append("is a peer class of String ");
		str.append("that provides much of ");
		str.append("the functionality of strings ");
		
		System.out.println(str);
		
		StringBuffer str1 = new StringBuffer();
		StringBuffer str2 = new StringBuffer();
		
		str1.append("It is used to _ at the specified index position");
		str2.append("This method returns the reversed object on which it was called");
		str1.insert(str1.indexOf("_"),"insert text" );
		
		System.out.println(str1);
		
		str1.replace(str1.indexOf("_"),(str1.indexOf("_")+1), "");
	
		
		System.out.println(str1);
		
		
		System.out.println(str2.reverse());

	}
}
