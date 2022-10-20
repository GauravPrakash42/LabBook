package lab1;

import java.util.Scanner;

public class Exercise6 { // Create a class with a method to find the difference between the sum of the
							// squares and the square of the sum of the first n natural numbers.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			int num = sc.nextInt();
			System.out.printf("The difference of sum of squares and the square of the sum of the first %d natural numbers is %d ",num,checkDifference(num));

		} else {
			System.out.println("You didn't enter a number!");
		}
		sc.close();

	}
	
	static int checkDifference(int n)
	{
		int sum=0,sumsq=0;
		for (int i = 1; i <= n; i++) {
			sum+=i;
			sumsq+=Math.pow(i, 2);
		}
		return sumsq-sum;
	}

}
