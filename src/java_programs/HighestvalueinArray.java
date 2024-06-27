package java_programs;

import java.util.Arrays;

public class HighestvalueinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] arr = {10, 32400, 45, 90, 9808};
		      /*  int max = Arrays.stream(arr).max().getAsInt();
		         Arrays.sort(arr);
		         System.out.println("Largest in given array is " + max); */
		     		         
		        int max = arr[0];
		        
		        for (int i=1; i <arr.length; i++)
		        {
		        	if (arr[i]>max)
		        	{
		        		max =arr[i];
		        	}
		        }
		        System.out.println("Largest in given array is " + max);
		        
		        int sum = 0;
		        
		        for (int i =0; i < arr.length; i++)
		        {
		        
		        	sum = sum + arr[i];
		        }
		        System.out.println("Sum of given array is " + sum);
		    }
}
