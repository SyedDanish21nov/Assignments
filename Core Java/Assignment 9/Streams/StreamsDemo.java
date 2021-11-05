package com.streams.all;

import java.util.*;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
		
public class StreamsDemo {

	public static void main(String[] args) {

		

				List<Trader> trader = Arrays.asList(
						
							new Trader("Rahul", "Pune"),
					        new Trader("Maria","Mumbai"),
					        new Trader("Aman","Pune"),
					        new Trader("Rohan","Mumbai"),
					        new Trader("Rohit","Pune"),
					        new Trader("Ravi","Pune")
					        );
							
							List<Transaction> transactions = Arrays.asList(
					            new Transaction(trader.get(0), 2011, 300), 
					            new Transaction(trader.get(1), 2012, 1000),
					            new Transaction(trader.get(2), 2011, 400),
					            new Transaction(trader.get(3), 2014, 710),	
					            new Transaction(trader.get(4), 2013, 700),
					            new Transaction(trader.get(5), 2011, 950));
							
										
								//Eight Question
							
							List<Transaction> year2011 = transactions.stream()
				                    .filter(transaction -> transaction.year == 2011)
				                    .sorted(Comparator.comparing(t->t.value))
				                    .collect(toList());
				                   
								System.out.println("All Transaction in the year 2011: "+year2011);

							 
								//Tenth Question			

							        List<Trader> traders =  trader.stream()
							        				.filter(t -> t.city.equals("Pune"))
							        				.sorted(Comparator.comparing(t->t.name))
							        				.collect(toList());
							        			System.out.println("All Traders from Pune: "+traders);
							        
						}
		}
							class Trader
							{
							String name;
							String city;
							public Trader(String name, String city)
							{
								super();
								this.name = name;
								this.city = city;
							}
							@Override
								public String toString() {
								
									return  name;
								}
							
						}

						class Transaction
						{
							Trader trader;
							int year;
							int value;
							public Transaction(Trader trader, int year, int value)
							{
								super();
								
								this.trader = trader;
								this.year = year;
								this.value = value;
					
							}
							@Override
							public String toString() {
													
								return trader.name+ " " + year +" "+ value;
			}
}
