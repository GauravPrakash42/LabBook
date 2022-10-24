package lab5;

import java.util.Scanner;

public class Exercise1 { // Validate the age of a person and display proper message by using user defined
							// exception. Age of a person should be above 15.

	public static void main(String[] args) throws InvalidAgeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = sc.nextInt();

		try {
			if (age > 15) {
				System.out.println("Valid age!");
			} else {
				// throw new InvalidAgeException("Invalid Age!");
				throw new InvalidAgeException("Invalid Age!");
			}
		} catch (InvalidAgeException e) {
			System.out.println("Age of a person should be above 15!");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Something went wrong!");
			e.printStackTrace();
		}

	}

}
