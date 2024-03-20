package assigment4;

import java.util.Arrays;

public class Anagram_word {
	
	//Anagram word are those which are created using the same charter which is present in origina string

	public static void main(String[] args) {
		
		String s1 = "race";
		String s2 = "care";
		
		//first check length condition
		
		if(s1.length()==s2.length()) {
			
			
			//store the char of string into char array via char method
			char ch1[] = s1.toCharArray();
			char ch2[] = s2.toCharArray();
			
			//now sort the char according to alphabet to compare.
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
//			for(char c: ch1) {
//				System.out.println(c);
//			}
//			
//			System.out.println();
//			
//			for(char b: ch1) {
//				System.out.println(b);
//			}
			
			boolean bool = Arrays.equals(ch1, ch2);  //do not use ch1.equals(ch2) will not get answer
			//System.out.println(bool);
			
			if(bool) {
				
				System.out.println(s1 +" and "+ s2 + " are anagram to each other");
			}
			else {
				System.out.println(s1 +" and "+ s2 + " are not anagram");
			}
			
		}

	}

}
