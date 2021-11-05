package com.generics.one;

import java.util.HashSet;
import java.util.Iterator;
 
public class EmployeeDemo {

	public static void main(String[] args) {	 
		
				
				Employee obj1 = new Employee(721, "Rohan", 50000, "Finance");
				Employee obj2 = new Employee(724, "Anil", 40000, "IT");
				
				HashSet<Employee> empDetails = new HashSet<>();
				
				empDetails.add(obj1);
				empDetails.add(obj2);
				
				Iterator<Employee> iterate = empDetails.iterator();
				while (iterate.hasNext()) {
					 
					iterate.next().display();
					System.out.println();
					
				}
			}
		}

		class Employee {
				
			public Employee(int id, String name, int salary, String department) {
				super();
				this.id = id;
				this.name = name;
				this.salary = salary;
				this.department = department;
			}

			int id;
			String name;
			int salary;
			String department;
			
			public void display() {
				System.out.println("ID : " + id);
				System.out.println("Name : "+ name );
				System.out.println("Salary : " + salary);
				System.out.println("Department: "+ department);
			}
}