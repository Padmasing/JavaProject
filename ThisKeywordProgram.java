package module1programs;

public class ThisKeywordProgram {
	
	int stdid;           // global variable
	double salary;       // global variable
	String name;         // global variable
	
	void studentdetails(int stdid,double salary,String name) {   //  local variable
		
		this.stdid=stdid;    // assigning value of local stdid to global stdid
		this.salary=salary;  // assigning value of local salary to global salary
		this.name=name;      // assigning value of local name to global name
	}

	public static void main(String[] args) {
		
		ThisKeywordProgram tp = new ThisKeywordProgram();
		
		tp.studentdetails(85, 56.7, "aditya");
		
		System.out.println(tp.stdid);   
		System.out.println(tp.salary); 
		System.out.println(tp.name);     

	}

}
