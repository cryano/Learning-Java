import java.util.Scanner;
import java.util.Locale;

public class Fourth{
	public static void main(String[] args) {
		
		int id = 0, workHours = 0;
		float hourValue = 0.0f, salary = 0.0f;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your ID: ");
		id = sc.nextInt();
		System.out.print("Working hours in these 2 weeks: ");
		workHours = sc.nextInt();
		System.out.print("How much is an hour of your work worth? U$");
		hourValue = sc.nextFloat();
		
		salary = hourValue * workHours;
		
		System.out.println("ID: " + id);
		System.out.printf("Salary: U$%.2f dollars.\n", salary);
		
		sc.close();
		
	}

}
