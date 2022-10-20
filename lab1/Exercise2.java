package lab1;

import java.util.Scanner;

public class Exercise2 { // Write a java program that simulates a traffic light. The program lets the
							// user select one of three lights: red, yellow, or green with radio buttons. On
							// entering the choice, an appropriate message with “stop” or “ready” or “go”
							// should appear in the console .Initially there is no message shown.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String selection = sc.nextLine();

		if (selection.equalsIgnoreCase("red")) {
			System.out.println("stop");
		} else if (selection.equalsIgnoreCase("yellow")) {
			System.out.println("ready");
		} else if (selection.equalsIgnoreCase("green")) {
			System.out.println("go");
		} else {
			System.out.println("Invalid input");
		}

		sc.close();
	}

}
