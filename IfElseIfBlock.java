package module1programs;

public class IfElseIfBlock {

	public static void main(String[] args) {
		
		char gender='f';
		char gender1='m';
		//char gender2='c';
		
		if(gender=='f'){
			
			System.out.println("Ticket is free for you");

	    }
		else if(gender=='m'){
			
			System.out.println("Ticket is chargable for you");

        }
		else {
			
			System.out.println("Half Ticket");
		}
}
}