import java.util.Scanner;
import java.util.Locale;

public class Fifth{
	
	public static void main(String[] args){
		
		int idClothe0 = 0, idClothe1 = 0, amount0 = 0, amount1 = 0;
		float value0 = 0.0f, value1 = 0.0f, fvalue0 = 0.0f, fvalue1 = 0.0f, total = 0.0f;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1st Id: ");
		idClothe0 = sc.nextInt();
		System.out.printf("Id %d's amount: ", idClothe0);
		amount0 = sc.nextInt();
		System.out.print("Unit value: ");
		value0 = sc.nextFloat();
		fvalue0 = value0 * amount0;
		
		System.out.println("------------------------------------");
		System.out.print("2nd Id: ");
		idClothe1 = sc.nextInt();
		System.out.printf("Id %d's amount: ", idClothe1);
		amount1 = sc.nextInt();
		System.out.print("Unit value: U$");
		value1 = sc.nextFloat();
		fvalue1 = value1 * amount1;
		
		total = fvalue0 + fvalue1;
		System.out.println();
		System.out.printf("Total pay: %.2f", total);
		
		sc.close();
		
	}
}