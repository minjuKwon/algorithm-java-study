package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class ShortestPath_1753 {
	
	static final int INF=Integer.MAX_VALUE;
	
	static ArrayList<ArrayList<N>> graph;
	static int [] dists;
	static int V;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		V=Integer.parseInt(st.nextToken());
		int E=Integer.parseInt(st.nextToken());
		
		dists=new int[V+1];
		graph=new ArrayList<>();
		
		for(int i=0;i<=V;i++) {
			graph.add(new ArrayList<>());
			dists[i]=INF;
		}
		
		int K=Integer.parseInt(br.readLine());
		
		for(int i=0;i<E;i++) {
			st=new StringTokenizer(br.readLine());
			int u=Integer.parseInt(st.nextToken());
			int v=Integer.parseInt(st.nextToken());
			int w=Integer.parseInt(st.nextToken());
			graph.get(u).add(new N(v,w));
		}
		br.close();
		
		dijkstra(K);
		
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<=V;i++) {
			if(dists[i]==INF) sb.append("INF").append('\n');
			else sb.append(dists[i]).append('\n');
		}
		
		System.out.println(sb);
		
	}
	
	static void dijkstra(int startV) {
		
		PriorityQueue<N> queue=new PriorityQueue<>();
		boolean [] visited=new boolean[V+1];
		
		queue.offer(new N(startV,0));
		dists[startV]=0;
		
		while(!queue.isEmpty()) {
			N element=queue.poll();
			int endV=element.vertex;
			
			if(visited[endV]) continue;
			visited[endV]=true;
			
			for(N n:graph.get(endV)) {
				if(dists[n.vertex]>dists[endV]+n.weight) {
					dists[n.vertex]=dists[endV]+n.weight;
					queue.offer(new N(n.vertex, dists[n.vertex]));
				}
			}
			
		}
	
	}

}

class N implements Comparable<N>{
	int vertex; int weight;
	public N (int vertex, int weight){
		this.vertex=vertex;
		this.weight=weight;
	}
	public int compareTo(N n) {
		return this.weight-n.weight;
	}
}