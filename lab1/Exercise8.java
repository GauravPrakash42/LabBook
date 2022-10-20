package lab1;

import java.util.Scanner;

public class Exercise8 { // Create a method to check if a number is a power of two or not

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			num = sc.nextInt();
			if (checkNumber(num)) {
				System.out.printf("%d is a power of 2", num);
			} else {
				System.out.printf("%d is not a power of 2", num);
			}

		} else {
			System.out.println("You didn't enter a number!");
		}
		sc.close();

	}

	static boolean checkNumber(int n) {
		boolean powcheck = false;

		while (true) {
			if (n % 2 != 0) {
				break;
			} else {
				n = n / 2;
				if (n == 1) {
					powcheck = true;
					break;
				}
			}
		}

		return powcheck;

	}

}
