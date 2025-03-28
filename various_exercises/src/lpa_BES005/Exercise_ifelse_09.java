package lpa_BES005;

import java.util.Scanner;
import java.util.Locale;
public class Exercise_ifelse_09 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float saldoMedio = 0.0f, valorCredito = 0.0f;
		
		System.out.print("Qual seu saldo médio do último ano? R$");
		saldoMedio = sc.nextFloat();
		
		if (saldoMedio <= 200) {
			System.out.println("Saldo insuficienete. Nenhum crédito a conceder.");
		} else if (saldoMedio > 200 && saldoMedio <= 400) {
			valorCredito = (float) (saldoMedio * 0.2);
			System.out.printf("Saldo: R$%.2f\n", saldoMedio);
			System.out.printf("Crédito: R$%.2f\n", valorCredito);
		} else if (saldoMedio > 400 && saldoMedio <= 600) {
			valorCredito = (float) (saldoMedio * 0.3);
			System.out.printf("Saldo: R$%.2f\n", saldoMedio);
			System.out.printf("Crédito: R$%.2f\n", valorCredito);
		} else {
			valorCredito = (float) (saldoMedio * 0.4);
			System.out.printf("Saldo: R$%.2f\n", saldoMedio);
			System.out.printf("Crédito: R$%.2f\n", valorCredito);
		}
		
		sc.close();
	}

}
