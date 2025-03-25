package sintaxes_cumulativeAssignment;

import java.util.Scanner;

public class example_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int hours = sc.nextInt();
		int payment = 50;
		
		if (hours > 100) {
			payment += (hours - 100) * 2;
		}
		
		System.out.println("Total to pay: " + payment);
		
		sc.close();
		
	}
	
}
