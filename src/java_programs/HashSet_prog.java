package java_programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet myset = new HashSet(); //to add hetrogenious data
		
		// HashSet<String> myset1 = new HashSet<>(); // to declare particular data
		
		myset.add("venkat");  //adding elements using add
		myset.add("venkat");
		myset.add(123);
		myset.add(true);
		myset.add(null);
		myset.add(null);
		myset.add(99.99);
		System.out.println(myset);
		System.out.println("");
	//Insertion order not possible	
	//Unable to access particular element in hashset, so we can use arraylist to access particular element
		
		ArrayList al = new ArrayList(myset);
		System.out.println(al.get(2));
		
		// for loop is not possible bcoz no insertion order
		//For each option to read element
		System.out.println("");
		for (Object x : myset)
		{
			System.out.println(x);
		}
		
		System.out.println("");
		System.out.println("Using Iterator method to read the elements");
		Iterator<Object> it = myset.iterator();
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }
	//Clearing the elements using clear
	    
	    myset.clear();
	    System.out.println("Hashset is empty? : " + myset.isEmpty());
	    System.out.println(myset);
	}

}
