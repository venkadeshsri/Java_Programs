package java_programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesfrmArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dup[] = {9,1,2,3,4,5,7,3,2,1,4,5};
		
		Set<Integer> setarray = new LinkedHashSet<>();
		for (int numb : dup)
		{
			setarray.add(numb);
			
		}
		
		for (int numb : setarray)
		{
			System.out.print(numb + ",");
		}

	} 

}
