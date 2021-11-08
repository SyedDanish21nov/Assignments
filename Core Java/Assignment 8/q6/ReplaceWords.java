package com.lambda.six;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
public class ReplaceWords {

	public static void main(String[] args) {
				 
				List<String> str = Arrays.asList("Aman", "Shivam","Rishab");
				
				UnaryOperator<String> unaryOperator = (list) -> list.toUpperCase();
				
				str.replaceAll(l -> unaryOperator.apply(l));
				
				 System.out.println(str);

	}

}
