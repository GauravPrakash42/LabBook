package lab5;

import java.util.Scanner;

public class Exercise2 { // Write a Java Program to validate the full name of an employee. Create and
							// throw a user defined exception if firstName and lastName is blank.

	public static void main(String[] args) throws InvalidNameException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name: ");
		String first_name = sc.nextLine();
		System.out.println("Enter the last name: ");
		String last_name = sc.nextLine();

		try {
			if (first_name.trim() == "" || last_name.trim() == "") {
				throw new InvalidNameException();
			} else
				System.out.println("Valid name!");
		} catch (InvalidNameException e) {
			System.out.println("First and last names cannot be blank!");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Something went wrong");
			e.printStackTrace();
		}
	}

}
