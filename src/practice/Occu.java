package practice;

public class Occu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "this world is a cruel place";
		
		int totalcount = str.length();
		
		System.out.println(totalcount);
		
		int totalcount_afterremoval = str.replace("a", "").length();
		System.out.println(totalcount_afterremoval);
		
		int count = totalcount - totalcount_afterremoval;
		
		System.out.println(count);
		
		
	}

}
