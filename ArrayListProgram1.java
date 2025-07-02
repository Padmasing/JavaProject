package module1programs;

import java.util.ArrayList;

public class ArrayListProgram1 {

	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<Integer>();

		a1.add(7);
		a1.add(71);
		a1.add(47);
		a1.add(35);
		
		System.out.println(a1);

		boolean b1 = a1.isEmpty(); // to check Arrayalist is empty or not

		System.out.println(b1);

		a1.clear(); // to make the a1 empty

		System.out.println(a1);
		
		boolean b2 = a1.contains(100);  // to check given object is present or not
		
		System.out.println(b2);
		
		boolean b3 = a1.containsAll(a1);  // to check arraylist contains given collection or not
		
		System.out.println(b3);
		
		

	}

}
