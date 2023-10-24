package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Step_Dp3_03_2098 {
	
	static final int INF=16000000;
	static int [][] W, dp;
	static int N;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		
		W=new int[N][N];
		dp=new int[N][(1<<N)-1];
	
		StringTokenizer st;
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				W[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		br.close();
		
		for(int [] arr: dp) {
			Arrays.fill(arr, -1);
		}
		
		System.out.println(dfs(0, 1));

	}
	
private static int dfs(int currentCity, int visitedCitys) {
		
		if(visitedCitys==(1<<N) -1) {
			if(W[currentCity][0]==0) {
				return INF;
			}
			return W[currentCity][0];
		}
		
		if(dp[currentCity][visitedCitys]!=-1) {
			return dp[currentCity][visitedCitys];
		}
		
		dp[currentCity][visitedCitys]=INF;
		
		for(int i=0;i<N;i++) {
			if( (visitedCitys & (1<<i))==0 && (W[currentCity][i]!=0)) {
				dp[currentCity][visitedCitys]=Math.min(dp[currentCity][visitedCitys] , dfs(i, visitedCitys|(1<<i)) +W[currentCity][i] );
			}
		}
		
		return dp[currentCity][visitedCitys];
		
	}

}
