package polymorphism;

public class Son extends Father{
	

	
	
	public static void Aws() {
		System.out.println("static method from Child");
	}
	
	@Override
	public void gcs() {
		System.out.println("non static from child");
	}
	
	public static void main(String[] args) {
		
		Father f1 = new Son();
		f1.Aws(); //over hiding
		f1.gcs();
	}
	

}
