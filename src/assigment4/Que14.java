package assigment4;

public class Que14 {
	
//	Write a Java program to reverse words in a given string.  
//	Example:  
//	The given string is: Reverse words in a given string  
//	The new string after reversed the words: string given a in words Reverse
	
	public static void main(String[] args) {
		
		String s1 =  "Reverse words in a given string";
		String arr[] = s1.split(" ");
		
//		for(String value : arr) {
//			System.out.print(value);
//		}
		
		int len = arr.length;
		for(int i=len-1; i>=0;i--) {
			System.out.print(arr[i]+ " ");
			
			
		}
		

	}

}
