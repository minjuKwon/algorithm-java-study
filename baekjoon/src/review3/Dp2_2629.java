package review3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dp2_2629 {
	
	static int N;
	static int [] weight;
	static boolean [][] dp=new boolean[31][15001];

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
	    N=Integer.parseInt(br.readLine());
		weight=new int[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			weight[i]=Integer.parseInt(st.nextToken());
		}
		
		checkWeight(0,0);
		
		int M=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		
		st=new StringTokenizer(br.readLine());
		while(M-->0) {
			int bead=Integer.parseInt(st.nextToken());
			if(bead>15000)sb.append("N ");
			else sb.append(dp[N][bead]?"Y ":"N ");
		}
		br.close();
		
		System.out.println(sb);
		
	}
	
	static void checkWeight(int index, int w) {
		if(dp[index][w]) return;
		
		dp[index][w]=true;
		
		if(index==N) return;
		
		checkWeight(index+1, w);
		checkWeight(index+1, w+weight[index]);
		checkWeight(index+1, Math.abs(w-weight[index]));
	}

}
