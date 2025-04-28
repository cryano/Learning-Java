package sintaxes_modularization;

import java.util.Scanner;

public class ModularizationExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, c = 0, higger = 0;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		higger = max(a, b, c);
		viewResult(higger);
		
		sc.close();
	}

	public static int max(int x, int y, int z) {
		int aux = 0;
		
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}
	
	public static void viewResult(int value) {
		System.out.println("Higger value: " + value);
	}
	
}
