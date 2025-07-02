package module1programs;

import java.util.Arrays;

public class ArrayProblem8 {

	public static void main(String[] args) {
		
		String a1 = "heart";
		String a2 = "earth";
		
		if(a1.length()!=a2.length()) {
			
			System.out.println("since length of two strings are not same they are not ANAGRAM");
		}
		else {
			
			      // converting string into array
			       char c1[] = a1.toCharArray();
			       char c2[] = a2.toCharArray();
			
			     // sorting of array
			       Arrays.sort(c1);
			       Arrays.sort(c2);
			
			     // checking sorted or not
			
			       System.out.println(Arrays.toString(c1));
			       System.out.println(Arrays.toString(c2));
			  
			     // compare to check anagram or not
			
			       if(Arrays.equals(c1, c2)){
				
				   System.out.println("Anagram");
			       }
			       else {
				
				   System.out.println("Not Anagram");
			       }
		}

	}

}
