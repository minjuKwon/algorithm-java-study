package basic100;

import java.util.Scanner;

public class Basic_097 {

	public static void main(String[] args) {

		int[][] maze = new int[11][11];
		int i, j;
		int x = 2;
		int y = 2;

		Scanner sc = new Scanner(System.in);

		for (i = 1; i < maze.length; i++) {
			for (j = 1; j < maze[i].length; j++) {
				maze[i][j] = sc.nextInt();
			}
		}

		sc.close();

		while (true) {
			if (maze[x][y] == 2) {
				maze[x][y] = 9;
				break;
			}
			if (maze[x][y + 1] == 1) {
				if (maze[x + 1][y] == 1)
					break;
				else
					x++;
			} else if (maze[x][y + 1] == 0)
				y++;
			if (maze[x][y] == 2) {
				maze[x][y] = 9;
				break;
			}
			maze[x][y] = 9;
		}

		maze[2][2] = 9;

		for (i = 1; i < maze.length; i++) {
			for (j = 1; j < maze[i].length; j++) {
				System.out.print(maze[i][j] + " ");
			}
			System.out.println();
		}

	}

}
