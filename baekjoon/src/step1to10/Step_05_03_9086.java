package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_05_03_9086 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		
		StringBuilder sb=new StringBuilder();
		
		while(T-->0) {
			String str=br.readLine();
			sb.append(str.charAt(0)).append(str.charAt(str.length()-1)).append('\n');
		}
		
		br.close();
		
		System.out.println(sb);

	}

}
