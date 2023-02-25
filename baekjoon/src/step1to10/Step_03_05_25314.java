package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_03_05_25314 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		StringBuilder sb=new StringBuilder();
		while(N>4) {
			sb.append("long").append(" ");
			N-=4;
		}
		
		br.close();
		
		sb.append("long int");
		System.out.println(sb);

	}

}
