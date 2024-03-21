package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Dp1_2565 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		int [][] pole=new int[N][2];
		int [] count=new int[N];
		
		StringTokenizer st;
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			pole[i][0]=Integer.parseInt(st.nextToken());
			pole[i][1]=Integer.parseInt(st.nextToken());
		}
		br.close();
		
		Arrays.sort(pole, (e1,e2)->{
			return e1[0]-e2[0];
		});
		
		for(int i=0;i<N;i++) {
			count[i]=1;
			for(int j=0;j<i;j++) {
				if(pole[i][1]>pole[j][1]) {
					count[i]=Math.max(count[i], count[j]+1);
				}
			}
		}
		
		int max=count[0];
		for(int i=1;i<N;i++) {
			max=Math.max(max, count[i]);
		}
		
		System.out.println(N-max);
		
	}

}
