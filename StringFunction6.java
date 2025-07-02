package module1programs;

import java.util.Arrays;

public class StringFunction6 {

	public static void main(String[] args) {
		
		String a = "My Name is Padmasing";
		
	    String output [] = a.split(" ");  // it separates from where the space present
	    
	    System.out.println(Arrays.toString(output));
	    
	    String output1 [] = a.split(" ", 2);  // it splits in 2 parts i.e. 1 comma in middle
	    
	    System.out.println(Arrays.toString(output1));
	    
	   // we can write a string in this manner also
	    
	    String a1 = new String("Padmasing");
	    
	    System.out.println(a1);

	}

}
