package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class ShortestPath_1504 {
	
	static final int INF=200_000;
	
	static ArrayList<ArrayList<N>> graph;
	static int [] dist;
	static int V;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		V=Integer.parseInt(st.nextToken());
		int E=Integer.parseInt(st.nextToken());
		
		graph=new ArrayList<>();
		dist=new int[V+1];
		
		for(int i=0;i<=V;i++) {
			graph.add(new ArrayList<>());
		}
		
		for(int i=0;i<E;i++) {
			st=new StringTokenizer(br.readLine());
			int u=Integer.parseInt(st.nextToken());
			int v=Integer.parseInt(st.nextToken());
			int w=Integer.parseInt(st.nextToken());
			graph.get(v).add(new N(u,w));
			graph.get(u).add(new N(v,w));
		}
		
		st=new StringTokenizer(br.readLine());
		int path1=Integer.parseInt(st.nextToken());
		int path2=Integer.parseInt(st.nextToken());
		
		int answer1=0;
		answer1+=dijstrak(1,path1);
		answer1+=dijstrak(path1,path2);
		answer1+=dijstrak(path2,V);
		
		int answer2=0;
		answer2+=dijstrak(1,path2);
		answer2+=dijstrak(path2,path1);
		answer2+=dijstrak(path1,V);
		
		if(answer1>=INF||answer2>=INF) {
			System.out.println(-1);
		}else {
			System.out.println(Math.min(answer1, answer2));
		}

	}
	
	static int dijstrak(int startV, int endV) {
		
		PriorityQueue<N> queue=new PriorityQueue<>();
		boolean [] visited=new boolean[V+1];
		Arrays.fill(dist, INF);
		
		queue.offer(new N(startV,0));
		dist[startV]=0;
		
		while(!queue.isEmpty()) {
			N element=queue.poll();
			
			if(visited[element.vertex]) continue;
			visited[element.vertex]=true;
			
			for(N n:graph.get(element.vertex)) {
				if(dist[n.vertex]>dist[element.vertex]+n.weight) {
					dist[n.vertex]=dist[element.vertex]+n.weight;
					queue.offer(new N(n.vertex,dist[n.vertex]));
				}
			}
			
		}
		
		return dist[endV];
	}

}