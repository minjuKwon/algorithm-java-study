package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Combination_11050_03 {
	
	static int [][]dp;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		br.close();
		
		dp=new int[N+1][K+1];

		System.out.println(getAnswer(N,K));
		
	}
	
	static int getAnswer(int n, int k) {
		if(dp[n][k]>0) return dp[n][k];
		if(n==k||k==0) return dp[n][k]=1;
		return dp[n][k]=getAnswer(n-1,k-1)+getAnswer(n-1,k);
	}

}
