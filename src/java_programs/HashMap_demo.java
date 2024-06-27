package java_programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	HashMap hm = new HashMap();
		Map hm = new HashMap();
	//	HashMap<Integer, String> hm = new HashMap<Integer, String>();  //Declare using datatypes
		
		hm.put(100, "venkat");
		hm.put(101, "Siddarth");
		hm.put(102,"Rohith");
		hm.put(100, "venkat");
		hm.put(103, "Rajesh");
		
		System.out.println(hm.size());
		
		System.out.println(hm);
		hm.remove(100);   //Removing using key value, here 100 is key of the pair
		System.out.println("After removing : " + hm);
		
		System.out.println(hm.get(101));  //get data from the map
		System.out.println(hm.keySet());  //get data from key in the map
		System.out.println(hm.values());  //get data from values in the map
		System.out.println(hm.entrySet()); //get whole data from the map
	
	//Reading data from for each loop, for loop will not work bcoz it didnt have insertion order
		
		for (Object x : hm.keySet())
		{
			System.out.println("Data from the Map : " + x + "     " + hm.get(x));
		}
	
		System.out.println("Using Iterator method");
	Iterator<Entry <Integer,String>> it = hm.entrySet().iterator(); // Iterate using "<Entry <Integer,String>>"
	while(it.hasNext())
	{
		
		Entry<Integer, String> data = it.next();		
		System.out.println(data.getKey() + "    " + data.getValue());
	}
	hm.clear();
	System.out.println("Map is empty? : " + hm.isEmpty());
	}

}
