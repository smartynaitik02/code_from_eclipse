package assigment4;

public class Que15 {
//	Write a Java program to reverse each word in a given string.  
//	
//	The given string is: Reverse words in a given string  
	public static void main(String[] args) {

		String s1 = "Reverse words in a given string";

		String arr[] = s1.split(" ");

		String store = "";

		int len = arr.length;

		for (int i = 0; i < len; i++) {

			String word = arr[i]; // Reverse

			for (int j = (arr[i].length() - 1); j >= 0; j--) {

				store = store + word.charAt(j);
			}

			store = store + " ";
		}

		System.out.println(store);
	}

}
