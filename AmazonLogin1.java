package module1programs;

public class AmazonLogin1 {

	AmazonLogin1(long mobileno) {

		System.out.println("login with mobile number");
	}

	AmazonLogin1(String emailId) {

		System.out.println("login with email Id");
	}

	public static void main(String[] args) {

		// 1st way - we use this way when we want to call the non static global variables and non static methods along with constructor

		AmazonLogin1 a1 = new AmazonLogin1(1234567898l);

		AmazonLogin1 a2 = new AmazonLogin1("padmasing@gmail.com");

		// we can do in this way also

		new AmazonLogin1(1234567898l);

		new AmazonLogin1("padmasing@gmail.com");
	}

}
