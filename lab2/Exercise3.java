package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 { // Create a method which accepts an integer array, reverse the numbers in the
							// array and returns the resulting array in sorted order

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
		System.out.println("The reversed numbered sorted array is: " + Arrays.toString(getSorted(arr)));

		sc.close();

	}

	static int[] getSorted(int[] arr) {
		StringBuffer strarr = new StringBuffer("");
		for (int i = 0; i < arr.length; i++) {

			arr[i] = Integer.parseInt(strarr.append(arr[i]).reverse().toString());
			strarr.delete(0, strarr.length()); // or you can do strarr=new StringBuffer("");

		}

		Arrays.sort(arr);

		return arr;
	}

}