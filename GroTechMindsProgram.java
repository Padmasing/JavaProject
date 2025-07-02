package module1programs;



class university{
	
	
	university(){
		// super(); implicitly present here
		System.out.println("university cons");
		
	}
	
}

class Education extends university{
	
	
	Education(int a){
		// super(); implicitly present here
		System.out.println("Education cons");
		
	}
	
}

public class GroTechMindsProgram extends Education {
	
	
	GroTechMindsProgram(){
		super(67);        // we have write here explicitly because constructor "Education" is parameterized.
		System.out.println("GroTechMindsProgram cons");
		
	}
	

	public static void main(String[] args) {
		
		new GroTechMindsProgram();
		
	}

}
