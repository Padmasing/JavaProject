package module1programs;

abstract class Google_Auth1 {  // abstract class

	abstract void login(); // abstract method

	abstract void logout(); // abstract method
	
	static void two_way_auth() {  // concrete method
		
		System.out.println("exposing logic");
	}
	
	void reset_password() {     // concrete method
		
		System.out.println("exposing logic");
	}
}

public class ClassType_Concrete1 extends Google_Auth1 {

	public static void main(String[] args) {   // // concrete method

	}

	void login() {

		System.out.println("Real Logic"); // of Air India

	}

	void logout() {
		
		System.out.println("Real Logic");  // of Air India

}
}