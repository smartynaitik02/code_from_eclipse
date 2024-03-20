package array1;

public class Array_name {

	public static void main(String[] args) {
		
        int arrayname[] = {10, 20, 30};

        // Using getClass() and getName() on the array
        Class<?> arrayClass = arrayname.getClass();
        String arrayClassName = arrayClass.getComponentType().getName();

        System.out.println("Class Name: " + arrayClassName); // Prints "int"
	}

}
