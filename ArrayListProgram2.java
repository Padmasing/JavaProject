package module1programs;

import java.util.ArrayList;

public class ArrayListProgram2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();

		a1.add(7);
		a1.add(71);
		a1.add(47);
		a1.add(35);
		
		System.out.println(a1);
		
		ArrayList<Character> a2 = new ArrayList<Character>();
		
		a2.add('P');
		a2.add('Q');
		a2.add('R');
		a2.add('S');
		a2.add('T');
		
		System.out.println(a2);
		
		a2.remove(0);  // removing object based on indexing
		
		System.out.println(a2);
		
		ArrayList<String> a3 = new ArrayList<String>();
		
		a3.add("Ram");
		a3.add("Sita");
		a3.add("Gita");
		a3.add("Pita");
		
		System.out.println(a3);
		
		a3.remove("Gita"); // removing object based on object  
		
		System.out.println(a3);
		
		
		ArrayList<String> a4 = new ArrayList<String>();
		
		a4.add("Ankit");
		a4.add("Vikram");
		a4.add("Shubham");
		a4.add("Pravin");
		
		a4.addAll(a3);  // added a3 to a4
		
		System.out.println(a4);
		
		a4.removeAll(a3);  // removed a3 from a4
		
		System.out.println(a4);
		

	}

}
