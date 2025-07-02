package module1programs;

public class ArrayProblem1 {

	public static void main(String[] args) {
		
		int rollno[] = new int[3];                     // declaration of an array
		
		rollno[0] = 34;                                // initialization of an array
		rollno[1] = 35;
		rollno[2] = 36;
		
		
		String name[] = new String[3];

		name[0] = "dhanashri";
		name[1] = "Padmasing";
		name[2] = "Nawale";

		
		/*System.out.println(rollno[0]);
		System.out.println(rollno[1]);
		System.out.println(rollno[2]);*/
		
		
		// better to write for loop
		
		for(int i=0;i<3;i++) {                          // iteration of array
			
			System.out.println(rollno[i]);
			System.out.println(name[i]);
		}

	}

}
