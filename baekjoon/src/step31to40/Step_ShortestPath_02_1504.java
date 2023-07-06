package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Step_ShortestPath_02_1504 {
	
	static final int INF=200000000;
	
	static ArrayList<ArrayList<Node2>> list=new ArrayList<>();
	static int [] dist;
	static int V,v1,v2;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		V=Integer.parseInt(st.nextToken());
		int E=Integer.parseInt(st.nextToken());
		
		dist=new int[V+1];
		
		for(int i=0;i<=V;i++) {
			list.add(new ArrayList<>());
		}
		
		for(int i=1;i<=E;i++) {
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			
			list.get(a).add(new Node2(b,c));
			list.get(b).add(new Node2(a,c));
		}
		
		st=new StringTokenizer(br.readLine());
		v1=Integer.parseInt(st.nextToken());
		v2=Integer.parseInt(st.nextToken());
		
		br.close();
		
		int answer1=0;
		answer1+=dijkstra(1,v1);
		answer1+=dijkstra(v1,v2);
		answer1+=dijkstra(v2,V);
		
		int answer2=0;
		answer2+=dijkstra(1,v2);
		answer2+=dijkstra(v2,v1);
		answer2+=dijkstra(v1,V);

		if(answer1>=INF||answer2>=INF) {
			System.out.println(-1);
		}else {
			System.out.println(Math.min(answer1, answer2));
		}
		
	}
	
	private static int dijkstra(int startV, int endV) {
		
		PriorityQueue<Node2> queue=new PriorityQueue<>();
		boolean [] visited=new boolean[V+1];
		
		Arrays.fill(dist, INF);
		queue.offer(new Node2(startV,0));
		dist[startV]=0;
		
		while(!queue.isEmpty()) {
			
			Node2 node=queue.poll();
			int tempV=node.vertex;
			
			if(visited[tempV]) {continue;}
			visited[tempV]=true;
			
			for(Node2 n:list.get(tempV)) {
				if(dist[n.vertex]>dist[tempV]+n.weight) {
					dist[n.vertex]=dist[tempV]+n.weight;
					queue.offer(new Node2(n.vertex,dist[n.vertex]));
				}
			}
		 
		}
		
		return dist[endV];
		
	}

}
