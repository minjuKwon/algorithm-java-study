package basic100;

import java.util.Scanner;

public class Basic_083 {

	public static void main(String[] args) {

		long h, b, c, s;
		double sound = 0;

		Scanner sc = new Scanner(System.in);
		h = sc.nextLong();
		b = sc.nextLong();
		c = sc.nextLong();
		s = sc.nextLong();
		sc.close();

		sound = h * b * c * s / Math.pow(2, 23);

		System.out.printf("%.1f MB", sound);

	}

}
