package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Graph_24479 {
	
	static ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
	static int [] visited;
	static int order;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int R=Integer.parseInt(st.nextToken());
		
		visited=new int[N+1];
		
		for(int i=0;i<=N;i++) {
			graph.add(new ArrayList<>());
		}
		
		for(int i=0;i<M;i++) {
			st=new StringTokenizer(br.readLine());
			int u=Integer.parseInt(st.nextToken());
			int v=Integer.parseInt(st.nextToken());
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		
		br.close();
		
		for(int i=1;i<=N;i++) {
			Collections.sort(graph.get(i));
		}
		
		order=1;
		
		dfs(R);
		
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<=N;i++) {
			sb.append(visited[i]).append('\n');
		}
		
		System.out.println(sb);

	}
	
	static void dfs(int v) {
		visited[v]=order;
		for(int i=0;i<graph.get(v).size();i++) {
			int next=graph.get(v).get(i);
			if(visited[next]==0) {
				order++;
				dfs(next);
			}
		}
	}

}
