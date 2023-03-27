package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://st-lab.tistory.com/132
public class Step_19_08_2579 {
	
	static int [] score;
	static Integer [] dp;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		score=new int[N+1];
		dp=new Integer[N+1];
		
		for(int i=1;i<=N;i++) {
			score[i]=Integer.parseInt(br.readLine());
		}
		
		br.close();
		
		dp[0]=score[0];
		dp[1]=score[1];
		
		if(N>1) {
			dp[2]=score[1]+score[2];
		}
		
		int result=getMax(N);
		
		System.out.println(result);

	}
	
	static int getMax(int n) {
		if(dp[n]==null) {
			dp[n]=Math.max(getMax(n-2), getMax(n-3)+score[n-1])+score[n];
		}
		return dp[n];
	}

}
