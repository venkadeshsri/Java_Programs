package java_programs;

import java.util.Arrays;

public class Split_String {

	public static void main(String[] args) {
		
		String e = "venkat@gmail.com";
		String e1[] = e.split("@");
		System.out.println(Arrays.toString(e1));
		System.out.println(e1[0]);
		System.out.println(e1[1]);
		String e2 = Arrays.toString(e1);
		String e3[] = e2.split("\\."); 
		System.out.println(Arrays.toString(e3));

	}

}
