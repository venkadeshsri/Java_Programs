package java_programs;

public class Missingno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5};
		
		int sum1 = 0;
		//System.out.println(a.length);
		
		for (int i= 0; i < a.length;i++)
		{
			sum1 = sum1 + a[i];
		} 

	//	System.out.println(sum1);
		
		int sum2 = 0;
		for(int i=1; i<=6;i++)
		{
			sum2=sum2+i;
		}
		
		System.out.println("Missing no is : " + (sum2-sum1));
	}

}
