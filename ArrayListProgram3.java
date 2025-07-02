package module1programs;

import java.util.ArrayList;

public class ArrayListProgram3 {

	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<Integer>();

		a1.add(7);
		a1.add(71);
		a1.add(47);
		a1.add(35);
		a1.add(56);
		a1.add(43);
		a1.add(54);
		a1.add(38);

		System.out.println(a1);

		ArrayList<Integer> a2 = new ArrayList<Integer>();

		a2.add(7);
		a2.add(71);
		a2.add(47);
		a2.add(35);
		a2.add(56);
		a2.add(43);
		a2.add(54);
		a2.add(38);

		Object o = a1.clone();
		
		System.out.println(o);

		System.out.println(a2);
		
		boolean b1 = a1.equals(a2);
		
		System.out.println(b1);

	}

}
