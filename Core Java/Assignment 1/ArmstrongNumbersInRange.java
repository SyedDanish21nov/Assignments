import java.util.Scanner;
public class ArmstrongNumbersInRange{

public static void main(String[] args){

	int a,b,num,i,rem,arm,counter=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Range: ");
	a=sc.nextInt();
	b=sc.nextInt();
	for(i=a;i<=b;i++)
{	
	num=i;
	arm=0;
	while(num!=0){
	rem=num%10;
	arm=(rem*rem*rem)+arm;
	num=num/10;
}
	if(i==arm){
if(counter==0){
	System.out.println("Armstrong numbers falling in the range of "+a +" and "+b +": ");
	}
	System.out.println(i+" ");
counter++;
	}
}
}
}
