package java_programs;

public class Palindrome_No {

	public static void main(String[] args) {
		int num = 4541;
		int org_no = num;
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10; 
			num = num / 10;
		}


		if (org_no == rev) {
			System.out.println(org_no + " no is palindrome");
		}

		else {
			System.out.println(org_no + " no is not palindrome");
		}
	}

}
