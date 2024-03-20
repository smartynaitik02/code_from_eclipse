package practice_que_2;

public class Rev_string {

	public static void main(String[] args) {
		//whole string reverse
		String s1 = "velocity pune";
		int len = s1.length();
//		for(int i=len-1; i>0;i--) {
//			System.out.print(s1.charAt(i));
//		}
		
		//single word reverssal
		String str_arr []= s1.split(" ");
		String blank = "";
		
		for(String str: str_arr) {
			
			String word = str; //velocity
			String store="";
			for(int i=word.length()-1;i>=0;i--) {
				store = store + word.charAt(i);
			}
			
			blank = blank+store+ " ";
			
			
		}
		System.out.println(blank);
		
		

	}

}
