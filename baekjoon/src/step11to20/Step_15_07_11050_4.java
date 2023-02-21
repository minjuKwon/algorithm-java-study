package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://st-lab.tistory.com/159
public class Step_15_07_11050_4 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		
		int[][] dp=new int[N+1][K+1];
		
		for(int i=0;i<=K;i++) {
			dp[i][i]=1;
		}
		
		for(int i=0;i<=N;i++) {
			dp[i][0]=1;
		}
		
		for(int i=2;i<=N;i++) {
			for(int j=1;j<=K;j++) {
				dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
			}
		}
		
		System.out.println(dp[N][K]);
		
	}

}
