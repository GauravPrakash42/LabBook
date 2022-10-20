package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 { // Create a method which accepts an array of integer elements and return the
							// second smallest element in the array
	public static void main(String[] args) {

		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size= ");

		size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Your Array: " + Arrays.toString(arr));
		System.out.println("The second smallest number in it: " + getSecondSmallest(arr));

		sc.close();
	}

	static int getSecondSmallest(int[] arr) {

		Arrays.sort(arr);
		return arr[1];
	}

}
