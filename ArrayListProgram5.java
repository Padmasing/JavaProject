package module1programs;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListProgram5 {

	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<Integer>();

		a1.add(7);
		a1.add(71);
		a1.add(47);
		a1.add(35);
		a1.add(56);
		a1.add(43);
		
		System.out.println(a1);
		
		
		
		ListIterator <Integer>  i1 = a1.listIterator();
		
		System.out.println("forward iteration using ListIterator: ");
		
		while(i1.hasNext()) {
			
			System.out.println(i1.next());
		}
		
		
		
		System.out.println("backward iteration using ListIterator:");
		
		while(i1.hasPrevious()) {
			
			System.out.println(i1.previous());
		}

	}

}
