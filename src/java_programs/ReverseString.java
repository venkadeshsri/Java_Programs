package java_programs;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "java";
		
		
		StringBuffer sb = new StringBuffer(name);
		StringBuffer rev = sb.reverse();
		
		//StringBuilder sb = new StringBuilder(name);
		//StringBuilder rev = sb.reverse();
		
		
		System.out.println("Reverse a string using StringBuffer : " + rev);
		
		String rev1 = "";
		for (int i=name.length()-1;i>=0;i--)
		{
			rev1 = rev1 + name.charAt(i);
		}
        System.out.println("Reverse a string using for loop " + rev1);
        
        //------------second approach--------
        
        char a[] = name.toCharArray();
        String rev2="";
        
        for (int j=a.length-1; j>=0;j--)
        {
        	rev2 = rev2+a[j];
        }
 System.out.println("Reverse a string using second approach : " + rev2);
	}
	

}
