package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_18_04_9461_02 {

	static long[] sequence=new long[101];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		P();
		
		int T=Integer.parseInt(br.readLine());
		while(T-->0) {
			int N=Integer.parseInt(br.readLine());
			sb.append(sequence[N]).append('\n');
		}
		
		br.close();
		
		System.out.println(sb);
				
	}
	
	static void P() {
		
		sequence[1]=1;
		sequence[2]=1; 
		sequence[3]=1;
		
		for(int i=4;i<sequence.length;i++) {
			sequence[i]=sequence[i-2]+sequence[i-3];
		}
		
	}

}
