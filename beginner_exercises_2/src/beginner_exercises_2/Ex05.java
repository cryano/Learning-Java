package beginner_exercises_2;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		// Declaration variables:
		int opt = 0, amount = 0;
		float total = 0.0f;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("[1] Cachorro quente	- R$4.00");
		System.out.println("[2] X-salada		- R$4.50");
		System.out.println("[3] X-bacon		- R$5.00");
		System.out.println("[4] Torrada simples	- R$2.00");
		System.out.println("[5] Refrigerante	- R$1.50");
		System.out.print("Which do you desire? ");
		opt = sc.nextInt();

		if (opt == 1) {
			System.out.print("Enter the amount: ");
			amount = sc.nextInt();
			total = (float) (amount * 4);
		} else if (opt == 2) {
			System.out.print("Enter the amount: ");
			amount = sc.nextInt();
			total = (float) (amount * 4.5);				
		} else if (opt == 3) {
			System.out.print("Enter the amount: ");
			amount = sc.nextInt();
			total = (float) (amount * 5);				
		} else if (opt == 4) {
			System.out.print("Enter the amount: ");
			amount = sc.nextInt();
			total = (float) (amount * 2);				
		} else {
			System.out.print("Enter the amount: ");
			amount = sc.nextInt();
			total = (float) (amount * 1.5);				
		}

		System.out.printf("\nTotal: %.2f", total);
	}

}
