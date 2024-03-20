package assigment4;

public class Que9 {
//	Write a Java program to create a character array containing a string.
	
	public static void main(String[] args) {
		
		String s1 = "Hello";
		
		char arr[] = new char[s1.length()];
		
		for(int i=0; i<s1.length();i++) {
			
			arr[i] = s1.charAt(i);
		}
		
		for(char array1 : arr) {
			System.out.print(array1);
		}

	}

}
