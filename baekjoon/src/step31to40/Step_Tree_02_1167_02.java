package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Step_Tree_02_1167_02 {

	static ArrayList<ArrayList<Node2>> list=new ArrayList<>();
	static boolean [] visited;
	static int N, max, vertex;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		N=Integer.parseInt(br.readLine());
		
		for(int i=0;i<=N;i++) {
			list.add(new ArrayList<>());
		}
		
		StringTokenizer st;
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			
			int V=Integer.parseInt(st.nextToken());
			
			while(true) {
				int U=Integer.parseInt(st.nextToken());
				if(U==-1) {break;}
				int W=Integer.parseInt(st.nextToken());
				
				list.get(V).add(new Node2(U,W));
			}
			
		}
		
		br.close();
		
		visited=new boolean[N+1];
		dfs(1,0);
		
		visited=new boolean[N+1];
		dfs(vertex,0);
		
		System.out.println(max);
		
	}
	
	static void dfs(int v, int dist) {
		
		if(dist>max) {
			max=dist;
			vertex=v;
		}
		
		visited[v]=true;
		
		for(int i=0;i<list.get(v).size();i++) {
			Node2 node=list.get(v).get(i);
			if(!visited[node.vertex]) {
				dfs(node.vertex,node.weight+dist);
				visited[node.vertex]=true;
			}
		}
		
	}

}
