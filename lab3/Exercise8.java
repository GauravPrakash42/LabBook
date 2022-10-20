package lab3;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your string= ");
		str = sc.nextLine();

		if (isPositiveString(str)) {
			System.out.println("The string is positive");
		} else {
			System.out.println("The string is not positive");
		}

		sc.close();

	}

	static boolean isPositiveString(String str) {
		boolean check = true;
		str = str.toLowerCase();

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) > str.charAt(i + 1)) {
				check = false;
				return check;
			}
		}

		return check;
	}

}
