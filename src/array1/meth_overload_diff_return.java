package array1;

public class meth_overload_diff_return {

	public Object demo() {
		System.out.println("parent demo method");
		return null;
	}
	
	public String demo1() {
		
		System.out.println("String parent demo method");
		
		return null;
	}
	
	
	public double demo3() {
		System.out.println("double parent method");
		double d1 = 67.88d;
		
		return d1;
	}
	
	
	public double demo3(int number) {
		
		System.out.println("double parent method");
		double d1 = 67.88d;
		
		return d1;
	}
}
