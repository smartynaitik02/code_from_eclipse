package practice_que;

import java.util.Arrays;

public class Ana_practice {

	public static void main(String[] args) {
		
		String s1 = "race"; //a c e r
		String s2 = "care"; // a c e r
		
		if(s1.length()==s2.length()) {
			
			//from string to char
			char [] ch1 = s1.toCharArray();
			char ch2 [] =s2.toCharArray();
			
			//System.out.println(ch1);
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
//			System.out.println(ch1);
//			System.out.println(ch2);
			
			boolean bool = Arrays.equals(ch1, ch2);
			
			if(bool) {
				System.out.println("given string are anagram");
			}
			else {
				System.out.println("they are not anagram");
			}
			
			
			
		}
		else {
			System.out.println("they are not anagrams");
		}

	}

}
