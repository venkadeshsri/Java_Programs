package java_programs;

public class Odd_Even_nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nos[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Even nos are : ");
		for (int i=0; i<nos.length;i++)
		{
			if (nos[i]%2==0)
			
			System.out.println( nos[i]);
		}
		System.out.println("Odd nos are : ");
		for (int i=0; i<nos.length;i++)
		{
			
			if (nos[i]%2!=0)
			System.out.println( nos[i]);
		}
		

	}

}
