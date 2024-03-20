package assigment4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Que6_ {
	
	
//	Write a Java program to print the current date and time in the specified format.  Example  
//	Current Date and Time :  
//	December 25, 2013  
//	 9:13 pm  
//	The current date and time will change according to your system date and time.  

	public static void main(String[] args) {
		
		//for getting system date and time
		LocalDateTime current_time = LocalDateTime.now();
		
		//System.out.println(current_time);
		//for format of date and time
		DateTimeFormatter formatte = DateTimeFormatter.ofPattern("MMMM dd, yyyy\nhh:mm a");
		//for changing the local time according to format.
		String formatteddatetime = current_time.format(formatte);
		
		System.out.println(formatteddatetime);
		
		
		
		

	}

}
