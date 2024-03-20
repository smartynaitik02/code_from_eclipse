package polymorphism;

import java.util.Scanner;

public class String_comp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st name --> ");
		String s1 = sc.nextLine();
		
		System.out.println("Enter 2nd name --> ");
		String s2 =sc.nextLine();
		
		
		if(s1.equals(s2)) {
			System.out.println("string are equal");
		}
		else {
			System.out.println("not equal to ");
		}

	}

}
