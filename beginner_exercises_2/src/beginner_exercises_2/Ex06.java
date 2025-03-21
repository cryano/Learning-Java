package beginner_exercises_2;

import java.util.Scanner;
import java.util.Locale;

public class Ex06 {

	public static void main(String[] args) {
		
		// Declaration from variables:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float number;
		
		System.out.print("Enter a number: ");
		number = sc.nextFloat();
		
		if (number >= 0 && number <= 25) {
			System.out.println("Between = [0;25]");
		} else if (number > 25 && number <= 50) {
			System.out.println("Between = [25;50]");
		} else if (number > 50 && number <= 75) {
			System.out.println("Between = [50;75]");
		} else if (number > 75 && number <= 100) {
			System.out.println("Between = [75;100]");
		} else {
			System.out.print("Out of range.");
		}

		sc.close();
		
	}

}
