package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DynamicProgramming_14916 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int n=Integer.parseInt(br.readLine());
		
		br.close();
		
		int [] dp=new int[100001];
		
		dp[1]=-1;
		dp[2]=1;			
		dp[3]=-1;		
		dp[4]=1;
	
		for(int i=4;i<=n;i++) {
			if(i%5==0) {
				dp[i]=i/5;
			}else if(i%5==1) {
				dp[i]=dp[i-1]+2;
			}else if(i%5==2) {
				dp[i]=dp[i-2]+1;
			}else if(i%5==3) {
				dp[i]=dp[i-3]+3;
			}else if(i%5==4) {
				dp[i]=dp[i-4]+2;
			}
		}
		
		System.out.println(dp[n]);
		
	}

}
