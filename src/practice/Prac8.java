package practice;

public class Prac8 {

	public static void main(String[] args) {
		String name = "velocity pune";
		String arr[] = name.split(" ");
		String store = "";
		int len = name.length();
		for (String word : arr) {

			String ele = word;
			String blank = "";

			for (int i = ele.length() - 1; i >=0; i--) {

				blank = blank + ele.charAt(i);

			}
			store = store + blank + " ";
		}
		
		System.out.println(store);

	}

}
