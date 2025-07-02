package module1programs;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			int a = 1/0 ;
			} catch (ArithmeticException a1 ) {
			
				System.out.println("handeled the exception");
		}
		
		System.out.println("hello");

	}

}
