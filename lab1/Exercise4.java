package lab1;

import java.util.Scanner;

public class Exercise4 { // Write a Java program that prompts the user for an integer and then prints out
							// all the prime numbers up to that Integer

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your number= ");

		if (sc.hasNextInt()) {
			num = sc.nextInt();
			if (num <= 1) {
				System.out.println("Not Prime");
			} else {
				for (int i = 2; i <= num; i++) {
					isPrime(i);

				}
			}
		} else {
			System.out.println("You didn't enter an Integer");
		}
		sc.close();

	}

	static void isPrime(int i) {
		boolean primecheck = true;

		for (int j = 2, limit = i / 2; j <= limit; j++) {
			if (i % j == 0) {
				primecheck = false;
				break;
			}
		}
		if (primecheck == true) {
			System.out.println(i);
		}

	}

}
