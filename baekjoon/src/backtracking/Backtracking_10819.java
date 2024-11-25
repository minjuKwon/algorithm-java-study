package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backtracking_10819 {
	
	static int [] arr;
	static boolean [] visited;
	static int N, max;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		
		arr=new int[N];
		visited=new boolean[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) arr[i]=Integer.parseInt(st.nextToken());
		
		br.close();

		for(int i=0;i<N;i++) {
			visited[i]=true;
			dp(1,i,0);
			visited[i]=false;
		}
		
		System.out.println(max);
		
	}
	
	static void dp(int depth, int idx, int sum) {
		
		if(depth==N) {
			max=Math.max(max, sum);
			return;
		}
		
		for(int i=0;i<N;i++) {
			if(!visited[i]) {
				visited[i]=true;
				dp(depth+1, i, sum+Math.abs(arr[i]-arr[idx]));
				visited[i]=false;
			}
		}
		
	}

}
