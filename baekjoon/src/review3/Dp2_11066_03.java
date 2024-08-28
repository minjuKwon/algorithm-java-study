package review3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dp2_11066_03 {
	
	static int [] cost=new int[501];
	static int [] sum=new int[501];
	static int [][] dp=new int[501][501];

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb=new StringBuilder();
		
		while(T-->0) {
			int N=Integer.parseInt(br.readLine());
			st=new StringTokenizer(br.readLine());
			
			for(int i=1;i<=N;i++) {
				cost[i]=Integer.parseInt(st.nextToken());
				sum[i]=sum[i-1]+cost[i];
			}
			
			for(int i=1;i<=N;i++) {
				for(int j=1;j<=N;j++) {
					dp[i][j]=-1;
				}
			}
			
			sb.append(dp(1,N)).append('\n');
		}
		
		br.close();
		
		System.out.println(sb);
		
	}
	
	static int dp(int x, int y) {
		
		if(dp[x][y]!=-1) 
			return dp[x][y];
		
		if(x==y)
			return dp[x][y]=0;
		
		if(x+1==y)
			return dp[x][y]=cost[x]+cost[y];
		
		dp[x][y]=Integer.MAX_VALUE;
		
		for(int i=x;i<y;i++) {
			int left=dp(x,i);
			int right=dp(i+1,y);
			dp[x][y]=Math.min(dp[x][y], left+right);
		}
		
		return dp[x][y]=dp[x][y]+sum[y]-sum[x-1];
		
	}

}
