package basic100;

import java.util.Scanner;

public class Basic_088 {

	public static void main(String[] args) {

		int a, d, n;
		double num = 0;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		d = sc.nextInt();
		n = sc.nextInt();
		sc.close();

		num = a * (Math.pow(d, n - 1));

		System.out.println(Math.round(num));

	}

}
