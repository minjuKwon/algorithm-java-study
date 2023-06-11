package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_Dp2_05_2293 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		
		int [] coins=new int[n+1];
		int [] dp=new int[k+1];
		
		for(int i=1;i<=n;i++) {
			coins[i]=Integer.parseInt(br.readLine());
		}
		
		br.close();
		
		dp[0]=1;
		
		for(int i=1;i<=n;i++) {
			for(int j=coins[i];j<=k;j++) {
				dp[j]+=dp[j-coins[i]];
			}
		}
		
		System.out.println(dp[k]);
		
	}

}
