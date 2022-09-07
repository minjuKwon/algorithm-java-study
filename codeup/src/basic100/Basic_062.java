package basic100;

import java.util.Scanner;

public class Basic_062 {

	public static void main(String[] args) {

		int a, b, c;

		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		scanner.close();

		System.out.println((a > b ? b : a) > c ? c : (a > b ? b : a));

	}

}
