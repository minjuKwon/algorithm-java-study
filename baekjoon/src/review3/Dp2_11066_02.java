package review3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dp2_11066_02 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		
		int [] cost=new int[501];
		int [] sum=new int[501];
		int [][]dp=new int[501][501];
		int [][] opt=new int[501][501];
		
		StringBuilder sb=new StringBuilder();
		StringTokenizer st;
		
		while(T-->0) {
			
			int N=Integer.parseInt(br.readLine());
			st=new StringTokenizer(br.readLine());
			
			for(int i=1;i<=N;i++) {
				cost[i]=Integer.parseInt(st.nextToken());
				sum[i]=cost[i]+sum[i-1];
			}
			
			for(int i=1;i<=N;i++) {
				opt[i][i]=i;
			}
		
			for(int j=1;j<N;j++) {
				for(int i=1;i+j<=N;i++) {
					dp[i][i+j]=Integer.MAX_VALUE;
					for(int k=opt[i][i+j-1];k<=Math.min(opt[i+1][i+j], i+j-1);k++) {
						int temp=dp[i][k]+dp[k+1][i+j]+sum[i+j]-sum[i-1];
						if(dp[i][i+j]>temp) {
							dp[i][i+j]=temp;
							opt[i][i+j]=k;
						}
					}
				}
			}
			
			sb.append(dp[1][N]).append('\n');
			
		}
		
		br.close();

		System.out.println(sb);
		
	}

}
