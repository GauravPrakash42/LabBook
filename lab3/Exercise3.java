package lab3;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		String str, altrdstr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		str = sc.nextLine();
		altrdstr = alterString(str);
		System.out.println(altrdstr);
		sc.close();

	}
	static String alterString(String str) {
		StringBuffer astr = new StringBuffer("");
		String vowels="aeiouAEIOU";
		for (int i = 0; i < str.length(); i++) {
			char sc = str.charAt(i);
			if (vowels.indexOf(sc)==-1) {
				sc = (char) (sc + 1);
			}
			astr.append(sc);

		}

		return String.valueOf(astr);

	}

	/*static String alterString(String str) {
		StringBuffer astr = new StringBuffer("");
		for (int i = 0; i < str.length(); i++) {
			char sc = str.charAt(i);
			if (sc != 'a' && sc != 'e' && sc != 'i' && sc != 'o' && sc != 'u' && sc != 'A' && sc != 'E' && sc != 'I'
					&& sc != 'O' && sc != 'U') {
				sc = (char) (sc + 1);
			}
			astr.append(sc);

		}

		return String.valueOf(astr);

	}
*/
}
