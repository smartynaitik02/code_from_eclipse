package practice;

public class Child1 extends Parent1{

	public static void main(String[] args) {
		
		
		
		//demo.parent_meth();
		
		try {
			Child1 demo = (Child1) new Parent1();
		} catch (ClassCastException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("code end");

	}

}
