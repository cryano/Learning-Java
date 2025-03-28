package lpa_BES005;

import java.util.Scanner;

public class Exercise_ifelse_07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ages = 0;
		
		System.out.print("Amount of ages: ");
		ages = sc.nextInt();
		
		switch (ages) {
		case 1:
			System.out.println("Bodas de papel.");
			break;
		case 10:
			System.out.println("Bodas de estanho.");
			break;
		case 20:
			System.out.println("Bodas de porcelana.");
			break;
		case 30:
			System.out.println("Bodas de pérola.");
			break;
		case 40:
			System.out.println("Bodas de esmeralda.");
			break;
		case 50:
			System.out.println("Bodas de ouro.");
			break;
		default:
			System.out.println("Não sei informar.");
			break;
		}
		
		sc.close();

	}

}
