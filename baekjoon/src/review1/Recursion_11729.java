package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursion_11729 {
	
	static int count=0;
	static StringBuilder sb=new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int K=Integer.parseInt(br.readLine());
		
		hanoi(K, 1, 2, 3);

		System.out.println(count);
		System.out.println(sb);

	}
	
	static void hanoi(int n, int start, int mid, int end) {
		count++;
		if(n==1) {
			sb.append(start).append(' ').append(end).append('\n');
			return;
		}
		hanoi(n-1, start, end ,mid);
		sb.append(start).append(' ').append(end).append('\n');
		hanoi(n-1, mid, start ,end);
	}

}
