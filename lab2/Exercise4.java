package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 { // Create a method which accepts an integer array and removes all the duplicates
							// in the array. Return the resulting array in descending order

	public static void main(String[] args) {
		//final long startTime = System.currentTimeMillis();
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size= ");

		size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Your Array: " + Arrays.toString(arr));
		System.out.println("After removing the duplicates: " + Arrays.toString(modifyArray(arr)));

		sc.close();
		final long endTime = System.currentTimeMillis();
		//System.out.println("Total execution time: " + (endTime - startTime));

	}

	static int[] modifyArray(int[] arr)
	{
		int[] cleanarr= new int[arr.length];
		int count=0;
		cleanarr[0]=arr[0];
		for (int i = 1; i < arr.length; i++) {
			
			if(Arrays.binarySearch(cleanarr, arr[i])<0)
			{
				cleanarr[count++]=arr[i];
				Arrays.sort(cleanarr);
			}
		}
		
		return Arrays.copyOfRange(cleanarr, cleanarr.length - count, cleanarr.length);
	}
	
	//alternate implementation
	
	/*static int[] modifyArray(int[] arr) {
		int[] tmp = new int[arr.length];
		int count = 0;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				tmp[count++] = arr[i];
			} 

		}
		tmp[count++]=arr[arr.length -1];

		return Arrays.copyOfRange(tmp, 0, count);
	} */

}
