package java_programs;

import java.util.Arrays;

public class Array_Comparison_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array1[] = {21, 32, 36, 47};  
		int array2[] = {11, 22, 33, 44};
		int[] array3 = {21, 32, 36, 47};   
		
		System.out.println("Are array1 and array2 equal?" + Arrays.equals(array1, array2));   
		System.out.println("Are array1 and array3 equal?" + Arrays.equals(array1, array3));   
		if (Arrays.equals(array1, array2))
				{
			System.out.println("Arrays 1 & 2 equal");
				}
		else if (Arrays.equals(array1, array3))
		{
			System.out.println("Arrays 1 & 3 equal");
		}
		else if (Arrays.equals(array2, array3))
		{
			System.out.println("Arrays 2 & 3 equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
    
		 
	/*	String[] array1 = {"mango","grapes", "plum", "watermelon", "apple"};
		String[] array2 = {"mango","grapes", "plum", "watermelon", "apples"};
		
		if (Arrays.deepEquals(array1, array2))
		{
			System.out.println("Arrays are Equal");
		}
		else
		{
			System.out.println("Arrays are not Equal");
		} */
	}

}
