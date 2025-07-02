package module1programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProperty {

	public static void main(String[] args) {
		
		Set<Integer> s1 = new HashSet<Integer>(); // Upcasting
		
		s1.add(56);
		s1.add(43);
		s1.add(67);
		s1.add(89);
		s1.add(63);
		s1.add(67);
		s1.add(null);
		
		System.out.println(s1);
		
		System.out.println("Iteration using Iterator: ");
		
		Iterator<Integer> i1 = s1.iterator();
		
		while(i1.hasNext()) {
			
			System.out.println(i1.next());
		}

	}

}
