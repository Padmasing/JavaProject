package module1programs;

interface Two {

	void add();

	void subtract();

}

interface Three extends Two {

	void add1();

	void subtract1();

}

public class ClasswithInterface1 implements Three {
	
	static void div() {
		
		System.out.println("concrete method");
	}

	public static void main(String[] args) {

	}

	public void add() {

	}

	public void subtract() {

	}

	public void add1() {

	}

	public void subtract1() {

	}

}
