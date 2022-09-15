package basic100;

import java.util.Scanner;

public class Basic_095 {

	public static void main(String[] args) {

		int n, x, y;
		int[][] go = new int[20][20];

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i < go.length; i++) {
			for (int j = 1; j < go.length; j++) {
				go[i][j] = sc.nextInt();
			}
		}

		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			for (int j = 1; j < go.length; j++) {
				if (go[x][j] == 0)
					go[x][j] = 1;
				else
					go[x][j] = 0;
			}
			for (int j = 1; j < go.length; j++) {
				if (go[j][y] == 0)
					go[j][y] = 1;
				else
					go[j][y] = 0;
			}
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
