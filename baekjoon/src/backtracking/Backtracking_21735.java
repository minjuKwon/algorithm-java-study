package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backtracking_21735 {
	
	static int [] arr;
	static int N,M;
	static int max=1;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		arr=new int[N+1];
		
		st=new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++) arr[i]=Integer.parseInt(st.nextToken());
		
		br.close();
		
		dp(0,0,1);
		
		System.out.println(max);

	}
	
	static void dp(int depth, int position, int sum) {
		
		if(position>=N||depth==M) {
			max=Math.max(max, sum);
			return;
		}
		
		for(int i=1;i<=2;i++) {
			if(i==1&&position+1<=N) dp(depth+1,position+1,sum+arr[position+1]);
			else if(i==2&&position+2<=N) dp(depth+1,position+2,sum/2+arr[position+2]);
		}
		
	}

}
