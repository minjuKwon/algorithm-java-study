package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class ShortestPath_9370 {
	
	static final int INF=50_000_000;
	
	static ArrayList<ArrayList<N>> graph;
	static int [] dist;

	public static void main(String[] args) throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		
		StringBuilder sb=new StringBuilder();
		while(T-->0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			int m=Integer.parseInt(st.nextToken());
			int t=Integer.parseInt(st.nextToken());
			
			graph=new ArrayList<>();
			dist=new int[n+1];
			
			for(int i=0;i<=n;i++) {
				graph.add(new ArrayList<>());
			}
			
			st=new StringTokenizer(br.readLine());
			int s=Integer.parseInt(st.nextToken());
			int g=Integer.parseInt(st.nextToken());
			int h=Integer.parseInt(st.nextToken());
			
			for(int i=0;i<m;i++) {
				st=new StringTokenizer(br.readLine());
				int a=Integer.parseInt(st.nextToken());
				int b=Integer.parseInt(st.nextToken());
				int d=Integer.parseInt(st.nextToken());
				if((a==g&&b==h)||(a==h&&b==g)) {
					graph.get(a).add(new N(b,d*2-1));
					graph.get(b).add(new N(a,d*2-1));					
				}else {
					graph.get(a).add(new N(b,d*2));
					graph.get(b).add(new N(a,d*2));
				}
			}
			
			dijkstra(s,n);
			
			ArrayList<Integer> answer=new ArrayList<>();			
			for(int i=0;i<t;i++) {
				answer.add(Integer.parseInt(br.readLine()));
			}
			Collections.sort(answer);
			
			for(int a:answer) {
				if(dist[a]%2==1) {
					sb.append(a).append(' ');
				}
			}
			
			sb.append('\n');
	
		}
		br.close();
		
		System.out.println(sb);
		
	}
	
	static void dijkstra(int startV, int n) {
		PriorityQueue<N> queue=new PriorityQueue<>();
		boolean [] visited=new boolean[n+1];
		Arrays.fill(dist, INF);
		
		queue.offer(new N(startV,0));
		dist[startV]=0;
		
		while(!queue.isEmpty()) {
			N element=queue.poll();
			int v=element.vertex;
			
			if(visited[v]) continue;
			visited[v]=true;
			
			for(N node:graph.get(v)) {
				if(dist[node.vertex]>dist[v]+node.weight) {
					dist[node.vertex]=dist[v]+node.weight;
					queue.offer(new N(node.vertex,dist[node.vertex]));
				}
			}
		}
	}

}
