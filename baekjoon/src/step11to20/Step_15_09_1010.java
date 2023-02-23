package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_15_09_1010 {
	
	static int [][]dp=new int[31][31];

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		
		StringBuilder sb=new StringBuilder();
		while(T-->0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int N=Integer.parseInt(st.nextToken());
			int M=Integer.parseInt(st.nextToken());
			sb.append(BC(M,N)).append('\n');
		}
		
		System.out.println(sb);

	}
	
	static int BC(int n, int k) {
		if(dp[n][k]>0)
			return dp[n][k];
		if(n==k||k==0)
			return 1;
		return dp[n][k]=BC(n-1,k-1)+BC(n-1,k);
	}

}
