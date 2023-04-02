package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_Dp1_11_2156_02 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int [] wine=new int[N+1];
		int [] dp=new int[N+1];
		
		for(int i=1;i<=N;i++) {
			wine[i]=Integer.parseInt(br.readLine());
		}
		
		br.close();
		
		dp[1]=wine[1];
		
		if(N>1) {
			dp[2]=wine[1]+wine[2];
		}
		
		for(int i=3;i<=N;i++) {
			dp[i]=Math.max(Math.max(dp[i-2], dp[i-3]+wine[i-1])+wine[i], dp[i-1]);
		}
		
		System.out.println(dp[N]);

	}

}
