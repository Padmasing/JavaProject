package module1programs;

import java.util.Arrays;

public class ArrayProblem11 {

	public static void main(String[] args) {
		
		int array1[] = new int[6];
		
		array1[0] = 78;
		array1[1] = 11;
		array1[2] = 54;
		array1[3] = 78;
		array1[4] = 11;
		array1[5] = 11;
		
		Arrays.sort(array1);    // sorted an array
		
		int count = 1;          // beacause each element has atleast 1 occurence
		
		System.out.println(Arrays.toString(array1));  // check sorting has done or not
		
		for(int i=1; i<array1.length;i++) {
			
			if(array1[i]==array1[i-1]) {
				
				count++;
			}
			else {
				
				count = 1;   // it should not take updated value of count thats why we again update the value of count.
				System.out.println("the element at index"+ (i-1) +" has occurred " + count);
				
				}
			
			    
		}
		
		System.out.println("the element at index "+ (array1.length-1) +" has occurred " + count);

	}

}
