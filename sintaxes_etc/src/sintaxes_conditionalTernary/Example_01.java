package sintaxes_conditionalTernary;

import java.util.Scanner;

public class Example_01 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		String condition = null;
		
		condition = (age >= 18) ? "Legal age" : "Ilegal age";
		System.out.println(condition);
		
		sc.close();
		
	}

}
