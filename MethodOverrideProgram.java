package module1programs;

class ParentClass1 {

	void login() {

		System.out.println("login with mobile no");
	}
}

public class MethodOverrideProgram extends ParentClass1  {

	public static void main(String[] args) {
		
		MethodOverrideProgram mp = new MethodOverrideProgram();
		
		mp.login();

	}

	void login() {
		
        super.login(); // super keyword to call both the implementation
		System.out.println("login with email ID");
	}

}
