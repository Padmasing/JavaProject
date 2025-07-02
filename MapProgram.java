package module1programs;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

	public static void main(String[] args) {

		Map<Integer, String> m1 = new HashMap<Integer, String>();

		m1.put(345667, "Prakash");  // to add values
		m1.put(567896, "Dilip");
		m1.put(245643, "Akshay");
		m1.put(678543, "Nitin");
		m1.put(267543, "Atish");

		System.out.println(m1);

		Map<Integer, String> m2 = new HashMap<Integer, String>();

		m2.put(34231, "Ritesh");  // to add values
		
		System.out.println(m2);
		
		m2.putAll(m1);              // to add map in map
		
		System.out.println(m2);
		
		boolean b1 = m1.equals(m2);   //  to check both maps are equal or not
		
		System.out.println(b1);
		
		m2.putIfAbsent(213454, "Ritesh");  // add values if keys are different (absent)
		
		System.out.println(m2);
		
		boolean b2 = m2.containsKey(213454);  // to check this key is associted with someone or not
		
		System.out.println(b2);
		
		boolean b3 = m2.containsValue("Nitin");  // to check this value is associted with someone or not
		
		System.out.println(b3);
		
		m2.remove(245643); // to remove the key with value
		
		System.out.println(m2);
		

	}

}
