package lpa_BES005;

import java.util.Scanner;
import java.util.Locale;

public class Exercise_looping_08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = 0, y = 0;
		boolean cont = true;

		System.out.print("1º Valor: ");
		x = sc.nextInt();
		System.out.print("2º Valor: ");
		y = sc.nextInt();
		System.out.println();
		
		while (cont == true) {
			int opc = 0, result = 0;

			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("5 - Troca de valores");
			System.out.println("6 - Sair");
			System.out.print("Qual você deseja? ");
			opc = sc.nextInt();
			System.out.println();

			switch (opc) {
			case 1:
				result = x + y;
				System.out.printf("%d + %d = %d", x, y, result);
				break;
			case 2:
				result = x - y;
				System.out.printf("%d - %d = %d", x, y, result);
				break;
			case 3:
				result = x * y;
				System.out.printf("%d * %d = %d", x, y, result);
				break;
			case 4:
				result = x / y;
				System.out.printf("%d / %d = %d", x, y, result);
				break;
			case 5:
				System.out.print("1º Valor: ");
				x = sc.nextInt();
				System.out.print("2º Valor: ");
				y = sc.nextInt();
				break;
			case 6:
				cont = false;
				break;
			}
			System.out.println("\n");
		}

		sc.close();
	}

}
