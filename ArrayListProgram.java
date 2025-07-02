package module1programs;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		a1.add(7);  // to add the value in Arraylist
		a1.add(71);
		a1.add(47);
		a1.add(35);
		
		a1.add(1, 89); // at the index position 1 added the value 89
		
		System.out.println(a1);
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		
		a2.add(6);
		a2.add(76);
		a2.add(78);
		a2.add(45);
		
		System.out.println(a2);
		
		//a2.addAll(a1);   // a1 collection get added in a2 collection
		
		a2.addAll(0, a1); // 0th index a1 get added
		
		System.out.println(a2);
		
		

	}

}
