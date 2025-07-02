package module1programs;

public class StringFunction {

	public static void main(String[] args) {
		
		String a = "Automation";
		
		a.length();    // to count the no of characters present in the string (start form 1)
		
		int size = a.length();
		
		System.out.println(size);
		
		String uppername = a.toUpperCase();  // to convert the string into uppercase
		
		System.out.println(uppername);  
		
		String lowername = a.toLowerCase();  // to convert the string into lowercase
		
		System.out.println(lowername);
		
		boolean b = a.equals("Automation");        // to check given string is same or not
		
		System.out.println(b);    
		
		boolean b1 = a.equalsIgnoreCase("AUTOMATION");  // to check given string is same or not ( ignore case sensitiveness )
		
		System.out.println(b1);
		
		boolean b2 = a.contains("Auto");   // to check given string is present or not
		
		System.out.println(b2);
		
		String c = a.concat(" batch from grotechminds");  // to add string in given string
		
		System.out.println(c);
		
		String d = "Padmasing";
				
		char d1 = d.charAt(3);  // to find char present on given index position
		
		System.out.println(d1);
		
		int d2 = d.indexOf('a');  // to find the index of given char
		
		System.out.println(d2);

	}

}
