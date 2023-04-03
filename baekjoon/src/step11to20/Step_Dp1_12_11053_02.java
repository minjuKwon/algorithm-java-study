package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_Dp1_12_11053_02 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int [] sequence=new int[N];
		int [] dp=new int [N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			sequence[i]=Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		for(int i=0;i<N;i++) {
			dp[i]=1;
			for(int j=0;j<i;j++) {
				if(sequence[i]>sequence[j]&&dp[i]<dp[j]+1) {
					dp[i]=dp[j]+1;
				}
			}
		}
		
		int max=-1;
		for(int i=0;i<N;i++) {
			max=Math.max(max, dp[i]);
		}
		
		System.out.println(max);

	}
	
}
