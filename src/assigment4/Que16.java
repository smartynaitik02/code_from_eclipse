package assigment4;

public class Que16 {
	
//	Write a Java program to remove "b" and "ac" from a given string.  Example  
//	The given string is: abrambabasc  
//	After removing the new string is: aramaasc 

	public static void main(String[] args) {
		
		
		String s1 = "abrambabasc";
		
		String s2 = s1.replace("b", "");
		String s3 =s2.replace("ac", "");
		
		System.out.println(s3);

	}

}
