package basic100;

import java.util.Scanner;

public class Basic_063 {

	public static void main(String[] args) {

		int a, b, c;

		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		scanner.close();

		if (a % 2 == 0)
			System.out.println(a);

		if (b % 2 == 0)
			System.out.println(b);

		if (c % 2 == 0)
			System.out.println(c);

	}

}
