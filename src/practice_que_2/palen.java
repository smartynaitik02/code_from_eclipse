package practice_que_2;

public class palen {

	public static void main(String[] args) {
		
		String s1 = "madam";
		int num= 1441;
		
		
		
		String rev="";
		
		for(int i =s1.length()-1; i>=0 ;i--) {
			
			rev=rev+s1.charAt(i);
		}
		
		System.out.println(rev);
		if(rev.equals(s1)) {
			System.out.println("string are palendrome");
		}
		else {
			System.out.println("ther are not");
		}
		

	}

}
