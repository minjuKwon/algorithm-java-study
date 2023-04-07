package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/141
public class Step_Dp1_16_12865 {

	static Integer [][] dp;
    static int [] itemW;
    static int [] itemV;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		
		itemW=new int[N];
		itemV=new int[N];
		dp=new Integer[N][K+1];
		
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			itemW[i]=Integer.parseInt(st.nextToken());
			itemV[i]=Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		int result=packMax(N-1,K);
		
		System.out.println(result);

	}
	
	static int packMax(int i, int k) {
		if(i<0) {return 0;}
		if(dp[i][k]==null) {
			if(itemW[i]>k) {
				dp[i][k]=packMax(i-1,k);
			}else {
				dp[i][k]=Math.max(packMax(i-1,k), packMax(i-1,k-itemW[i])+itemV[i]);
			}
		}
		return dp[i][k];
	}

}
