package module1programs;

import java.util.Arrays;

public class ArrayProblem4 {

	public static void main(String[] args) {
		
		int array1[] = new int[3];
		 
		array1[0] = 56;
		array1[1] = 53;
		array1[2] = 34;
		
		
		/*int array2[] = new int[3];  wrong way
		
		array2[0] = array1[0];
		array2[1] = array1[1];
		array2[2] = array1[2];*/
		
		// right way
		
		int array2[] = new int[array1.length];
		
		for(int i=0;i<array1.length;i++) {
			
		    array2[i] = array1[i];
		}
		
		
		System.out.println("value of array 1> " +Arrays.toString(array1));
		System.out.println("value of coppied array> " +Arrays.toString(array2));

	}

}
