package module1programs;

 class SensitiveClass {

	private String emailId = "customer@gmail.com";   // sensitive information

	
	public String getEmailid()                       // getter method
	{
		return emailId;
	}

	
	public void setEmailid(String emailId)               // setter method
	{
		this.emailId=emailId;
	}
	
	
	
	private int OTP = 1234;                          // sensitive information
	
	
	public int getOtp() {                            // getter method
		
		return OTP;
	}
	
	
	public void setOtp(int OTP) {                     // setter method
		
		this.OTP = OTP;
	}
	
	
	private char Gender = 'M';                       // sensitive information
	
	public char getGender() {                        // getter method
		return Gender;
	}


	public void setGender(char gender) {             // setter method
		this.Gender = gender;
	}
	
	
}

public class EncapsulationProgram {

	public static void main(String[] args) {
		
		SensitiveClass s1 = new SensitiveClass();
		
		s1.setEmailid("np@gmail.com");
		
		s1.getEmailid();  // not getting any output
		
		System.out.println(s1.getEmailid());  // getting output
		
		
		
		s1.setOtp(6789);
		
		System.out.println(s1.getOtp());
		
		s1.setGender('F');
		
		System.out.println(s1.getGender());
	

	}

}
