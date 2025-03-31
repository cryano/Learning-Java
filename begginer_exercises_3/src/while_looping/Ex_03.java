package while_looping;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Ex_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int alcool = 0, gasolina = 0, diesel = 0, opc = 0;

		while (opc != 4) {
			System.out.println("1. Alcool");
			System.out.println("2. Gasolina");
			System.out.println("3. Diesel");
			System.out.println("4. Exit");
			System.out.print("Escolha: ");
			opc = sc.nextInt();
			if (opc > 4 || opc < 1) {
				while (opc > 4 || opc < 1) {
					System.out.print("Invalid. Escolha correto: ");
					opc = sc.nextInt();
				}
			}
			switch (opc) {
			case 1:
				alcool += 1;
				break;
			case 2:
				gasolina += 1;
				break;
			case 3:
				diesel += 1;
				break;
			}
		}
		
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();

	}

}
