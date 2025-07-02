package module1programs;

public class StringFunction7 {

	public static void main(String[] args) {
		
		String a = new String("Automation"); // creating object of String class and passing parameter to invoke the parameterized constructor
		
		           a.concat("Testing");    // we cant modify string (immutable)
		           
		           System.out.println(a);
		           
	    String a1 =  a.concat(" Testing");  // we can give birth to new string       
		           
		         System.out.println(a1);
		           
		StringBuffer s1 = new StringBuffer("API"); // creating object of StringBuffer class and passing parameter to invoke the parameterized constructor
		
		                s1.append(" Testing");     // we can modify stringbuffer (mutable)
		                
		                System.out.println(s1);
		                
		StringBuilder s2 = new StringBuilder("manual"); // creating object of StringBuilder class and passing parameter to invoke the parameterized constructor   
		
		                  s2.append(" Testing");   // we can modify stringbuilder (mutable)
		                  
		                System.out.println(s2);  

	}

}
