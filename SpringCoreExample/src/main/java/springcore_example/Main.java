package springcore_example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//System.out.println("Hello");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Customer customer = (Customer) context.getBean("customer");
		
		//customer.displayInfo();
		System.out.println(customer);
	
	}

}
