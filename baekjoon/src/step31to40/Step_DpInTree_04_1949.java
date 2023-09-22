package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Step_DpInTree_04_1949 {
	
	static ArrayList<ArrayList<Integer>> list=new ArrayList<>();
	static int [][] dp;
	static int [] weight;
	static boolean [] visited;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		dp=new int[N+1][2];
		weight=new int[N+1];
		visited=new boolean[N+1];
		
		for(int i=0;i<=N;i++) {
			list.add(new ArrayList<>());
		}
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++) {
			weight[i]=Integer.parseInt(st.nextToken());
		}
		
		int U,V;
		for(int i=1;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			U=Integer.parseInt(st.nextToken());
			V=Integer.parseInt(st.nextToken());
			
			list.get(U).add(V);
			list.get(V).add(U);
		}
		
		br.close();
		
		dfs(1);
		
		System.out.println(Math.max(dp[1][0], dp[1][1]));

	}
	
	static void dfs(int vertex) {
		
		visited[vertex]=true;
		
		dp[vertex][0]=0;
		dp[vertex][1]=weight[vertex];
		
		for(int v : list.get(vertex)) {
			if(!visited[v]) {
				dfs(v);
				dp[vertex][0]+=Math.max(dp[v][0], dp[v][1]);
				dp[vertex][1]+=dp[v][0];
			}
		}
		
	}

}
