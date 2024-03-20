package practice;

public class Prac2 {

	public static void main(String[] args) {
		String str = "vel&^%city P*&^une123";
		int len = str.length();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < len; i++) {

			char ch = str.charAt(i);

			if (Character.isLetterOrDigit(ch) || Character.isWhitespace(ch)) {
				sb.append(ch);

			}

		}
		
		System.out.println(sb);

	}

}
