import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1,s2,s3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of three subjects: ");
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		if(s1>60 && s2>60 && s3>60)
		{
			System.out.println("Passed");
		}
		else if(s1>60 && s2>60 || s3>60) {
			System.out.println("Promoted");
		}
		else if(s1>60 || s2<60 || s3<60){ 
			System.out.println("failed");
		}
	}

}
