package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Step_Graph_06_1260 {
	
	static int [][] graph;
	static boolean [] visited;
	static int N;
	static StringBuilder sb=new StringBuilder();

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int V=Integer.parseInt(st.nextToken());
		
		graph=new int[N+1][N+1];
		visited =new boolean[N+1];
		
		for(int i=0;i<M;i++) {
			st=new StringTokenizer(br.readLine());
			int u=Integer.parseInt(st.nextToken());
			int v=Integer.parseInt(st.nextToken());
			
			graph[u][v]=1;
			graph[v][u]=1;
		}
		
		br.close();
		
		dfs(V);

		sb.append('\n');
		
		visited =new boolean[N+1];
		
		bfs(V);
		
		System.out.println(sb);

	}
	
	static void dfs(int v) {
		
		visited[v]=true;
		sb.append(v).append(' ');
		
		for(int i=1;i<=N;i++) {
			if(graph[v][i]==1&&!visited[i]) {
				dfs(i);
			}
		}
		
	}
	
	static void bfs(int v) {
		
		Queue<Integer> queue=new LinkedList<>();
		
		queue.offer(v);
		visited[v]=true;
		
		while(!queue.isEmpty()) {
			
			int num=queue.poll();
			sb.append(num).append(' ');
			
			for(int i=1;i<=N;i++) {
				if(graph[num][i]==1&&!visited[i]) {
					queue.offer(i);
					visited[i]=true;
				}
			}
			
		}
		
	}

}
