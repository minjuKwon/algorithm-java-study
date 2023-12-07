package step31to40;
//https://hongjw1938.tistory.com/77
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_Dp3_05_17404 {
	
	static int [][] colors;
	static int [][] dp;
	static final int INF=1000*1000+1;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		colors=new int[N][3];
		
		StringTokenizer st;
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			colors[i][0]=Integer.parseInt(st.nextToken());
			colors[i][1]=Integer.parseInt(st.nextToken());
			colors[i][2]=Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		int result=INF;
		
		for(int i=0;i<3;i++) {
			
			dp=new int[N][3];
			
			for(int j=0;j<3;j++) {
				getCost(N-1, i, j);
			}
			
			for(int j=0;j<3;j++) {
				if(i==j) continue;
				result=Math.min(result, dp[N-1][j]);
			}
			
		}
		
		System.out.println(result);

	}
	
	static int getCost(int n, int start, int currentColor) {
		if(n==0) {
			if(start==currentColor) dp[n][currentColor]=colors[n][currentColor];
			else dp[n][currentColor]=INF;
			return dp[n][currentColor];
		}
		if(dp[n][currentColor]>0) return dp[n][currentColor];
		dp[n][currentColor]=Math.min(getCost(n-1, start, (currentColor+1)%3), getCost(n-1, start, (currentColor+2)%3))+colors[n][currentColor];
		return dp[n][currentColor];
	}

}
