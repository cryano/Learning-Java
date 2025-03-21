package beginner_exercises_2;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		// Declaration of variables:
		float axleX = 0, axleY = 0;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Axle of X: ");
		axleX = sc.nextFloat();
		System.out.print("Axle of Y: ");
		axleY = sc.nextFloat();
		
		if (axleX > 0 && axleY > 0) {
			System.out.println("Q1");
		} else if (axleX > 0 && axleY < 0) {
			System.out.println("Q4");
		} else if (axleX < 0 && axleY < 0) {
			System.out.println("Q3");
		} else if (axleX < 0 && axleY > 0) {
			System.out.println("Q2");
		} else {
			System.out.println("Origin");
		}

	}

}
