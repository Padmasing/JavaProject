package module1programs;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProblem3 {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the size of an array at runtime");
		
		int rollno[] = new int[s1.nextInt()];

		/*rollno[0] = s1.nextInt();
		rollno[1] = s1.nextInt();
		rollno[2] = s1.nextInt();
		rollno[3] = s1.nextInt();*/   // dont write like this
		
		for(int i=0;i<rollno.length;i++) {
			
			System.out.println("Enter the value at index position > " + i); 
			
			rollno[i] = s1.nextInt();
		
		}
		
		System.out.println("output Array is > "  + Arrays.toString(rollno));     // correct way to printing an array
		
		s1.close();

	}

}
