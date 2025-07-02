package module1programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListProperty1 {

	public static void main(String[] args) {

		List l1 = new ArrayList(); // upcasting (converting the child class object into parent class)

		l1.add(6.35);
		l1.add(7);
		l1.add("abs");
		l1.add('P');
		l1.add(1234567890l);
		l1.add(6.35);
		l1.add(null);

		System.out.println(l1);
		
		
		System.out.println("forward iteration using Iterator");

		Iterator i1 = l1.iterator(); 

		while (i1.hasNext()) {

			System.out.println(i1.next());
		}
		
		
		
		System.out.println("forward iteration using ListIterator");

		ListIterator i2 = l1.listIterator(); 

		while (i2.hasNext()) {

			System.out.println(i2.next());
		}
		
		
		
		System.out.println("backward iteration using ListIterator");

		while (i2.hasPrevious()) {

			System.out.println(i2.previous());
		}

	}

}
