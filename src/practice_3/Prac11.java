package practice_3;

public class Prac11 {

	public static void main(String[] args) {
		String arr1[] = new String[3];
		String arr2[] = new String[3];

		arr1[0] = "ruby";
		arr1[1] = "python";
		arr1[2] = "java";

		arr2[0] = "c#";
		arr2[1] = "java";
		arr2[2] = "php";

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {

				if (arr1[i] == arr2[j]) {
				//if(arr1[i].equals(arr2[j])){

					System.out.println(arr1[i]);

				}

			}
		}
		
		System.out.println("code ended");

	}

}
