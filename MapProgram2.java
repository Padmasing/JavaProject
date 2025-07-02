package module1programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapProgram2 {

	public static void main(String[] args) {

		Map<Integer, String> m1 = new HashMap<Integer, String>();  // upcasting

		m1.put(345667, "Prakash"); // to add values
		m1.put(567896, "Dilip");
		m1.put(245643, "Akshay");
		m1.put(678543, "Nitin");
		m1.put(267543, "Atish");

		System.out.println(m1);
		
		
	   System.out.println("Iterating through keys using KeySet():");
		
		for(Integer i1:m1.keySet()) {           // for each loop
			
			System.out.println(i1);
		}
		
		
		System.out.println("Iterating through values using values():");
		
		for(String s2:m1.values()) {            // for each loop
			
			System.out.println(s2);
		}
		
		
		System.out.println("Iterating through keys and values using entryset():");
		
		for (Entry<Integer,String> e1:m1.entrySet()) {
			
			System.out.println(e1);
		}
		
		
		System.out.println("Iterating using Iterator: ");
		
		Set<Entry<Integer,String>> s3 = m1.entrySet();
		
		Iterator<Entry <Integer, String>> i1= s3.iterator();
		
		while(i1.hasNext()) {
			
			System.out.println(i1.next());
			
		}

	}

}
