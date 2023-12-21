package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Combination_1010 {

	static int[][]dp=new int[30][30];
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb=new StringBuilder();
		while(T-->0) {
			st=new StringTokenizer(br.readLine());
			int N=Integer.parseInt(st.nextToken());
			int M=Integer.parseInt(st.nextToken());
			sb.append(BC(M,N)).append('\n');
		}
		
		br.close();
		
		System.out.println(sb);

	}
	
	static int BC(int n, int k) {
		if(dp[n][k]>0) return dp[n][k];
		if(n==k||k==0) return dp[n][k]=1;
		return dp[n][k]=BC(n-1,k-1)+BC(n-1,k);
	}

}
