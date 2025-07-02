package module1programs;

import java.util.Arrays;

public class ArrayProblem2 {

	public static void main(String[] args) {

		String name[] = new String[3];

		name[0] = "Dhanashri";
		name[1] = "Padmasing";
		name[2] = "Nawale";
		
		System.out.println(Arrays.toString(name));

		for (int i = 0; i <= 2; i++) {

			System.out.println(name[i]);
		}

	}

}
