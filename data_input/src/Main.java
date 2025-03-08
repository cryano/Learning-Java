import java.math.*;
import java.util.Locale;
import java.util.Scanner; // Importing 'Java Until' package. 

public class Main{
	
	public static void main(String[] args) {
		
		// Crating Scanner object:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		// Creating variables:
		String name;
		char gender;
		int age;
		float weight;
		
		// Input of data:
		System.out.print("Enter your name: ");
		name = sc.next();
		System.out.print("Enter your age: ");
		age = sc.nextInt();
		System.out.print("Enter your weight: ");
		weight = sc.nextFloat();
		System.out.print("Which your gender? [M/F]: ");
		gender = sc.next().charAt(0);
		System.out.println();
		
		// Output data:
		System.out.println("Congrulations! Here is your record:");
		System.out.println("-----------------------------------");
		System.out.println("Name: " + name);
		System.out.printf("Age: %d\n", age);
		System.out.println("Gender: " + gender);
		System.out.printf("Weight: %.2f kg\n", weight);
		System.out.println("-----------------------------------");
		*/
		
		// Testing the line brake:
		int x = 10, a = 0;
		String m0 = null, m1 = null, m2 = null;
		
		
		a = (int) Math.pow(x, 2);
		
		System.out.println(a);
		
		// Closing 'sc' object:
		sc.close();
		
	}
	
}
