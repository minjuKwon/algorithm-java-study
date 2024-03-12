package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dp1_1463 {
	
	static Integer [] dp;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		br.close();
		
		dp=new Integer[N+1];
		dp[0]=dp[1]=0;
		
		int result=operation(N);
		
		System.out.println(result);
		
	}
	
	static int operation(int num) {
		if(dp[num]==null) {
			if(num%6==0) {
				dp[num]=Math.min(operation(num-1), Math.min(operation(num/3), operation(num/2)))+1;
			}else if(num%3==0) {
				dp[num]=Math.min(operation(num/3), operation(num-1))+1;
			}else if(num%2==0) {
				dp[num]=Math.min(operation(num/2), operation(num-1))+1;
			}else {
				dp[num]=operation(num-1)+1;
			}
		}
		return dp[num];
	}
	
}
