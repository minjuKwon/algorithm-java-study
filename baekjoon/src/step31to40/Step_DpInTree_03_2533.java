package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Step_DpInTree_03_2533 {
	
	static ArrayList<ArrayList<Integer>> list=new ArrayList<>();
	static int [][] dp;
	static boolean [] visited;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		list=new ArrayList<>();
		dp=new int[N+1][2];
		visited=new boolean[N+1];
		
		for(int i=0;i<=N;i++) {
			list.add(new ArrayList<>());
		}
		
		StringTokenizer st;
		for(int i=1;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			int U=Integer.parseInt(st.nextToken());
			int V=Integer.parseInt(st.nextToken());
			
			list.get(U).add(V);
			list.get(V).add(U);
		}
		
		br.close();
		
		dfs(1);

		System.out.println(Math.min(dp[1][0], dp[1][1]));
		
	}
	
	static void dfs(int vertex) {
		
		visited[vertex]=true;
		
		dp[vertex][0]=0;
		dp[vertex][1]=1;
		
		for(int v : list.get(vertex)) {
			if(!visited[v]) {
				dfs(v);
				dp[vertex][0]+=dp[v][1];
				dp[vertex][1]+=Math.min(dp[v][0], dp[v][1]);
			}
		}
		
	}

}
