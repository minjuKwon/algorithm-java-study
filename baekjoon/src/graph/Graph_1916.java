package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Graph_1916 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int M=Integer.parseInt(br.readLine());
		
		ArrayList<ArrayList<Bus>> list=new ArrayList<>();
		int [] dist=new int[N+1];
		boolean [] visited=new boolean[N+1];
		
		int inf=Integer.MAX_VALUE;
		for(int i=0;i<=N;i++) {
			list.add(new ArrayList<>());
			dist[i]=inf;
		}
		
		StringTokenizer st;
		for(int i=0;i<M;i++) {
			st=new StringTokenizer(br.readLine());
			int u=Integer.parseInt(st.nextToken());
			int v=Integer.parseInt(st.nextToken());
			int w=Integer.parseInt(st.nextToken());
			
			list.get(u).add(new Bus(v,w));
		}
		
		st=new StringTokenizer(br.readLine());
		int startV=Integer.parseInt(st.nextToken());
		int endV=Integer.parseInt(st.nextToken());
		br.close();
		
		PriorityQueue<Bus> queue=new PriorityQueue<>();
		queue.offer(new Bus(startV,0));
		dist[startV]=0;
		
		while(!queue.isEmpty()) {
			Bus bus=queue.poll();
			int vertex=bus.vertex;
			
			if(visited[vertex]) continue;
			visited[vertex]=true;
			
			for(Bus element:list.get(vertex)) {
				if(!visited[element.vertex]&&dist[element.vertex]>dist[vertex]+element.weight) {
					dist[element.vertex]=dist[vertex]+element.weight;
					queue.offer(new Bus(element.vertex, dist[element.vertex]));
				}
			}
		}
		
		System.out.println(dist[endV]);
		
	}
	
	private static class Bus implements Comparable<Bus>{
		int vertex;
		int weight;
		public Bus(int vertex, int weight) {
			this.vertex=vertex;
			this.weight=weight;
		}
		public int compareTo(Bus bus) {
			return this.weight-bus.weight;
		}
	}

}
