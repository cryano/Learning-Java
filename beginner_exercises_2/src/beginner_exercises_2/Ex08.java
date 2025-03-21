package beginner_exercises_2;

import java.util.Scanner;
import java.util.Locale;

public class Ex08 {

	public static void main(String[] args) {
		
		float salary = 0.0f, aux = 0.0f, tax = 0.0f;		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Your salary: $");
		salary = sc.nextFloat();
		
		if (salary <= 2000) {
			tax = (float) 0.0;
		}
		if (salary > 2000 && salary <= 3000) {
			aux = salary;
			aux = aux - 2000;
			tax = (float) (aux * 0.08);
		} else if (salary > 3000 && salary <= 4500) {
			aux = salary;
			aux = aux - 3000;
			tax = (float) (aux * 0.18 + 1000 * 0.08);
		} else {
			aux = salary;
			aux = aux - 4500;
			tax = (float) (aux * 0.28 + 1500 * 0.18 + 1000 * 0.08);			
		}
		
		
		if (tax > 0.0) {
			System.out.printf("Tax: %.2f\n", tax);
		} else {
			System.out.println("Immune.");
		}
		
		sc.close();
		
	}

}
