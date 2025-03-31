package while_looping;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		short x = 0, y = 1;

		x = sc.nextShort();
		y = sc.nextShort();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro.");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo.");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro.");
			} else if (x > 0 && y < 0) {
				System.out.println("Quarto.");
			}
			x = sc.nextShort();
			y = sc.nextShort();
		}

		sc.close();

	}

}