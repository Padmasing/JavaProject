package module1programs;

import java.util.Scanner;

public class HumanInputAtRunTime {

	public static void main(String[] args) {
		
		// invoking parameterized constructor of scanner class
		
		Scanner s1 = new Scanner(System.in);  // System.in is use to accept the human input at runtime
		
		String name = s1.next();
		int age = s1.nextInt();
        boolean answer = s1.nextBoolean();
        byte s2 = s1.nextByte();
        short s3 = s1.nextShort();
        long s4 = s1.nextLong();
        float s5 = s1.nextFloat();
        double s6 = s1.nextDouble();
        
         s1.close();  // it will stop accepting values at runtime now

	}

}
