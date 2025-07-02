package module1programs;

class GoogleProblem {

	void add() {

	}

	void sub() {

	}

}

public class UpcastingProblem extends GoogleProblem {
	
	void mul() {

	}

	void div() {

	}

	public static void main(String[] args) {
		
		// implicit syntax
		
		GoogleProblem gp = new UpcastingProblem();  // converting child class object into parent class object (upcasting)
		
		// now with gp we can access only parent class property and all its parent class property
		
		gp.add();
		gp.sub();
		
		// Explicit syntax
		
		GoogleProblem gp1 = (GoogleProblem) new UpcastingProblem(); 
		
		
		// downcasting - converting parent class object into child class object
		
		UpcastingProblem up = (UpcastingProblem) gp;  
		
		// now with up we can access child class as well as all its parent class property
		
		up.add();
		up.sub();
		up.mul();
		up.div();

	}

}
