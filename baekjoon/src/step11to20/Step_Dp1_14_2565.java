package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/138
public class Step_Dp1_14_2565 {
	
	static Integer [] dp;
	static int [][] pole;
	static int poleLength;

	public static void main(String[] args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		poleLength=N;
		
		dp=new Integer[N];
		pole=new int[N][2];
		
		StringTokenizer st;
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			pole[i][0]=Integer.parseInt(st.nextToken());
			pole[i][1]=Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		Arrays.sort(pole, new Comparator<int[]>() {
			public int compare(int[] o1, int [] o2) {
				return o1[0]-o2[0];
			}
		});
		
		for(int i=0;i<N;i++) {
			getWireNum(i);
		}
		
		int max=-1;
		for(int i=0;i<N;i++) {
			max=Math.max(dp[i], max);
		}

		System.out.println(N-max);

	}
	
	static public int getWireNum(int n) {
		if(dp[n]==null) {
			dp[n]=1;
			for(int i=n+1;i<poleLength;i++) {
				if(pole[n][1]<pole[i][1]) {
					dp[n]=Math.max(dp[n], getWireNum(i)+1);
				}
			}
		}
		return dp[n];
	}

}
