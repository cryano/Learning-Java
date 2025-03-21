package beginner_exercises_2;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
	
		// Declaration from variables:
		float startHour = 0.0f, endHour = 0.0f, gameTime = 0.0f;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Start time: ");
		startHour = sc.nextFloat();
		System.out.print("End time: ");
		endHour = sc.nextFloat();
		
		gameTime = endHour - startHour;
		
		if (gameTime < 1 || gameTime > 24) {
			System.out.println("Game time is very less or very big.");
		} else {
			System.out.println("Game time: " + gameTime);
		}
		
		sc.close();
		
	}
	
}
