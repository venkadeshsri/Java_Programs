package java_programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList mylist = new ArrayList(); //to add hetrogenious data
		List mylist = new ArrayList(); //to add hetrogenious data
		//ArrayList<String> mylist = new ArrayList<String>();  //to add homogenious / same datatype
		
		mylist.add(100);
		mylist.add("venkat");
		mylist.add("Testing");
		mylist.add(9998.77);
		mylist.add(null);
		mylist.add(true);
		mylist.add(null);
		mylist.add(false);
		mylist.add(100);
		
		System.out.println("Data available in the ARRAY LIST -- " + mylist);
		
		mylist.remove(6); // here 6 is the index of the element in the arraylist
		System.out.println("After Removed - ARRAY LIST :" + mylist);
		
	
		System.out.println("Getting data from the Array List: " + mylist.get(2));
		
		mylist.add(4, "JAVA"); //Inserting element using index
		System.out.println("After Inserted - ARRAY LIST :" + mylist);
		
		mylist.set(2, "CODING"); // Modify / Change / update the elements in the arraylist
		System.out.println("After modified/ changed - ARRAY LIST :" + mylist);
		
		System.out.println("");
		
		//to read the data from for loop
	/*	for (int i =0; i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		} */
		
	/*	System.out.println("Data reading from the Array List using For each option");
		for (Object x : mylist)
		{
			System.out.println(x);
		} */
		
		System.out.println("Data reading from  Array List using ITERATOR method");
		Iterator it = mylist.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("");	
		System.out.println("Checking Arraylist empty : " + mylist.isEmpty());
		
		//mylist.remove(2); // to remove particular element using index
		// mylist.clear() // to remove all elements
		// to remove random element - check below
	/*	ArrayList mylist2 = new ArrayList();
		mylist2.add("JAVA");
		mylist2.add(false);
		mylist.removeAll(mylist2);  
		
		*/
		
		
		
			
		
	}

}
