package module1programs;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethods {

	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();  // Upcasting
		
		c1.add("shoe");
		c1.add("mobile");
		c1.add("Back cover");
		c1.add("mouse");
		c1.add("keyboard");
		
		System.out.println(c1);

	}

}
