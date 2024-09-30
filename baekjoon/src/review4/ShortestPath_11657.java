package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ShortestPath_11657 {
	
	static final int INF=60_000_000;
	
	static ArrayList<ArrayList<Bus>> graph=new ArrayList<>();
	static long [] dist;
	static int N;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());

		dist=new long[N+1];
		for(int i=0;i<=N;i++) {
			graph.add(new ArrayList<>());
			dist[i]=INF;
		}
		
		for(int i=0;i<M;i++) {
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int d=Integer.parseInt(st.nextToken());
			graph.get(a).add(new Bus(b,d));
		}
		br.close();
		
		StringBuilder sb=new StringBuilder();
		if(bellmanFord()) {
			for(int i=2;i<=N;i++) {
				sb.append(dist[i]==INF?-1:dist[i]).append('\n');
			}
		}else {
			sb.append(-1).append('\n');
		}
		
		System.out.println(sb);
		
	}
	
	static boolean bellmanFord() {
		dist[1]=0;
		
		for(int i=1;i<N;i++) {
			for(int j=1;j<=N;j++) {
				for(Bus b:graph.get(j)) {
					if(dist[j]!=INF&&dist[b.vertex]>dist[j]+b.weight) {
						dist[b.vertex]=dist[j]+b.weight;
					}
				}
			}
		}
		
		for(int i=1;i<N;i++) {
			for(int j=1;j<=N;j++) {
				for(Bus b:graph.get(j)) {
					if(dist[j]!=INF&&dist[b.vertex]>dist[j]+b.weight) {
						return false;
					}
				}
			}
		}
		
		return true;
	}

}

class Bus{
	int vertex; int weight;
	public Bus(int vertex, int weight) {
		this.vertex=vertex;
		this.weight=weight;
	}
}