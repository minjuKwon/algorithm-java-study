package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dp1_24416 {
	
	static int []dp;
	static int recursiveCount=0;
	static int dpCount=0;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		br.close();
		
		dp=new int[N];
		
		recursiveFibonacci(N);
		dpFibonacci(N);
		
		System.out.println(recursiveCount+" "+dpCount);

	}
	
	static int recursiveFibonacci(int n) {
		if(n<3) {
			recursiveCount++;
			return n;
		}
		else return recursiveFibonacci(n-1)+recursiveFibonacci(n-2);
	}
	
	static int dpFibonacci(int n) {
		dp[0]=dp[1]=1;
		for(int i=2;i<n;i++) {
			dpCount++;
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n-1];
	}

}
