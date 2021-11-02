import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		int s1;
		System.out.println("Enter CTC: ");
		
		Scanner sc = new Scanner(System.in);
		s1=sc.nextInt();
	
		if(s1==0 || s1<=180000)
		{
			System.out.println("Tax payable in Percentage: Nil");
		}
		else if(s1==181001 || s1<=300000) {
			System.out.println("Tax payable in Percentage: 10%");
		}
		else if(s1==300001 || s1<=500000){ 
			System.out.println("Tax payable in Percentage: 20%");
		}
		else if(s1==500001 || s1<=1000000){ 
			System.out.println("Tax payable in Percentage: 30%");
		}
		else {
			System.out.println("Enter Valid CTC!");
		}
	}
}
