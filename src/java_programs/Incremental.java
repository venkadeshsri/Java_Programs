package java_programs;

public class Incremental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int a = 10, b=10;
		int res = a++;  // post increment -- > first assigned to variable so it res =10
		System.out.println(res);
		System.out.println(a);
		
		int res1 = ++b; //pre increment
		System.out.println(res1);
		System.out.println(b);
		
		a*=2; //a = a*2
		System.out.println(a);

	}

}
