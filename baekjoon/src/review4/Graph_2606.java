package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Graph_2606 {
	
	static int [][] graph;
	static boolean [] visited;
	static int count=0;
	static int N;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		int M=Integer.parseInt(br.readLine());
		
		graph=new int[N+1][N+1];
		visited=new boolean[N+1];
		
		StringTokenizer st;
		while(M-->0) {
			st=new StringTokenizer(br.readLine());
			int u=Integer.parseInt(st.nextToken());
			int v=Integer.parseInt(st.nextToken());
			graph[u][v]=1;
			graph[v][u]=1;
		}
		br.close();
		
		System.out.println(dfs(1));

	}
	
	static int dfs(int v) {
		visited[v]=true;
		
		for(int i=1;i<=N;i++) {
			if(graph[v][i]==1&&!visited[i]) {
				count++;
				dfs(i);
			}
		}
		
		return count;
	}

}
