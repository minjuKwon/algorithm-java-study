package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Combination_11050_04 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		br.close();
		
		int[][]dp=new int[N+1][K+1];
		
		for(int i=0;i<=N;i++) {
			dp[i][0]=1;
			for(int j=0;j<=K;j++) {
				if(i==j) dp[i][j]=1;
			}
		}
		
		for(int i=2;i<=N;i++) {
			for(int j=1;j<=K;j++) {
				dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
			}
		}
		
		System.out.println(dp[N][K]);
		
	}

}
