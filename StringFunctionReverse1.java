package module1programs;

public class StringFunctionReverse1 {

	public static void main(String[] args) {
		
		String input = "Auto";
		
		String output = "";       // empty string  ( expecting otuA )
		
		for(int i=input.length()-1; i>=0; i--) {
			
			char c1 = input.charAt(i);
			
			output = output+c1 ;
			                                                               // imp interview question
          }
		
		System.out.println("this is my input > " +input);
		System.out.println("this is my output > " +output);

	}

}
