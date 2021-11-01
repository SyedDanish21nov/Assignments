import java.util.*;

public class CUIApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String LoginInput;
		String PasswordInput;
		
		for(int Attempts=2; Attempts>=0; Attempts--)
		{
	System.out.println("Enter your Login name: ");
	LoginInput=sc.next();
	System.out.println("Enter your Passsword: ");
	PasswordInput=sc.next();
	
			if(LoginInput.equals("SYDANISH") && (PasswordInput.equals("12345"))) {
			System.out.println("Welcome "+LoginInput);
			break;
		} 
			else if ((!LoginInput.equals("SYDANISH")) && (!PasswordInput.equals("12345")))
			{
					 System.out.println(Attempts +" Attempts Left\n");
					 System.out.println("\nContact Admin");
			}
		}
	}
}