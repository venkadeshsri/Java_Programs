package java_programs;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int a[] = {1,2,3,4}
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter your no : ");
		 * 
		 * int numb = sc.nextInt(); // int rev = 0; /* while (numb != 0) { rev = rev *
		 * 10 + numb % 10; numb = numb / 10;
		 * 
		 * }
		 * 
		 * StringBuffer sb = new StringBuffer(String.valueOf(numb));
		 */

		int num = 7912;
		String temp = "" + num; 
		StringBuffer sb = new StringBuffer(temp);
		StringBuffer rev = sb.reverse();
		
		System.out.println("Reverse a no is : " + rev.toString());
		
		String s = "java";
		String temp1 = "" + s;
		StringBuffer sb1 = new StringBuffer(temp1);
		StringBuffer res = sb1.reverse();
		System.out.println("Reversed string is : " + res);
		
	}

}
