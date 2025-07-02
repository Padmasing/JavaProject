package module1programs;

import java.util.Arrays;

public class ArrayProblem5 {

	public static void main(String[] args) {
		
		int array1[] = new int[4];
		 
		array1[0] = 1;
		array1[1] = 2;
		array1[2] = 3;
		array1[3] = 4;
		
		int array2[] = new int[array1.length];
		
		for(int i=0,j=3; i<array1.length;i++,j--) {
			
			array2[j] = array1[i] ;
		}
		
		System.out.println("this is my Array1>  " + Arrays.toString(array1));
		System.out.println("this is my Copied Array in reverse order>  " + Arrays.toString(array2));

	}

}
