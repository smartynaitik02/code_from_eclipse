package practice_3;

public class Star_rev {

	public static void main(String[] args) {

		for (int i = 0; i <= 4; i++) {

			for (int j = 0; j <= 4; j++) {

				if (j <= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}

}
