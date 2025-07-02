package module1programs;

public class PalindromeProblem {

	public static void main(String[] args) {
		
		 String input = "mom";                   // for palindrome use mom
		 
		 String output = "";
		 
		 for(int i=input.length()-1;i>=0;i--) {
			 
			 char c1 = input.charAt(i);
			 
			 output = output + c1;
		 
		}                                                                    // imp interview question
		 
		 System.out.println("here is my input> " +input);
		 System.out.println("here is my output> " +output);
		 
		 if(input.equals(output)) {
			 
			 System.out.println("Palindrome");
		 }
		 else {
			 
			 System.out.println("Not Palindrome");
		 }

}
}