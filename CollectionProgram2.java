package module1programs;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionProgram2 {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();

		a1.add(87);
		a1.add(56);
		a1.add(78);
		a1.add(56);
		a1.add(4);
		a1.add(3);
		a1.add(956);
		
		Collections.sort(a1);
		
		System.out.println(a1);

	}

}
