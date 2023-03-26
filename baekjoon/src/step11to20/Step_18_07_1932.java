package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/131
public class Step_18_07_1932 {
	
	static int [][] triangle;
	static Integer [][] dp;
	static int n;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		
		triangle=new int[n][n];
		dp=new Integer[n][n];
		
		StringTokenizer st;
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<i+1;j++) {
				triangle[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		br.close();
		
		for(int i=0;i<n;i++) {
			dp[n-1][i]=triangle[n-1][i];
		}
		
		int answer=getMax(0, 0);
		
		System.out.println(answer);
		
	}
	
	static int getMax(int depth, int m) {
		if(depth==n-1) {
			return dp[depth][m];
		} 
		if(dp[depth][m]==null) {
			dp[depth][m]=Math.max(getMax(depth+1,m), getMax(depth+1,m+1))+triangle[depth][m];
		}
		return dp[depth][m];
	}

}
