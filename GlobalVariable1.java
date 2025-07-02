package module1programs;

public class GlobalVariable1 {
	
	static int a=100;  // global variable (fathers money)
	
	int b=87;   // non static global variable also called as instance variable

	public static void main(String[] args) {
		
		System.out.println(a);
		
		GlobalVariable1 g1=new GlobalVariable1();
		
		System.out.println(g1.b);

	}

}
