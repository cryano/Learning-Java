package for_looping;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int x = 0, in = 0, out = 0;
		
		x = sc.nextInt();
		
		for(int i = 0; i < x; i++) {
			short num = sc.nextShort();
			if (num >= 10 && num <= 20) {
				in += 1;
			}
			else {
				out += 1;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
		
	}

}
