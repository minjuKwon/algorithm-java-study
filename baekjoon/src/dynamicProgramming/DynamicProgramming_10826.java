package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class DynamicProgramming_10826 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		
		br.close();
		
		BigInteger []dp=new BigInteger[n+1];
		
		dp[0]=BigInteger.ZERO;
		if(n>0) {
			dp[1]=BigInteger.ONE;
		}
		
		for(int i=2;i<=n;i++) {
			dp[i]=dp[i-2].add(dp[i-1]);
		}
		
		System.out.println(dp[n]);

	}

}