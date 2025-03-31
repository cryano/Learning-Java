package while_looping;

import java.util.Scanner;

public class Ex_01{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		short password = 0, truePassword = 2002;
		
		System.out.print("Enter the password: ");
		password = sc.nextShort();
		
		while (password != truePassword) {
			System.out.print("\nInvalid password!\nEnter the password: ");
			password = sc.nextShort();
		}
		
		System.out.println("\nValid password!");
		sc.close();
		
	}
	
}
