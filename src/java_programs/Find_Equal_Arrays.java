package java_programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Find_Equal_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5};
		int b[] = {1,2,3,4,6};
		
		
		boolean status = Arrays.equals(a, b); 
		
		if (status == true)
		{
			System.out.println("Arrays are Equal");
		}
		else 
		{
			System.out.println("Arrays are Not Equal");
		}

	}

}
