import java.util.*;

public class ArraySearch {

	public static void main(String[] args) {
		
		int i,n;
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter total number of elements: ");
        n=sc.nextInt();
         
        int arr[]=new int[n];
		
		System.out.println("Enter array elements\n");
    
		for(i=0; i<n; i++)
		{
            System.out.print("Enter element (" + (i) +"): ");
            arr[i]=sc.nextInt();
        }  
        int num;
        System.out.print("Enter number to search: ");
        num=sc.nextInt();
       
        int index=-1;       
        for(i=0;i<n;i++){
            if(arr[i]==num){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("Sorry! " + num + " is not found in array.");
        }
        else{
            System.out.println(num + " found at index " + index);
        }
        sc.close();
	}
}
