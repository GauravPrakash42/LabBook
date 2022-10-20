package lab1;

import java.util.Scanner;

public class Exercise3 { // The Fibonacci sequence is defined by the following rule. The first 2 values
							// in the sequence are 1, 1. Every subsequent value is the sum of the 2 values
							// preceding it. Write a Java program that uses both recursive and non-recursive
							// functions to print the nth value of the Fibonacci sequence

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n= ");

		if (sc.hasNextInt()) {
			n = sc.nextInt();
			System.out.printf("The %d th value in the Fibonacci sequence calculated non-recursively is %d", n, nrFibo(n));
			System.out.printf("\nThe %d th value in the Fibonacci sequence calculated recursively is %d", n, rFibo(-1, 1, n));
		} else {
			System.out.println("You didn't enter an Integer");
		}
		sc.close();

	}

	static int nrFibo(int n) {
		int a = -1;
		int b = 1;
		int c = 0;

		for (int i = 0; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}

	static int rFibo(int a, int b, int n) {
		int c = a + b;
		a = b;
		b = c;
		n -= 1;
		while (n > 0) {
			return rFibo(a, b, n);
		}

		return c;
	}

}
