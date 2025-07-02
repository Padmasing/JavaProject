package module1programs;

public class ManishProgram {
	
	
	static int add(int a,int b) {
		
		int sum = a+b;
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		add(5,7);                      // we dont get any output in this manner
		
		System.out.println(add(5,7));  // we get output in this manner 

	}

}
