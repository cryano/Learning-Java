import java.util.Scanner;

public class Third{
	
	public static void main(String[] args){
		
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, add = 0; // Declaration of variables.
		
		Scanner sc = new Scanner(System.in); // Creating object from Scanner class to data's read;
		
		System.out.print("Enter a 1st nº: ");
		num1 = sc.nextInt();
		System.out.print("Enter a 2nd nº: ");
		num2 = sc.nextInt();
		System.out.print("Enter a 3rd nº: ");
		num3 = sc.nextInt();
		System.out.print("Enter a 4th nº: ");
		num4 = sc.nextInt();
		
		add = (num1 * num2 - num3 * num4);
		
		System.out.printf("%d.%d - %d.%d = %d\n", num1, num2, num3, num4, add);
		
		sc.close();
		
	}

}
