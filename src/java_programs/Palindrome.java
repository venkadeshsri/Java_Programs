package java_programs;

public class Palindrome {

	public static void main(String[] args) {

		String name = "racecar";
		String rev = "";
	char a[] = name.toCharArray();
		for (int i = a.length - 1; i >= 0; i--) {
			rev = rev + a[i];
		}
		System.out.println(rev);
		
		if (name.equals(rev))
		{
			System.out.println("It's palindrome");
		}
		else {
			System.out.println("It's not a palindrome");
		}
		
		/*Second approach to check palindrome with renmoving spaces */

		String name1 = "Red roses run no risk, sir, on Nurse’s order" ;    //"never odd or even";
		String remuv = name1.replace(" ", "");
		System.out.println("Before reverse: " + remuv);
		String remuspace=null;
		for (int i=name1.length()-1;i>=0;i--)
		{
			rev = rev + name1.charAt(i);
			remuspace = remuv.replace(" ","");
		}
		System.out.println("After reverse : " + remuspace);
		if (remuv.equals(remuspace)) 
		{
			System.out.println("It's palindrome");
		}

		else {
			System.out.println("It's not a palindrome");
		}
		String original = "Army";
		String rearranged = "" + original.charAt(2) + original.charAt(0) + original.charAt(1) + original.charAt(3);
		System.out.println(rearranged);
	}

}
