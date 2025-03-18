package conditionals;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int hr = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("What time is it? ");
		hr = sc.nextInt();

		if (hr < 12 && hr > 5) {
			System.out.print("Hello, good morning.");
		} else if (hr >= 12 && hr < 18) {
			System.out.print("Hello, good afternoon.");
		} else if (hr >= 18 && hr < 24) {
			System.out.print("Hello, good evening.");
		} else {
			System.out.println("Hello, good night.");
		}

		sc.close();
	}

}
