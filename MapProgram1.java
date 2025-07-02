package module1programs;

import java.util.HashMap;
import java.util.Map;

public class MapProgram1 {

	public static void main(String[] args) {

		Map<Integer, String> m1 = new HashMap<Integer, String>();

		m1.put(345667, "Prakash"); // to add values
		m1.put(567896, "Dilip");
		m1.put(245643, "Akshay");
		m1.put(678543, "Nitin");
		m1.put(267543, "Atish");

		System.out.println(m1);
		
		m1.remove(567896, "Dilip"); // to remove the key with value
		
		System.out.println(m1);
		
		Map<Integer, String> m2 = new HashMap<Integer, String>();

		m2.put(345667, "Prakash"); // to add values
		m2.put(567896, "Dilip");
		m2.put(245643, "Akshay");
		m2.put(678543, "Nitin");
		m2.put(267543, "Atish");
		
		System.out.println(m2);
		
		m2.replace(245643, "Sharad");  // key is same value gets replaced (Akshay replaced by Sharad)
		
		System.out.println(m2);
		
		m2.replace(345667, "Prakash", "Vaibhav"); // key is same value gets replaced (Prakash replaced by Vaibhav)
		
		System.out.println(m2); 
		
		String s = m2.get(267543); // to get the value associated with this key
		
		System.out.println(s);


	}

}
