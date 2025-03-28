package lpa_BES005;

import java.util.Scanner;
import java.util.Locale;

public class Exercise_ifelse_10 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int opc = 0, bilhetes = 0;
		float valor = 0.0f, troco = 0.0f;

		System.out.println("[0] Bilhete Unitário	- R$2.00");
		System.out.println("[1] Bilhete Duplo	- R$3.00");
		System.out.println("[2] Bilhete 10		- R$12.00");
		System.out.print("Qual você deseja?");
		opc = sc.nextInt();
		System.out.print("Qual valor? R$");
		valor = sc.nextFloat();

		switch (opc) {
		case 0:
			bilhetes = (int) (valor / 2);
			troco = (float) (valor - bilhetes * 2);
			System.out.println("\nQuantidade de bilhetes: " + bilhetes);
			System.out.printf("Troco: R$%.2f\n", troco);
			break;
		case 1:
			bilhetes = (int) (valor / 3);
			troco = (float) (valor - bilhetes * 3);
			System.out.println("\nQuantidade de bilhetes: " + bilhetes);
			System.out.printf("Troco: R$%.2f\n", troco);
			break;
		case 2:
			bilhetes = (int) (valor / 12);
			troco = (float) (valor - bilhetes * 12);
			System.out.println("\nQuantidade de bilhetes: " + bilhetes);
			System.out.printf("Troco: R$%.2f\n", troco);
			break;
		default:
			System.out.println("Escolha uma opção válida.");
		}

		sc.close();
	}

}
