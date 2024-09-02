package review3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dp2_7579 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		int [] memory=new int[N+1];
		int [] cost=new int[N+1];
		int [][] dp=new int[N+1][10_001];

		st=new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++) {
			memory[i]=Integer.parseInt(st.nextToken());
		}
		
		st=new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++) {
			cost[i]=Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		for(int i=1;i<=N;i++) {
			for(int j=0;j<=10000;j++) {
				if(cost[i]>j) {
					dp[i][j]=dp[i-1][j];
				}else {
					dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-cost[i]]+memory[i]);
				}
			}
		}
		
		for(int i=0;i<=10000;i++) {
			if(dp[N][i]>=M) {
				System.out.println(i);
				break;
			}
		}
		
	}

}
