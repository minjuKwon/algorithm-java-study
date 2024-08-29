package review3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dp2_11049 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int [][] matrix=new int[N][2];
		int [][]dp=new int[N][N];
		
		StringTokenizer st;
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			matrix[i][0]=Integer.parseInt(st.nextToken());
			matrix[i][1]=Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		for(int j=1;j<N;j++) {
			for(int i=0;i+j<N;i++) {
				dp[i][i+j]=Integer.MAX_VALUE;
				for(int k=i;k<i+j;k++) {
					dp[i][i+j]=Math.min(dp[i][i+j], dp[i][k]+dp[k+1][i+j]
							+matrix[i][0]*matrix[k][1]*matrix[i+j][1]);
				}
			}
		}
		
		System.out.println(dp[0][N-1]);

	}

}
