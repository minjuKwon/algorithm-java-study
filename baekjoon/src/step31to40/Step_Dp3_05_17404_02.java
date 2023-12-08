package step31to40;
//https://hongjw1938.tistory.com/77
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_Dp3_05_17404_02 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int [][] colors=new int[N][3];
		int [][] dp=new int[N][3];
		
		StringTokenizer st;
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			colors[i][0]=Integer.parseInt(st.nextToken());
			colors[i][1]=Integer.parseInt(st.nextToken());
			colors[i][2]=Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		int INF=1000*1000+1;
		int result=INF;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==j) dp[0][j]=colors[0][j];
				else dp[0][j]=INF;
			}
			for(int j=1;j<N;j++) {
				dp[j][0]=Math.min(dp[j-1][1], dp[j-1][2])+colors[j][0];
				dp[j][1]=Math.min(dp[j-1][0], dp[j-1][2])+colors[j][1];
				dp[j][2]=Math.min(dp[j-1][0], dp[j-1][1])+colors[j][2];
			}
			for(int j=0;j<3;j++) {
				if(i==j)continue;
				result=Math.min(result, dp[N-1][j]);
			}
		}
		
		System.out.println(result);

	}

}
