import java.util.Scanner;

public class First {
	
	public static void main(String[] args) {
		int num1, num2, soma;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1st nº: ");
		num1 = sc.nextInt();
		System.out.print("2nd nº: ");
		num2 = sc.nextInt();
		
		soma = num1 + num2;
		System.out.println("Soma: " + soma);
		
		sc.close();
		
	}
}
