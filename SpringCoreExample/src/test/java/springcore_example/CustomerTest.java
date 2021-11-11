package springcore_example;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {

	@Test
	public void test() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Object customer =  context.getBean("customer");
		
		assertEquals(customer.getClass().getSimpleName(), "Customer");
		
	
		 
	}

}
