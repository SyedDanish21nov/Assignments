import java.util.Scanner;

public class TotalAndAverage {

	public static void main(String[] args) {
 
		        Scanner sc = new Scanner(System.in); 
		        int n=3;    
		        
		        int arr[] = new int[n]; 
		        System.out.println("Enter the marks of First student in subject A, B, C respectively: ");
		        for(int i=0;i<n;i++)  
		        {
		            arr[i]=sc.nextInt();
		        }
		        
		        int total1=0;
			       
		        for(int i=0;i<n;i++)
		        {
		            total1=total1+arr[i];
		        }
		       
		        System.out.println("Total score of First student: "+total1);
		        
		        float Average1; 
		        Average1 = total1/3; 
		       
		        System.out.println( "Average score of First student: " + Average1 + "\n");
		        
		        System.out.println("Enter the marks of Second student in subject A, B, C respectively: ");
		        for(int j=0;j<n;j++)   
		        {
		            arr[j]=sc.nextInt();
		        }
		        
		        int total2=0;
		        for(int j=0;j<n;j++)
		        {
		            total2=total2+arr[j];
		        }
		        
		        System.out.println("Total score of Second student: "+total2);
		        
		        float Average2; 
		        Average2 = total2/3;       
		       
		        System.out.println( "Average score of Second student: " + Average2 +"\n");
		        
		        
		        System.out.println("Enter the marks of Third student in subject A, B, C respectively: ");
		        for(int k=0;k<n;k++)   
		        {
		            arr[k]=sc.nextInt();
		        }
		        int total3=0;
		        for(int k=0;k<n;k++)
		        {
		            total3=total3+arr[k];
		        }
		        
		        System.out.println("Total score of Third student: "+total3);
		        		        
		        float Average3; 
		        Average3 = total3/3;
		        
		        System.out.println( "Average score of Third student: " + Average3 + "\n");
		        
		    }   
		}
