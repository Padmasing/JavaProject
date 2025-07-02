package module1programs;

public class ThrowKeyword1 {

	public static void main(String[] args) {
		
		if(1==1) {
			
			 throw new NullPointerException("String is Empty");
		}
		else {
			
			throw new StringIndexOutOfBoundsException("Index 4 out of bounds for length 0");
		}

	}

}
