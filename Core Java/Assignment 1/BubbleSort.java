import java.util.*;

public class BubbleSort
{
	public static void main(String[] args)
	{
				int[] A= {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
				
		        for(int i=0; i<=A.length; i++)
		        {
		        	for(int j=0; j<A.length-1; j++)
		        	{
		        		if(A[j]>A[j+1])
		        		{
		        			int temp=A[j];
		        			A[j]=A[j+1];
		        			A[j+1]=temp;
		        		}
		        	}
		        }
		        for(int i=0; i<A.length; i++) {
		        	System.out.print( A[i] +" ");
		        }
	}
}
