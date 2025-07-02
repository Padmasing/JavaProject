package module1programs;

public class ArrayProblem10 {

	public static void main(String[] args) {

		int array1[] = new int[4];

		array1[0] = 1;
		array1[1] = 2;
		array1[2] = 3;
		array1[3] = 4;

		int array2[] = new int[4];

		array2[0] = 5;
		array2[1] = 4;
		array2[2] = 6;
		array2[3] = 1;

		for (int i = 0; i < array1.length; i++) {         // this is for array1
                                                                                     // loop inside loop
		      for (int j = 0; j < array2.length; j++) {   // this is for array2
		    	  
		    	 if(array1[i]==array2[j]) {
		    		 
		    		 System.out.println(array1[i]);
		    	 }

		}

	}

}
}