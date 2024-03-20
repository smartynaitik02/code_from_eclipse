package practice_que;

import java.util.Arrays;

public class Each_Word_Rev {

	public static void main(String[] args) {
		String s1 = "Hello Good evening ji";
		
		String s2[] = s1.split(" ");

		//int len = s1.length();
//		System.out.println(Arrays.asList(s2));
		//System.out.println(len);
//		for(String words:s2) {
//			System.out.print(words+ " ");
//		}
		String random ="";
		String blank ="";
		
		
		for(String words: s2) {
			random =words; //words= Hello , random= Hello
			String str ="";
			for(int i=random.length()-1;i>=0;i--) {
				str= str + random.charAt(i); //olleh
				
			}
			blank = blank+str+" ";
		}
		System.out.println(blank);

	}

}
