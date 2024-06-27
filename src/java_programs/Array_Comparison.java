package java_programs;

import java.util.Arrays;

public class Array_Comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array1[] = {'a','b','c','d','e'};
		int array2[] = {'a','b','c','d','e'};
		 
		if (Arrays.equals(array1, array2))
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}

	}

}

