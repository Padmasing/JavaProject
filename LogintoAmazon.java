package module1programs;

public class LogintoAmazon {

	LogintoAmazon() {

		this(23);
		System.out.println("1");

	}

	LogintoAmazon(int a) {
		
	    this("Ram");
		System.out.println("2");

	}

	LogintoAmazon(String a) {

		
		System.out.println("3");

	}

	public static void main(String[] args) {

		new LogintoAmazon();

	}

}
