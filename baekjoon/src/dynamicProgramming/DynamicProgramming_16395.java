package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DynamicProgramming_16395 {
	
	static int [][] dp;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		
		dp=new int[31][31];
		
		br.close();
		
		int result=pascal(n,k);
		
		System.out.println(result);

	}
	
	static int pascal(int n, int k) {
		if(n==k||k==1) {return 1;}
		if(dp[n][k]==0) {
			dp[n][k]=pascal(n-1,k-1)+pascal(n-1,k);
		}
		return dp[n][k];
	}

}
