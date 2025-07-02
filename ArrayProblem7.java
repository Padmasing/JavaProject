package module1programs;

import java.util.Arrays;

public class ArrayProblem7 {

	public static void main(String[] args) {

		int array1[] = new int[3];

		array1[0] = 56;
		array1[1] = 53;
		array1[2] = 34;

		int array2[] = new int[array1.length];

		for (int i = 0; i < array1.length; i++) {

			array2[i] = array1[i];
		}
		
		System.out.println("value of array 1> " +Arrays.toString(array1));
		System.out.println("value of coppied array> " +Arrays.toString(array2));
		
		// check two arrays are equal or not
		
		boolean b1 = Arrays.equals(array1, array2);
		
		System.out.println(b1);

	}

}
