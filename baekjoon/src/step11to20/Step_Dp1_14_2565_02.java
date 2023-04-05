package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/138
public class Step_Dp1_14_2565_02 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int [] dp=new int[N];
		int [][] pole=new int[N][2];
		
		StringTokenizer st;
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			pole[i][0]=Integer.parseInt(st.nextToken());
			pole[i][1]=Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		Arrays.sort(pole, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0]-o2[0];
			}
		});
		
		for(int i=0;i<N;i++) {
			dp[i]=1;
			for(int j=0;j<i;j++) {
				if(pole[i][1]>pole[j][1]) {
					dp[i]=Math.max(dp[i], dp[j]+1);
				}
			}
		}
		
		int max=-1;
		for(int i=0;i<N;i++) {
			max=Math.max(max, dp[i]);
		}
		
		System.out.println(N-max);

	}

}
