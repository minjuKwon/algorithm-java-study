package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_19_09_1463 {
	
	static Integer [] dp;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		br.close();
		
		dp=new Integer[N+1];
		dp[0]=dp[1]=0;
		
		System.out.println(getCount(N));

	}
	
	static int getCount(int n) {
		
		if(dp[n]==null) {
			if(n%6==0) {
				dp[n]=Math.min(getCount(n-1),Math.min(getCount(n/3), getCount(n/2)))+1;
			}else if(n%3==0) {
				dp[n]=Math.min(getCount(n/3), getCount(n-1))+1;
			}else if(n%2==0) {
				dp[n]=Math.min(getCount(n/2), getCount(n-1))+1;
			}else {
				dp[n]= getCount(n-1)+1;
			}			
		}
		
		return dp[n];
		
	}

}
