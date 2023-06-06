package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://js1jj2sk3.tistory.com/3
public class Step_Dp2_01_11066 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int T=Integer.parseInt(br.readLine());

		StringBuilder sb=new StringBuilder();
		
		int [][] dp=new int[501][501];
		int [] cost=new int[501];
		int [] sum=new int[501];
		
		while(T-->0) {
			
			int N=Integer.parseInt(br.readLine());
			
			StringTokenizer st=new StringTokenizer(br.readLine());
			for(int i=1;i<=N;i++) {
				cost[i]=Integer.parseInt(st.nextToken());
				sum[i]=sum[i-1]+cost[i];
			}
			
			for(int i=1;i<N;i++) {
				for(int j=1;i+j<=N;j++) {
					dp[j][i+j]=Integer.MAX_VALUE;
					for(int k=j;k<i+j;k++) {
						dp[j][i+j]=Math.min(dp[j][i+j], dp[j][k]+dp[k+1][i+j]+sum[i+j]-sum[j-1]);
					}
				}
			}
			
			sb.append(dp[1][N]).append('\n');
			
		}
		
		br.close();
		
		System.out.println(sb);

	}

}
