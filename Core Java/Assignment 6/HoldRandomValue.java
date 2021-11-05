package com.generics.two;

import java.util.HashMap;

public class HoldRandomValue
{

	public static void main(String[] args)
	{
				 
				HashMap<Integer, Double> randomValues = new HashMap<>();
				
				randomValues.put(7, 10.0);
				randomValues.put(2, 23.0);
				randomValues.put(8, 80.0);
				randomValues.put(3, 40.0);
				randomValues.put(9, 50.0);
				randomValues.put(6, 67.0);
				randomValues.put(7, 70.0);
				randomValues.put(8, 90.0);
				randomValues.put(4, 34.0);
				randomValues.put(10, 23.0);
				
				System.out.println(randomValues);

	}

}
