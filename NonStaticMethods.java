package module1programs;

public class NonStaticMethods {
	
	void login() {
		
		System.out.println("login to amazon");
	}
	
	void logout() {
		
		System.out.println("logout from amazon");
	}

	public static void main(String[] args) {
		
		
		NonStaticMethods ns=new NonStaticMethods();
		
		ns.login();
		ns.logout();
		

	}

}
