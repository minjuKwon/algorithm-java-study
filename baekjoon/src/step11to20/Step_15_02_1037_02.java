package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_15_02_1037_02 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (n-->0) {
			int num = Integer.parseInt(st.nextToken());
			min = num < min ? num : min;
			max = num > max ? num : max;
		}
		br.close();

		System.out.println(min * max);

	}

}
