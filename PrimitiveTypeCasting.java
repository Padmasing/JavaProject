package module1programs;

public class PrimitiveTypeCasting {

	public static void main(String[] args) {
		
		// Problem 1- int into long
		
		int a = 100;
		
		// implicit syntax
		long converted_value = a;     // widening 
		
		System.out.println(converted_value);
		
		
		
		
		// Explicitly syntax
        long converted_value1 = (long) a;     // widening 
		
		System.out.println(converted_value1);
		
		
		
		
		
		// Problem 2- byte into double
		
		byte b = 100;
		
		// implicit syntax
		double converted_value2 = b;         // widening
		
		System.out.println(converted_value2);
		
		
		
		
		
		// Problem 3- double into int
		
		double wt = 63.9;
		
		// Explicitly syntax
		int converted_weight = (int) wt;   // narrowing
		
		System.out.println(converted_weight);
		
		
		
		
		
		
		// Problem 4- int into byte
		
		int c = 34;
		
		// Explicitly syntax
		byte converted_c = (byte) c;  // narrowing
		
		System.out.println(converted_c);

	}

}
