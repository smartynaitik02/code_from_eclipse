package practice;

import java.util.Arrays;

public class Prac7 {

	public static void main(String[] args) {
		//anagram contains same letter
		
		String s1 = "race";
		String s2 = "care";
		
		int len1 = s1.length();
		int len2 = s2.length();
		
		if(len1==len2) {
			
			char c1 [] = s1.toCharArray();
			char c2 [] = s2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			boolean bool = Arrays.equals(c1, c2);
			
			if(bool) {
				System.out.println("are anagram");
			}else {
				System.out.println("not ana");
			}
			
			
		}else {
			System.out.println("noy");
		}

	}

}
