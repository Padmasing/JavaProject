package module1programs;

abstract class Google_Auth2 {

	abstract void login();

	abstract void registration();

	static void logout() {

		System.out.println("exposing logic");
	}

	static void reset_password() {

		System.out.println("exposing logic");
	}

}

abstract class Google_Auth3 extends Google_Auth2 {

	abstract void login1();

	abstract void registration1();

}

public class ClassType_Concrete2 extends Google_Auth3 {

	static void method1() {

	}

	public static void main(String[] args) {

	}

	void login() {

	}

	void registration() {

	}

	void login1() {

	}

	void registration1() {

	}

}
