package lab1;

import java.util.Scanner;

public class Exercise1 { // Create a method to find the sum of the cubes of the digits of an n digit
							// number

	static int sumOfDigitCubes(int num) {

		int sum = 0;
		while (num > 0) {
			sum += Math.pow(num % 10, 3);
			num = num / 10;
		}
		return sum;
	}

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your number= ");

		if (sc.hasNextInt()) {
			num = sc.nextInt();
			System.out.printf("The sum of cubes of the digits of %d is %d", num, sumOfDigitCubes(num));
		} else {
			System.out.println("You didn't enter an Integer");
		}
		sc.close();

	}

}
