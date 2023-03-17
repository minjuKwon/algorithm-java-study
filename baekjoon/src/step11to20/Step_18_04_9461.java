package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_18_04_9461 {

	static long [] sequence=new long[101];
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		sequence[0]=0; sequence[1]=1;
		sequence[2]=1; sequence[3]=1;
		for(int i=4;i<sequence.length;i++) {
			sequence[i]=-1;
		}
		
		int T=Integer.parseInt(br.readLine());
		while(T-->0) {
			int N=Integer.parseInt(br.readLine());
			sb.append(P(N)).append('\n');
		}
		
		br.close();

		System.out.println(sb);
		
	}
	
	static long P(int n) {
		if(sequence[n]==-1) {
			sequence[n]=P(n-2)+P(n-3);
		}
		return sequence[n];
	}

}
