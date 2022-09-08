package basic100;

import java.util.Scanner;

public class Basic_066 {

	public static void main(String[] args) {

		int score;

		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		scanner.close();

		if (score >= 90)
			System.out.println("A");
		else if (score >= 70)
			System.out.println("B");
		else if (score >= 40)
			System.out.println("C");
		else
			System.out.println("D");

	}

}
