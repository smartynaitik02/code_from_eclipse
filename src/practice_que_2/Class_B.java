package practice_que_2;

public class Class_B extends Class_A {
	
	@Override
	public void test1() {
		System.out.println("now method is from class b");
	}
	
	public static void main(String[] args) {
		
		Class_B obj = new Class_B();
		obj.test1();
		
	}

}
