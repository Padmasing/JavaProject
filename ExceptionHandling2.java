package module1programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling2 {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);

		try {
			int Array1[] = new int[s1.nextInt()];
		} catch (InputMismatchException a1) {
			System.out.println("handeled the exception 1");
		}
		finally {
			
			System.out.println("I will always execute");
		}

	}

}
