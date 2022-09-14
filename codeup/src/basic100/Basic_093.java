package basic100;

import java.util.Scanner;

public class Basic_093 {

	public static void main(String[] args) {

		int n, num;
		int min = 23;
		int[] arr = new int[10001];

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			num = sc.nextInt();
			arr[i] = num;
		}

		sc.close();

		for (int i = 1; i <= n; i++) {

			if (min > arr[i]) {
				min = arr[i];
			}
		}

		System.out.println(min);

	}

}
