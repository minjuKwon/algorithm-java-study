package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backtracking_10974 {
	
	static int N;
	static int [] dp;
	static boolean [] visited;
	static StringBuilder sb=new StringBuilder();

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		br.close();
		
		dp=new int[N];
		visited=new boolean[N];

		dfs(0);
		
		System.out.println(sb);
		
	}
	
	static void dfs(int depth) {
		
		if(depth==N) {
			for(int num:dp) {
				sb.append(num).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for(int i=0;i<N;i++) {
			if(!visited[i]) {
				visited[i]=true;
				dp[depth]=i+1;
				dfs(depth+1);
				visited[i]=false;
			}
		}
		
	}

}
