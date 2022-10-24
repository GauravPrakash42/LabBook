package lab5;

import java.util.Scanner;

public class Exercise3 { // Create an Exception class named as “EmployeeException”(User defined
							// Exception) and throw an exception if salary of an employee is below than
							// 3000. Use Exception Handling mechanism to handle exception properly.

	public static void main(String[] args) throws EmployeeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee salary: ");
		double salary = sc.nextDouble();

		try {
			if (salary < 3000) {
				throw new EmployeeException("Salary less than 3000");
			} else {
				System.out.println("Salary not less than 1000");
			}
		} catch (EmployeeException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Something went wrong!");
			e.printStackTrace();
		}

	}

}
