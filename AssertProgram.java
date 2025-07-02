package module1programs;

public class AssertProgram {

	public static void main(String[] args) {
		
		int a = 5;
		
		System.out.println("Start");
		
	    //assert a>10;                               // syntax 1st
		
	    assert a>10:"Sorry condition is not true";   // syntax 2nd
	    
		System.out.println("End");

	}

}
