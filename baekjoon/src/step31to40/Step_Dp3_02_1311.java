package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Step_Dp3_02_1311 {

	public static void main(String[] args) throws IOException{
		
		final int INF=20*10000+1;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int [][] arr=new int[N+1][N+1];
		int [][] dp=new int[N+1][1<<(N+1)];
		
		StringTokenizer st;
		for(int i=1;i<=N;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=1;j<=N;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		br.close();
		
		for(int [] row: dp) {
			Arrays.fill(row, INF);
		}
		
		dp[0][0]=0;
		
		for(int i=1;i<=N;i++) {
			for(int j=0;j< 1<<(N+1); j++) {
				if(dp[i-1][j]==INF) continue;
				for(int k=1;k<=N;k++) {
					if((j & (1<<k))!=0) continue;
					dp[i][j|1<<k]=Math.min(dp[i][j|1<<k], dp[i-1][j]+arr[i][k]);
				}
			}
		}
		
		System.out.println(dp[N][ (1<<(N+1)) -2 ]);

	}

}
