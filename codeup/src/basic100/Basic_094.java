package basic100;

import java.util.Arrays;
import java.util.Scanner;

public class Basic_094 {

	public static void main(String[] args) {

		int n, x, y;
		int[][] go = new int[20][20];

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			go[x][y] = 1;
		}

		for (int i = 1; i < go.length; i++) {
			for (int j = 1; j < go.length; j++) {
				System.out.print(go[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();

	}

}
