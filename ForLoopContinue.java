package module1programs;

public class ForLoopContinue {

	public static void main(String[] args) {
		
		for(int i=0; i<=10;i++) {
			
			if(i==5) {                    // when i=5 it will skip that iteration
				
				continue;
			}
			
			
			System.out.println(i);
		}

	}

}
