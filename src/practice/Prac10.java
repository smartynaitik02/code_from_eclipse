package practice;

public class Prac10 {

	public static void main(String[] args) {


		try {
			
			String n = null;
			System.out.println(n.length());
			
			int i =10;
			System.out.println(10/0);
			
			
			

			
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
	    catch (NullPointerException n) {
		n.printStackTrace();
		System.out.println(n.getMessage());
		
	}
		
		
		
		try {
			

			
			
			
		} catch (NullPointerException n) {
			n.printStackTrace();
			System.out.println(n.getMessage());
			
		}
		
		
		
//		try {
//			
//			String n = null;
//			System.out.println(n.length());
//			
//			
//			
//		} catch (NullPointerException n) {
//			n.printStackTrace();
//			System.out.println(n.getMessage());
//			
//		}
//		
//		
//		try {
//			
//			String n = null;
//			System.out.println(n.length());
//			
//			
//			
//		} catch (NullPointerException n) {
//			n.printStackTrace();
//			System.out.println(n.getMessage());
//			
//		}
	}

}
