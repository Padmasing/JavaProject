package module1programs;

import java.util.Date;

public class DateClassProgram {

	public static void main(String[] args) {
		
		Date d1 = new Date();  // creating object of date class
		
		System.out.println(d1.getTime());  // system understandale time in long format ( for human understanding use epochconverter.com )
		
		Date d2 = new Date(d1.getTime());  // human understandale time
		
		System.out.println(d2);
		
		 String format1 = d2.toString(); // converting d2 into string to apply string funtions
		 
		 String date = format1.substring(8, 11);  // to take date out of it
		 
		 System.out.println(date);
		 
		 String month = format1.substring(4, 7);  // to take month out of it 
		 
		 System.out.println(month);
		 
		 //String year = format1.substring(24);  //  to take year out of it
		 
		 // or
		 
		 String year = format1.substring(format1.length()-4);    // to take year out of it
		 
		 System.out.println(year);
		 
		 String format2 = date.concat(month).concat(year);   // concatinating everything to print 28May2025
		 
		 System.out.println(format2);
		 
		 String format3 = date.concat("-").concat(month).concat("-").concat(year); // concatinating everything to print 28-May-2025
		 
		 System.out.println(format3);
		 
		 String format4 = date.concat("/").concat(month).concat("/").concat(year); // concatinating everything to print 28/May/2025
		
		 System.out.println(format4);
	}

}
