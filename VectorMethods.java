package module1programs;


import java.util.Enumeration;
import java.util.Vector;

public class VectorMethods {

	public static void main(String[] args) {
		
		Vector v1 = new Vector();   
		
		v1.add(56);
		v1.add(43);
		v1.add(78);
		v1.add(43);
		v1.add(23);
		v1.add(null);
		

         Enumeration e1 = v1.elements();
         
         while(e1.hasMoreElements()) {
        	 
        	 System.out.println(e1.nextElement());
         }

	}

}
