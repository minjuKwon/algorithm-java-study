package basic100;

import java.util.Scanner;

public class Basic_089 {

	public static void main(String[] args) {
		
		int a, m, d, n;
		long num = 0;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
		n = sc.nextInt();
		sc.close();

		num = a;
		
		for (int i = 1; i < n; i++) {
			num = num * m + d;
		}

		System.out.println(num);

	}

}
