package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/141
public class Step_Dp1_16_12865_02 {
	
	static int [] itemW;
	static int [] itemV;
	static int [][] dp;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		
		itemW=new int[N+1];
		itemV=new int[N+1];
		dp=new int[N+1][K+1];
		
		for(int i=1;i<=N;i++) {
			st=new StringTokenizer(br.readLine());
			itemW[i]=Integer.parseInt(st.nextToken());
			itemV[i]=Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=K;j++) {
				if(itemW[i]>j) {
					dp[i][j]=dp[i-1][j];
				}else {
					dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-itemW[i]]+itemV[i]);
				}
			}
		}
		
		System.out.println(dp[N][K]);
	
	}

}
