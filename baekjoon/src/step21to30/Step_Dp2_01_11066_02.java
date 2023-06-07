package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://js1jj2sk3.tistory.com/3
public class Step_Dp2_01_11066_02 {
	
	static int [][] dp=new int[501][501];
	static int [] files=new int[501];
	static int [] sum=new int[501];
	
	public static void main(String[] args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int T=Integer.parseInt(br.readLine());
		
		StringBuilder sb=new StringBuilder();
		
		while(T-->0) {
			
			int K=Integer.parseInt(br.readLine());
			
			StringTokenizer st=new StringTokenizer(br.readLine());
			
			for(int i=1;i<=K;i++) {
				files[i]=Integer.parseInt(st.nextToken());
				sum[i]=sum[i-1]+files[i];
			}
			
			for(int i=1;i<=K;i++) {
				for(int j=1;j<=K;j++) {
					dp[i][j]=-1;
				}
			}
			
			sb.append(getFilesSize(1,K)).append('\n');
			
		}
		
		br.close();
		
		System.out.println(sb);

	}
	
	static int getFilesSize(int x, int y) {
		
		if(dp[x][y]!=-1) {
			return dp[x][y];
		}
		
		if(x==y) {
			return dp[x][y]=0;
		}
		
		if(x+1==y) {
			return dp[x][y]=files[x]+files[y];
		}
		
		dp[x][y]=Integer.MAX_VALUE;
		
		for(int i=x;i<y;i++) {
			int left=getFilesSize(x,i);
			int right=getFilesSize(i+1,y);
			dp[x][y]=Math.min(dp[x][y], left+right);
		}
		
		return dp[x][y]=dp[x][y]+sum[y]-sum[x-1];
		
	}

}
