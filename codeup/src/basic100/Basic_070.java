package basic100;

import java.util.Scanner;

public class Basic_070 {

	public static void main(String[] args) {

		int countNum, a;

		Scanner scanner = new Scanner(System.in);
		countNum = scanner.nextInt();

		for (int i = 0; i < countNum; i++) {
			a = scanner.nextInt();
			System.out.println(a);
		}

		scanner.close();
		
	}

}
