package beginner_exercises_2;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		int num = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number to comfirm: ");
		num = sc.nextInt();
		
		if (num > -1) {
			System.out.printf("the number %d is positive.\n", num);
		} else {
			System.out.printf("The number %d is negative.\n", num);
		}

		sc.close();

	}

}
