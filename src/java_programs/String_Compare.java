package java_programs;

import java.util.Arrays;

public class String_Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1, s2;
		s1 = "compare";
		s2 = "Compare";

		if (s1.equals(s2)) { // equals -- it case sensitive equalsignorecase - it ignore case sensitive
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}

		System.out.println(s2.replace("C", "c"));


	}

}
