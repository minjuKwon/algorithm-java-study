package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DynamicProgramming_9655 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		br.close();

		boolean [] dp=new boolean[N+1];
		
		dp[1]=true;
		if(N>1) {
			dp[2]=false;
		}
		
		for(int i=3;i<=N;i++) {
			dp[i]=!dp[i-1];
		}
		
		if(dp[N]==true) {
			System.out.println("SK");
		}else {
			System.out.println("CY");
		}
		
	}

}
