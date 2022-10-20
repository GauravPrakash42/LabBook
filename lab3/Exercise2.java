package lab3;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your string: ");
		String str= sc.nextLine();
		System.out.println(str+'|'+getImage(str));
		sc.close();

	}
	static String getImage(String str)
	{
		StringBuilder revstr= new StringBuilder(str);
		return String.valueOf(revstr.reverse());
	}

}
