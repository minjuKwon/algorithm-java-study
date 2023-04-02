package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://st-lab.tistory.com/135
public class Step_Dp1_11_2156 {
	
	static int [] wine;
	static Integer [] dp;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		wine=new int[N+1];
		dp=new Integer[N+1];
		
		for(int i=1;i<=N;i++) {
			wine[i]=Integer.parseInt(br.readLine());
		}
		
		br.close();
		
		dp[0]=wine[0];
		dp[1]=wine[1];
		
		if(N>1) {
			dp[2]=wine[2]+wine[1];
		}
		
		int result=getWine(N);
		
		System.out.println(result);

	}
	
	static int getWine(int n) {
		if(dp[n]==null) {
			dp[n]=Math.max(Math.max(getWine(n-2), getWine(n-3)+wine[n-1])+wine[n],getWine(n-1));
		}
		return dp[n];
	}

}
