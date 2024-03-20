package array1;

public class Duplicate_ {

	public static void main(String[] args) {

		String s2 = "JavaPythonJava";
		int length = s2.length();
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (s2.charAt(i)==s2.charAt(j)) {
					System.out.print(s2.charAt(j) + " ");

				}

			}
		}

	}

}
