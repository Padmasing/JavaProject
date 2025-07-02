package module1programs;

public class StringFunction5 {

	public static void main(String[] args) {
		
		String a = "world";
		
		// check if the given string has exact 5 letters in it.
		
		boolean b1 = a.matches(".....");
		
		System.out.println(b1);
		
		// check if the given string is starting with w or not
		
		boolean b2 = a.matches("w(.*)");
		
		System.out.println(b2);
		
		// check if the given string is ending with d or not
		
		boolean b3 = a.matches("(.*)d");
		
		System.out.println(b3);
		
		// check if the given string has man in it.
		
		String b = "spiderman";
		
		boolean b4 = b.matches("(.*)man(.*)");
		
		System.out.println(b4);
		
		

	}

}
