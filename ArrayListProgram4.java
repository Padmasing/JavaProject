package module1programs;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProgram4 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();

		a1.add(7);
		a1.add(71);
		a1.add(47);
		a1.add(35);
		a1.add(56);
		a1.add(43);
		
		System.out.println(a1);
		
		Iterator<Integer> i1 =	a1.iterator();
		
		//i1.next();
		//i1.hasNext();
		
		System.out.println("iteration started:");
		
		while(i1.hasNext()) {
			
			System.out.println(i1.next());
		}


	}

}
