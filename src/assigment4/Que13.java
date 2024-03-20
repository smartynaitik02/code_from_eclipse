package assigment4;

public class Que13 {

//	Write a Java program to print the result of removing duplicates from a given  string.  
//	Example  
//	The given string is: JavaPython  
//	After removing duplicates characters the new string is:  
//	JvPython  

	public static void main(String[] args) {

		String s1 = "JavaPython";

		int len = s1.length();
		System.out.println(len);

		String store = "";
		
//		fake method
//		String s2 = s1.replace("a", "");
//		System.out.println(s2);
		
		
		for (int i = 0; i < len; i++) {

			for (int j = i + 1; j < len - 1; j++) {

				if (s1.charAt(i) == s1.charAt(j)) {
					char ch = s1.charAt(i);
				}

			}
			
		  	
		}
		
		
		

	}

}
