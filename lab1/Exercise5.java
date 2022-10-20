package lab1;

import java.util.Scanner;

public class Exercise5 { // Create a class with a method which can calculate the sum of first n natural
							// numbers which are divisible by 3 or 5.

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			num = sc.nextInt();
			System.out.printf("The sum of first %d natural numbers which are divisible by 3 or 5 is %d", num,
					calculateSum(num));
		} else {
			System.out.println("Enter a number");
		}
		sc.close();

	}

	static int calculateSum(int n) {
		int i = 1;
		int sum = 0;
		while (n > 0) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
				n--;
			}
			i++;
		}
		return sum;
	}

}
