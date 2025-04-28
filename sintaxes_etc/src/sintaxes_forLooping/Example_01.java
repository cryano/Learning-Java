package sintaxes_forLooping;

import java.util.Scanner;

public class Example_01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cont = 0, num = 0, sum = 0;
		
		System.out.print("Quantidade: ");
		cont = sc.nextInt();
		
		for (int i = 0; i < cont; i++) {
			num = sc.nextInt();
			sum += num;
		}

		System.out.println("Soma: " + sum);
		sc.close();
	}
	
}
