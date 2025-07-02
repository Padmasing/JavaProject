package module1programs;

import java.util.Arrays;

public class ArrayProblem12 {

	public static void main(String[] args) {
		
		String input = "Nawale @ 123";
		
		int countofalphabet = 0;   // for counting we need to declare a variable
		
		int countofdigits = 0;  // for counting we need to declare a variable
		
		int countofspaces = 0; // for counting we need to declare a variable
		
		int countofspecialcharacters = 0;  // for counting we need to declare a variable
		
		
		char c1[] = input.toCharArray();   // converting string into array
		
		System.out.println(Arrays.toString(c1));
		
		
		
		/*boolean b1 =Character.isAlphabetic(c1[0]); // to check char at given index is alphabet or not.
		
		System.out.println(b1);*/
		
		
		
		for(int i=0; i<c1.length;i++) {   
			
			boolean b1 = Character.isAlphabetic(c1[i]);   // to check char at given index is alphabet or not.
			
			boolean b2 = Character.isDigit(c1[i]);        // to check char at given index is digit or not.
			
			boolean b3 = Character.isWhitespace(c1[i]);   // to check char at given index is space or not.   
			
			
			
			//System.out.println(b1);
			//System.out.println(b2);
			
			   if(b1==true) {
				
				   countofalphabet++;
		       }
			   
			   if (b2==true) {
				   
				   countofdigits++;
			   }
			   
               if (b3==true) {
				   
				   countofspaces++;
			   }
			   
		       
		      }
		
		     countofspecialcharacters = input.length()-(countofalphabet+countofdigits+countofspaces);
		
		     System.out.println("count of alphabets in given string is> "+ countofalphabet);
		     System.out.println("count of digits in given string is> "+ countofdigits);
		     System.out.println("count of spaces in given string is> "+ countofspaces);
		     System.out.println("count of special character in given string is> "+ countofspecialcharacters) ;

}
}