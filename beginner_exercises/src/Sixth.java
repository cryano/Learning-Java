import java.util.Locale;
import java.util.Scanner;
import java.math.*;

public class Sixth{
	
	public static void main(String[] args) {
		
		double a = 0.0, b = 0.0, c = 0.0;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A: ");
		a = sc.nextDouble();
		System.out.print("B: ");
		b = sc.nextDouble();
		System.out.print("C: ");
		c = sc.nextDouble();
		System.out.println();
		
		// A)
		double areaRT = (a * c) / 2;
		System.out.println("A) Area: " + areaRT);

		// B)
		var PI = 3.14159;
		double areaRay = PI * Math.pow(c, 2);
		System.out.println("B) Ray: " + areaRay);
		
		// C)
		double areaTrap = ((a + b) * c) / 2;
		System.out.println("C) Trapeze: " + areaTrap);
		
		//D)
		double areaB = Math.pow(b, 2);
		System.out.println("D) b²: " + areaB);
		
		//E)
		double areaAeB = a * b;
		System.out.println("E) area a & b: " + areaAeB);
		
		sc.close();
		
	}
}