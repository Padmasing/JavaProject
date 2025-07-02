package module1programs;

import java.util.Scanner;

public class HumanInputAtRunTime1 {
	
	static void area_of_circle() {
		
		System.out.println("Enter the value of R");
		
		Scanner s1 = new Scanner(System.in);
		
		double r = s1.nextDouble();
		
		System.out.println("lets find out the area");
		
		double area = Math.PI*r*r;
		
		System.out.println("area of circle = " + area);  // concatination
		
		s1.close();  // it will stop accepting values at runtime now
	}

	public static void main(String[] args) {
		
		area_of_circle();

	}

}
