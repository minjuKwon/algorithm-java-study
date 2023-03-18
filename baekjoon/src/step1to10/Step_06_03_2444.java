package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_06_03_2444 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<N;i++) {
			for(int j=1;j<N-i;j++) {
				sb.append(' ');
			}
			for(int j=0;j<i*2+1;j++) {
				sb.append('*');
			}
			sb.append('\n');
		}
		
		for(int i=1;i<N;i++) {
			for(int j=0;j<i;j++) {
				sb.append(' ');
			}
			for(int j=1;j<(N-i)*2;j++) {
				sb.append('*');
			}
			sb.append('\n');
		}
		
		br.close();
		
		System.out.println(sb);

	}

}
