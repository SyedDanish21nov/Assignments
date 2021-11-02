package com.java.singleton;

public class Abc {

	private static Abc abc;
	
	private Abc()
	{
		
	}
	public static Abc getInstance()
	{
		if(null == abc)
		{
			abc = new Abc();
		}
		return abc;
	}
}
