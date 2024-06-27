package java_programs;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Sorting_numbers_Array {

	public static void main(String[] args) {
		
		Integer a[] = {8,5,2,3,1,7,9};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a, Collections.reverseOrder()) ;
	
		System.out.println("After Sorting");
		System.out.println("After : " + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Ascending order : " + Arrays.toString(a));

		Object c[] = {'m','v','a','e'};
		Arrays.sort(c);
		System.out.println("Ascending order : " + Arrays.toString(c));
		Arrays.sort(c, Collections.reverseOrder());
		System.out.println("Descending order : " +Arrays.toString(c));
		
	}

}
