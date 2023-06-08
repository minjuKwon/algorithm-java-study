package step21to30;
//https://velog.io/@taurus429/JAVA-%EB%B0%B1%EC%A4%80-11049-%ED%96%89%EB%A0%AC%EA%B3%B1%EC%85%88%EC%88%9C%EC%84%9C
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_Dp2_02_11049 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int [][] matrix=new int[N][2];
		int [][] dp=new int[N][N];
		
		for(int i=0;i<N;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			matrix[i][0]=Integer.parseInt(st.nextToken());
			matrix[i][1]=Integer.parseInt(st.nextToken());
		}
		
		br.close();

		for(int i=1;i<N;i++) {
			for(int j=0;i+j<N;j++) {
				dp[j][i+j]=Integer.MAX_VALUE;
				for(int k=j;k<i+j;k++) {
					dp[j][i+j]=Math.min(dp[j][i+j], dp[j][k]+dp[k+1][i+j]+matrix[j][0]*matrix[k][1]*matrix[i+j][1]);
				}
			}
		}
		
		System.out.println(dp[0][N-1]);
		
	}

}
