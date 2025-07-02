package module1programs;

public class UpdatingLocalGlobal {
	
	static int a=100; 
	
	int b=67;  // also called as instance variable

	public static void main(String[] args) {
		
		UpdatingLocalGlobal u1=new UpdatingLocalGlobal();
		
		u1.b=45; // updating the value of non static global variable
		
		System.out.println(u1.b);  
	
		a=466;  // updating the value of static global variable
		
		System.out.println(a);
		
		int d=44;
		
		System.out.println(d); // 44
		
		d=56;  // updating the value of local variable
		
		System.out.println(d); // 56

	}

}
