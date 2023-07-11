package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Step_ShortestPath_05_11657 {
	
	static final int INF=5000000;
	static ArrayList<ArrayList<Bus>> list=new ArrayList<>();
	static long [] dist;
	static int N,M;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		dist=new long[N+1];
		
		for(int i=0;i<=N;i++) {
			list.add(new ArrayList<>());
			dist[i]=INF;
		}
		
		for(int i=0;i<M;i++) {
			st=new StringTokenizer(br.readLine());
			int A=Integer.parseInt(st.nextToken());
			int B=Integer.parseInt(st.nextToken());
			int C=Integer.parseInt(st.nextToken());
			
			list.get(A).add(new Bus(B,C));
		}
		
		br.close();
		
		StringBuilder sb=new StringBuilder();
		
		if(bellmanFord()) {
			for(int i=2;i<=N;i++) {
				sb.append(dist[i]==INF ? -1 : dist[i]).append('\n');
			}
		}else {
			sb.append(-1).append('\n');
		}
		
		System.out.println(sb);
		
	}

	private static boolean bellmanFord() {
		
		dist[1]=0;
		
		for(int i=1;i<N;i++) {
			for(int j=1;j<=N;j++) {
				for(Bus bus:list.get(j)) {
					if(dist[j]!=INF&&dist[bus.endV]>dist[j]+bus.weight) {
						dist[bus.endV]=dist[j]+bus.weight;
					}					
				}
			}
		}
		
		for(int i=1;i<N;i++) {
			for(int j=1;j<=N;j++) {
				for(Bus bus:list.get(j)) {
					if(dist[j]!=INF&&dist[bus.endV]>dist[j]+bus.weight) {return false;}					
				}
			}
		}
		
		return true;
		
	}
	
}

class Bus {
	int endV, weight;
	public Bus(int endV, int weight) {
		this.endV=endV;
		this.weight=weight;
	}
}
