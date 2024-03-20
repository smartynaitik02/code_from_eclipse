package assigment4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Que6 {
	
//	Write a Java program to print the current date and time in the specified format.  Example  
//	Current Date and Time :  
//	December 25, 2013  
//	 9:13 pm  
//	The current date and time will change according to your system date and time.  

	public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Define the desired format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy\nhh:mm a");

        // Format the current date and time
        String formattedDateTime = currentDateTime.format(formatter);

        // Display the formatted date and time
        System.out.println("Current Date and Time:");
        System.out.println(formattedDateTime);
    }

}
