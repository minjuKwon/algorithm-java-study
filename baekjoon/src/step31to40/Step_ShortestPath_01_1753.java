package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Step_ShortestPath_01_1753 {
	
	static final int INF=Integer.MAX_VALUE;
	static ArrayList<ArrayList<Node2>>list=new ArrayList<>();
	static int [] dist;
	static int V;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		V=Integer.parseInt(st.nextToken());
		int E=Integer.parseInt(st.nextToken());
		
		int K=Integer.parseInt(br.readLine());
		
		dist=new int[V+1];
		
		for(int i=0;i<=V;i++) {
			list.add(new ArrayList<>());
			dist[i]=INF;
		}
		
		for(int i=0;i<E;i++) {
			st=new StringTokenizer(br.readLine());
			int u=Integer.parseInt(st.nextToken());
			int v=Integer.parseInt(st.nextToken());
			int w=Integer.parseInt(st.nextToken());
			
			list.get(u).add(new Node2(v,w));
		}
		
		br.close();
		
		dijkstra(K);
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=1;i<=V;i++) {
			if(dist[i]==INF) {
				sb.append("INF").append('\n');
			}else {
				sb.append(dist[i]).append('\n');
			}
		}
		
		System.out.println(sb);
		
	}
	
	static private void dijkstra(int startV) {
		
		PriorityQueue<Node2> queue=new PriorityQueue<>();
		boolean[] visited=new boolean[V+1];
		
		queue.offer(new Node2(startV,0));
		dist[startV]=0;
		
		while(!queue.isEmpty()) {
			
			Node2 node=queue.poll();
			int endV=node.vertex;
			
			if(visited[endV]) {continue;}
			visited[endV]=true;
			
			for(Node2 n:list.get(endV)) {
				if(dist[n.vertex]>dist[endV]+n.weight) {
					dist[n.vertex]=dist[endV]+n.weight;
					queue.offer(new Node2(n.vertex,dist[n.vertex]));
				}
			}
			
		}
		
	}

}

class Node2 implements Comparable<Node2>{
	int vertex;
	int weight;
	public Node2(int vertex, int weight) {
		this.vertex=vertex;
		this.weight=weight;
	}
	public int compareTo(Node2 n) {
		return weight-n.weight;
	}
}


