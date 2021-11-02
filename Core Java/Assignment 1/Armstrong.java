import java.util.Scanner;
public class Armstrong{

public static void main(String[] args){

	int n,m,rem,arm=0;
	System.out.println("Enter the Number:");
	Scanner r = new Scanner(System.in);
	n=r.nextInt();
	m=n;
	while(n>0)
{
	rem=n%10;
	arm=(rem*rem*rem)+arm;
	n=n/10;
}
	if(m==arm)
	System.out.println("isArmstrong");
else
	System.out.println("not an Armstrong");
	}
}
