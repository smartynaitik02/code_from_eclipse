package polymorphism;

public class Advanatage_poly_child extends  Advantage_poly_father{
	
	@Override
	public void demo1() {
		System.out.println("Child has overridded it");
	}
	
	@Override
	public String demo2() {
		
		String str2 = "happen";
		
		return str2;
	}
	
	//here overriding will not help as static method so over hiding comes here
	public static void test1() {
		System.out.println("Child class hiding");
	}

	public static void main(String[] args) {
		
		Advanatage_poly_child apc = new Advanatage_poly_child();
		apc.demo1();
		
		
		System.out.println(apc.demo2());//return type concept question 23
		
		Advanatage_poly_child.test1();
		
	}

}
