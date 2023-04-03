package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/137
public class Step_Dp1_12_11053 {
	
	static int[] sequence;
	static Integer [] dp;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		sequence=new int[N];
		dp=new Integer[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			sequence[i]=Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		for(int i=0;i<N;i++) {
			LIS(i);
		}
		
		int max=dp[0];
		for(int i=1;i<N;i++) {
			max=Math.max(max, dp[i]);
		}
		
		System.out.println(max);

	}
	
	static int LIS(int n) {
		
		if(dp[n]==null) {
			
			dp[n]=1;
			
			for(int i=n-1;i>=0;i--) {
				if(sequence[i]<sequence[n]) {
					dp[n]=Math.max(dp[n], LIS(i)+1);
				}
			}
			
		}
		
		return dp[n];
		
	}

}
