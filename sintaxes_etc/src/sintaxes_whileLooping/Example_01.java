package sintaxes_whileLooping;

import java.util.Scanner;

public class Example_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = 0, sumN = 0, cont = 0;

		System.out.printf("%dº num > ", cont);
		num = sc.nextInt();
		sumN += num;
		
		while (num != 0) {
			cont++;
			System.out.printf("%dº num > ", cont);
			num = sc.nextInt();
			sumN += num;
		}

		System.out.println(sumN);

		sc.close();
	}
}
