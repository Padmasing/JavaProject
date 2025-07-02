package module1programs;

public class StringFunction4 {

	public static void main(String[] args) {
		
		String a = "Automation Testing Batch-55";
		
		// 1st - replace all smaller letters with nothing
		
		String output = a.replaceAll("[a-z]", "");
		
		System.out.println(output);
		
		// 2nd - replace all Capital letters with nothing
		
		String output1 = a.replaceAll("[A-Z]", "");
		
		System.out.println(output1);
		
		// 3rdd - replace all numeric letters with nothing
		
		String output2 = a.replaceAll("[0-9]", "");
		
		System.out.println(output2);

}

}
