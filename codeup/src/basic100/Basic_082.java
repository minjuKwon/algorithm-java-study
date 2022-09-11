package basic100;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Basic_082 {

	public static void main(String[] args) throws IOException {

		int r, g, b, i, j, k;

		Scanner scanner = new Scanner(System.in);
		r = scanner.nextInt();
		g = scanner.nextInt();
		b = scanner.nextInt();
		scanner.close();

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 자바에서 삼중 for문의 System.out.println()은 출력이 느려지기에 BufferedWriter사용
		for (i = 0; i < r; i++) {
			for (j = 0; j < g; j++) {
				String str = "";
				for (k = 0; k < b; k++) {
					str += i + " " + j + " " + k + "\n";
				}
				bw.write(str);
				bw.flush();
			}
		}
		
		System.out.println(r * g * b);
		bw.close();
		
	}

}
