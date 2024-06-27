package java_programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateString {

	public static void main(String args[]) {

		String s = "aabbcc";

		Set<Character> setc = new LinkedHashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			setc.add(s.charAt(i));
		}

		StringBuffer sb = new StringBuffer();

		for (Character c : setc) {
			sb.append(c);
		}
		System.out.println("After removed duplicates in the string : " + sb);
		
	
	}
}