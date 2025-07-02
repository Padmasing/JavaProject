package module1programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListProperty {

	public static void main(String[] args) {
		
		List<Double> l1 = new ArrayList<Double>();  // upcasting (converting the child class object into parent class)
		
		l1.add(6.35);
		l1.add(7.35);
		l1.add(4.35);
		l1.add(3.35);
		l1.add(2.35);
		l1.add(6.35);
		l1.add(null);
		
		System.out.println(l1);
		
		Iterator<Double> i1 = l1.iterator();
		
		while(i1.hasNext()) {
			
			System.out.println(i1.next());
		}

	}

}
