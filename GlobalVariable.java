package module1programs;

public class GlobalVariable {
	
	static int a=100;
	static int b=200;
	
	static void add() {
		
		System.out.println(a+b);
		
	}
	
	static void sub() {
		
		System.out.println(a-b);
	}

	public static void main(String[] args) {
		
		add();
		sub();
	}

}
