package java_programs;

public class Search_Element_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {12,78,20,79,07,99,19};
		int search_element = 19;
		
		boolean status = false;
		
		for (int x : a)
		{
			if (x==search_element)
			{
				System.out.println("Element found in the array");
				status = true;
				break;
			}
		}
        if (status==false) {
        System.out.println("Element not found");
        }
	}

}
