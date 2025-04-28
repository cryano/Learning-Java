package sintaxes_dowhileLooping;

import java.util.Scanner;
import java.util.Locale;

public class Example_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		float c = 0.0f, f = 0.0f;
		String resp = null;
		do {
			System.out.print("Informe o grau em ºC: ");
			c = sc.nextFloat();
			f = (9 * c) / 5 + 32;
			System.out.printf("%.1fºC = %.1fºF\n", c, f);
			System.out.print("\nDeseja continuar? [S/N]: ");
			resp = sc.next();
		} while (resp.equals("s") || resp.equals("sim"));

		sc.close();
	}

}
