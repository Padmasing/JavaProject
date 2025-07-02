package module1programs;

public class FinalVariable {
	
	final static double pivalue=Math.PI;  // final static global variable
	
	static void area_of_circle() {
		
		//pi*r*r
		
		final int r=10; // final local variable
		
		double area=pivalue*r*r;
		
		System.out.println(area);
		
	}

	public static void main(String[] args) {
		
		area_of_circle();
		

	}

}
