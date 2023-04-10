package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DynamicProgramming_14916_02 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		
		br.close();
		
		int [] dp=new int[100001];
		int none=Integer.MAX_VALUE;
		
		dp[1]=none;
		dp[2]=1;
		dp[3]=none;
		dp[4]=2;
		dp[5]=1;
		
		for(int i=6;i<=n;i++) {
			dp[i]=Math.min(dp[i-2], dp[i-5])+1;
		}
		
		if(dp[n]==none) {
			System.out.println(-1);
		}else {
			System.out.println(dp[n]);
		}

	}

}
