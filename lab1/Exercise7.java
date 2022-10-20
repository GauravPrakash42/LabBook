package lab1;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			int num = sc.nextInt();
			if (checkNumber(num)) {
				System.out.printf("%d is an increasing number", num);
			} else {
				System.out.printf("%d is not an increasing number", num);
			}

		} else {
			System.out.println("You didn't enter a number!");
		}
		sc.close();

	}

	static boolean checkNumber(int number) {
		boolean checker = true;
		String nums = String.valueOf(number);
		for (int i = 0; i < nums.length() - 1; i++) {
			if (nums.charAt(i) > nums.charAt(i + 1)) {
				checker = false;
				break;

			}

		}
		return checker;

	}

}
