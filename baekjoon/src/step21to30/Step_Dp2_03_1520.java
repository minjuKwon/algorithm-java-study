package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_Dp2_03_1520 {
	
	static int [] rangeX= {-1,0,1,0};
	static int[] rangeY= {0,1,0,-1};
	static int [][] map,dp;
	static int M, N;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		M=Integer.parseInt(st.nextToken());
		N=Integer.parseInt(st.nextToken());
		
		map=new int[M+1][N+1];
		dp=new int[M+1][N+1];
		
		for(int i=1;i<=M;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=1;j<=N;j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
				dp[i][j]=-1;
			}
		}
		
		br.close();
		
		System.out.println(dfs(1,1));

	}
	
	static int dfs(int x, int y) {
		
		if(x==M&&y==N) {
			return 1;
		}
		
		if(dp[x][y]!=-1) {
			return dp[x][y];
		}
		
		dp[x][y]=0;
		
		for(int i=0;i<4;i++) {

			int dx=x+rangeX[i];
			int dy=y+rangeY[i];
			
			if(dx<1||dy<1||dx>M||dy>N) {
				continue;
			}
			
			if(map[x][y]>map[dx][dy]) {
				dp[x][y]+=dfs(dx,dy);
			}
			
		}
		
		return dp[x][y];
		
	}

}
