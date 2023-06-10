package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_Dp2_04_2629 {
	
	static boolean [][] dp=new boolean[31][15001];
	static int [] weight;
	static int N, M;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		
		weight=new int[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			weight[i]=Integer.parseInt(st.nextToken());
		}
		
		checkWeight(0,0);
		
		M=Integer.parseInt(br.readLine());
		
		StringBuilder sb=new StringBuilder();
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<M;i++) {
			int bead=Integer.parseInt(st.nextToken());
			if(bead>15000) sb.append("N ");
			else sb.append(dp[N][bead]?"Y ":"N ");
		}
		
		br.close();
		
		System.out.println(sb);

	}
	
	static void checkWeight(int idx, int w) {
		
		if(dp[idx][w]) return;
		dp[idx][w]=true;
		if(idx==N) return;
		
		checkWeight(idx+1,w+weight[idx]);
		checkWeight(idx+1,w);
		checkWeight(idx+1,Math.abs(w-weight[idx]));
		
	}
	
}
