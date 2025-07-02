package module1programs;

public class MethodOverloading1 {

	static void login(String emailid) {
		
		System.out.println("login with mail id");

	}

	static void login(long mobileno) {
		
		System.out.println("login with mobile number ");
		
	}

	public static void main(String[] args) {
		
		login("padmasingnawale@gmail.com");
		login(9561626419l);

	}

}
