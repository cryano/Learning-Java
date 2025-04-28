package for_looping;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = 0;

		do {
			System.out.print("Enter a number [1 <= n <= 1000]: ");
			num = sc.nextInt();
		} while (num < 1 || num > 1000);
		
		for (int i = 1; i < num + 1; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

		sc.close();
	}

}
