package com.collection.one;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
				 
				Contact obj1 = new Contact( 9356547898L, "Anil" , "anil@gmail.com" , "Male");
				Contact obj2 = new Contact( 7098654845L, "Ananya" , "ananya@gmail.com" , "Female");
				Contact obj3 = new Contact( 6845789668L, "Joseph" , "joseph@gmail.com" , "Male");

				TreeMap<Long, Contact> data = new TreeMap<Long, Contact>(Collections.reverseOrder());
				//the treemap by default keeps the key sorted in ascending 
				//so to sort in descending order we have to pass Collections.reverseOrder() to the constructor
				
				data.put(1234L, obj1);
				data.put(123456780L, obj2);
				data.put(1238244L, obj3);
			 	 
				 System.out.println("Keys : "+data.keySet() + "\n");
				 System.out.println("Values : " + data.values() + "\n");
				 System.out.println(data + "\n");
	}

}
