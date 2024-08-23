package review3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dp2_11066 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		
		int [] cost=new int[501];
		int [] sum=new int[501];
		int [][]dp=new int[501][501];
		
		StringBuilder sb=new StringBuilder();
		StringTokenizer st;
		
		while(T-->0) {
			
			int N=Integer.parseInt(br.readLine());
			st=new StringTokenizer(br.readLine());
			
			for(int i=1;i<=N;i++) {
				cost[i]=Integer.parseInt(st.nextToken());
				sum[i]=cost[i]+sum[i-1];
			}
			
			for(int j=1;j<N;j++) {
				for(int i=1;i+j<=N;i++) {
					dp[i][i+j]=Integer.MAX_VALUE;
					for(int k=i;k<i+j;k++) {
						dp[i][i+j]=Math.min(dp[i][i+j], dp[i][k]+dp[k+1][i+j]+sum[i+j]-sum[i-1]);
					}
				}
			}
			
			sb.append(dp[1][N]).append('\n');
			
		}
		
		br.close();
		
		System.out.println(sb);

	}

}
