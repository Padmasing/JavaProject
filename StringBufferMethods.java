package module1programs;

public class StringBufferMethods {

	public static void main(String[] args) {
		
		// append method
		
		StringBuffer s1 = new StringBuffer("Automation");
		
		                  s1.append(" Testing");
		           
		        System.out.println(s1);
		        
		 // insert method
		        
		StringBuffer s2 = new StringBuffer("I am to School");                 
		        
		                 s2.insert(5, "going ");
		                 
		        System.out.println(s2);         
		        
		 // replace method
		        
		StringBuffer s3 = new StringBuffer("Automation Testing");  
		
                          s3.replace(0, 10, "manual");
                          
               System.out.println(s3);       
               
         // delete method  
               
        StringBuffer s4 = new StringBuffer("Automation Testing");
         
                          s4.delete(11, 18);
                          
               System.out.println(s4);
               
         // reverse method     
               
        StringBuffer s5 = new StringBuffer("Automation");
        
                         s5.reverse();
                         
               System.out.println(s5);
               
         // capacity method  
               
       StringBuffer s6 = new StringBuffer("Automation");
       
                        
              System.out.println(s6.capacity());  
              
         // length method 
              
       StringBuffer s7 = new StringBuffer("Automation");
       
              System.out.println(s7.length());  
              
              
         // charAt method
              
        StringBuffer s8 = new StringBuffer("Automation");
        
         System.out.println(s8.charAt(3));   
         
         // substring method (single para)
         
         StringBuffer s9 = new StringBuffer("Automation"); 
              
                   System.out.println(s9.substring(2));
                   
         // substring method (two para)
                   
         StringBuffer s10 = new StringBuffer("Automation");
         
                   System.out.println(s9.substring(2,8));
	}                     

}
