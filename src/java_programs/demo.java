package java_programs;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="venkat";
		String rev = "";
		String temp = name;
		//System.out.println(name);
		for (int i=name.length()-1;i>=0;i--) {
			rev = rev+name.charAt(i);
		}
		System.out.println(rev);
		if (temp.equals(rev))
		{
			System.out.println(temp + " " + "its palindrome");
		}
		else {
			System.out.println(temp +" " +  "not palindrome");
			
		}
		
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter the no: ");
		 * int a = sc.nextInt();
		 */
		int a=121;
		int b = a;
		int c= 0;
		
		while (a!=0)
		{
			c = c*10 + a%10;
			a = a/10;
		}
		System.out.println(c);
		if (b==c)
		{
			System.out.println(b + " " + "its palindrome");
		}
		else {
			System.out.println(b + " " + " not palindrome");
		}
	}

}
