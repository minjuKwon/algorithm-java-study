package basic100;

import java.util.Scanner;

public class Basic_071 {

	public static void main(String[] args) {
		
		int a;

		Scanner scanner = new Scanner(System.in);

		while (true) {
			a = scanner.nextInt();
			
			if (a == 0)
				break;
			System.out.println(a);
			
		}
		scanner.close();
	}

}
