package java_programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeduplicate {

	public static void main(String[] args) {

		String iptext = "privacccya999";
		Set<Character> settext = new LinkedHashSet<Character>();
		for (int i = 0; i < iptext.length(); i++) {
			settext.add(iptext.charAt(i));
		}

		StringBuffer sb = new StringBuffer();
		for (Character c : settext) {
			sb.append(c);
		}

		System.out.println("String after removed : " + sb);

	}
}
