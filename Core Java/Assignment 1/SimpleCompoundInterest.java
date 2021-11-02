import java.util.Scanner;
public class SimpleCompoundInterest{

public static void main(String[] args){

	int p,r,t;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Principle: ");
	p=sc.nextInt();
	System.out.println("Enter Rate: ");
	r=sc.nextInt();
	System.out.println("Enter Time: ");
	t=sc.nextInt();

	double simple_interest=p*r*t/100;
	amount=p*Math.pow(1+r , t);	
	
	System.out.println("Simple Interest: "+simple_interest);
	}
	System.out.println("Compound Interest: "+amount);
}
