package java_programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Unique_String_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String uniq = "tes";
		char[] c = uniq.toCharArray();
		Set<Character> uniqset = new HashSet<>();
		boolean is_uniq = true;
		for (char x : c) {
			if (uniqset.contains(x)) {
				is_uniq = false;
				System.out.println("It's not unique");

			} else {
				uniqset.add(x);

			}
		}
		if (is_uniq)
			System.out.println("All characters are unique!");

	}
}