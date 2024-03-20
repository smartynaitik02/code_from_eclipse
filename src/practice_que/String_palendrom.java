package practice_que;

public class String_palendrom {

	public static void main(String[] args) {
		
		String s1 = "Hello Good evening ji";
		
		int len = s1.length();
		System.out.println(len);
		          //2 i=2
		for(int i=len-1; i>=0;i--) {
			
			System.out.print(s1.charAt(i));
		}
		
		
		

	}

}
