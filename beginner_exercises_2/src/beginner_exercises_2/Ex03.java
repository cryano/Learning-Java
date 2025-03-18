package beginner_exercises_2;

import java.util.Scanner;

public class Ex03{
	
	public static void main(String[] args) {
		
		int num1 = 0, num2 = 0, aux = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the 1st number: ");
		num1 = sc.nextInt();
		System.out.print("Enter the 2nd number: ");
		num2 = sc.nextInt();
		
		if (num2 > num1) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
		
		if (num1 % num2 == 0) {
			System.out.print("It's multiple.");
		} else {
			System.out.println("It's not multiple.");
		}
		
		sc.close();
		
	}
	
}
