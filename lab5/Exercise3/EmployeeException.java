package lab5;

public class EmployeeException extends Exception {

	public EmployeeException() {
		
	}

	public EmployeeException(String message) {
		super(message);
		System.out.println(message);
		
	}


}
