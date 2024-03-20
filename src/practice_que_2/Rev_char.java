package practice_que_2;

public class Rev_char {
	
	public static void main(String[] args) {
		
		
		String s1 = "my name is";
		String str[]= s1.split(" ");
		
		int len = str.length;
		
		 for(int i=len-1 ;i>=0;i--) {
			 
			 System.out.print(str[i] + " ");
			 
		 }
	}


}
