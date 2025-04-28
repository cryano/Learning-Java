package for_looping;

import java.util.Scanner;
import java.util.Locale;

public class Ex_03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int testes = 0;

		testes = sc.nextInt();

		for (int i = 0; i < testes; i++) {

			float nota1 = sc.nextFloat();
			float nota2 = sc.nextFloat();
			float nota3 = sc.nextFloat();
			double average = ((nota1 * 2.0) + (nota2 * 3.0) + (nota3 * 5.0)) / 10;
			System.out.printf("Average: %.1f\n", average);
		
		}

		sc.close();

	}

}
