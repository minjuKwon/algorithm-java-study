package basic100;

import java.util.Scanner;

public class Basic_097 {

	public static void main(String[] args) {

		int[][] maze = new int[11][11];
		int i, j;
		int ant = 0;
		int x = 2;
		int y = 2;

		Scanner sc = new Scanner(System.in);

		for (i = 1; i < maze.length; i++) {
			for (j = 1; j < maze[i].length; j++) {
				maze[i][j] = sc.nextInt();
			}
		}

		sc.close();

		ant = maze[x][y];

		while (true) {
			if (ant == 0) {
				maze[x][y] = 9;
				ant = maze[x][++y];
			} else if (ant == 1) {
				ant = maze[++x][--y];
			} else if (ant == 2) {
				maze[x][y] = 9;
				break;
			}
		}

		for (i = 1; i < maze.length; i++) {
			for (j = 1; j < maze[i].length; j++) {
				System.out.print(maze[i][j] + " ");
			}
			System.out.println();
		}

	}

}
