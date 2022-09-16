package basic100;

import java.util.Scanner;

public class Basic_096 {

	public static void main(String[] args) {

		int h, w, n, l, d, x, y, i, j;
		int[][] arr = new int[101][101];

		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();

		n = sc.nextInt();

		for (i = 0; i < n; i++) {
			l = sc.nextInt();
			d = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();
			sc.nextLine();
			if (d == 0) {
				for (j = 0; j < l; j++) {
					arr[x][y + j] = 1;
				}
			} else {
				for (j = 0; j < l; j++) {
					arr[x + j][y] = 1;
				}
			}
		}

		sc.close();

		for (i = 1; i <= h; i++) {
			for (j = 1; j <= w; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
