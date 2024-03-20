package assigment4;

public class Que5 {

//	Write a Java program to compare a given string to another string, ignoring case  considerations.  
//	|Example:  
//	Stephen Edwin King" equals "Walter Winchell"? false  
//	Stephen Edwin King" equals "stephen edwin king"? true  
	
	public static void main(String[] args) {
		
		String s1 ="Stephen Edwin King";
		String s2 = "Walter Winchell";
		String s3 = "Stephen edwin king";
		
		System.out.println(s1==s2);
		System.out.println(s1.equalsIgnoreCase(s3));
				
		
		

	}

}
