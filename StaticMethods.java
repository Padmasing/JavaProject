package module1programs;

public class StaticMethods {

	static void add() {

		int a = 20;

		int b = 40;

		int c = a + b;
		
		System.out.print("the result of addition is:");
		System.out.println(c);

	}

	static void sub() {

		int a1 = 20;

		int b1 = 40;

		int c1 = a1 - b1;
		
		System.out.print("the result of subtraction is:");
		System.out.println(c1);

	}

	static void mul() {

		int a2 = 20;

		int b2 = 40;

		int c2 = a2 * b2;
		
		System.out.print("the result of multiplication is:");
		System.out.println(c2);

	}

	static void div() {

		int a3 = 20;

		int b3 = 40;

		int c3 = a3 / b3;
		
		System.out.print("the result of division is:");

		System.out.println(c3); // the answer is 0.5 but because we mention here int it will print 0 only. it
								// cannot store decimal value.

	}

	static void mod() {

		int a4 = 20;

		int b4 = 40;

		int c4 = a4 % b4;
		
		System.out.print("the result of modulus is:");

		System.out.println(c4);

	}

	public static void main(String[] args) {
		
		add();
		sub();
		mul();
		div();
		mod();
	}

}
