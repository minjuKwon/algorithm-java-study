package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class String_9093 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder answer=new StringBuilder();
		
		StringTokenizer st;
		StringBuilder reversal;
		int T=Integer.parseInt(br.readLine());
		
		for(int i=0;i<T;i++) {
			st=new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				reversal=new StringBuilder(st.nextToken());
				answer.append(reversal.reverse()).append(' ');
			}
			answer.append('\n');
		}
		
		br.close();
		
		System.out.println(answer);

	}

}
