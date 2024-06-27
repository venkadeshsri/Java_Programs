package java_programs;

public class Find_Duplicates_Array {

	public static void main(String[] args) {

       int a[] = {7,8,9,0,1,2,7,4,9,9,3,9};
       int num = 9;
       int count = 0;
       for(int b : a)
       {
    	   if (b==num)
    	   {
    		   count++;
    	   }
    	   
       } System.out.println("Total no of duplicates are : " + count);

	}

}
