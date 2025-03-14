import java.util.Scanner;
import java.util.Locale;

public class Second {

	public static void main(String[] args) {
		float PI = (float) 3.14159, area = 0, raio = 0;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o valor da area: ");
		area = sc.nextFloat();
		raio = (float) (PI * Math.pow(area, 2));
		
		System.out.printf("RAIO é: %.4f\n", raio);
		
		sc.close();
	}

}
