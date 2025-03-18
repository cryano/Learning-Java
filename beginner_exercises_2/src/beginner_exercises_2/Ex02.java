package beginner_exercises_2;

import java.util.Scanner;

public class Ex02{
	
	public static void main(String[] args) {
		
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Is even.");
		} else {
			System.out.println("Is odd.");
		}
		
		sc.close();
		
	}
	
}
