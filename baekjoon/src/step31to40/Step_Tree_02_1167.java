package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Step_Tree_02_1167 {

	static ArrayList<ArrayList<Node2>> list=new ArrayList<>();
	static int dist[];
	static int N,result;
	
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
		
		int longV=bfs(1);
		int result=bfs(longV);
		
		System.out.println(dist[result]);
		
	}
	
	static int bfs(int start) {
		Queue<Node2> queue=new LinkedList<>();
		boolean [] visited=new boolean[N+1];
		dist=new int[N+1];
		int max=0;
		
		queue.offer(new Node2(start,0));
		
		while(!queue.isEmpty()) {
			Node2 node=queue.poll();
			int v=node.vertex;
			
			if(visited[v]) {continue;}
			visited[v]=true;
			
			for(Node2 n:list.get(v)) {
				if(!visited[n.vertex]) {
					queue.offer(n);
					dist[n.vertex]=dist[v]+n.weight;
					max=Math.max(max, dist[n.vertex]);
				}
			}
			
		}
		
		int maxIdx=0;
		for(int i=1;i<=N;i++) {
			if(dist[i]==max) {maxIdx=i; break;}
		}
		
		return maxIdx;
		
	}

}
