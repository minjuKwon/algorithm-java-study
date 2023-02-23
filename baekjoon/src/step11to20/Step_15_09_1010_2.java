package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_15_09_1010_2 {

	public static void main(String[] args) throws IOException{
		
		int[][] dp=new int[30][30];
		
		for(int i=0;i<30;i++) {
			dp[i][i]=1;
			dp[i][0]=1;
		}
		
		for(int i=2;i<30;i++) {
			for(int j=1;j<30;j++) {
				dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
			}
		}
		
		StringBuilder sb=new StringBuilder();
		StringTokenizer st;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		
		while(T-->0) {
			st=new StringTokenizer(br.readLine());
			int N=Integer.parseInt(st.nextToken());
			int M=Integer.parseInt(st.nextToken());
			sb.append(dp[M][N]).append('\n');
		}
		
		br.close();
		
		System.out.println(sb);

	}

}
