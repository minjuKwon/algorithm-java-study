package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Step_ShortestPath_03_13549 {

	static final  int RAGNE=100001;
	
	static int [] dist;
	static int N,K;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		K=Integer.parseInt(st.nextToken());
		
		br.close();
		
		dist=new int[RAGNE];
		
		dijkstra(N);
		
		System.out.println(dist[K]);

	}
	
	static void dijkstra(int start) {
		
		PriorityQueue<Node2> queue=new PriorityQueue<>();
		boolean [] visited=new boolean[RAGNE];
		
		dist[start]=0;
		visited[start]=true;
		queue.offer(new Node2(start,0));
		
		while(!queue.isEmpty()) {
			
			Node2 node=queue.poll();
			int v=node.vertex;
			int w=node.weight;
			
			if(v+1>=0&&v+1<RAGNE) {
				if(!visited[v+1]||dist[v+1]>w+1) {
					dist[v+1]=w+1;
					visited[v+1]=true;	
					queue.offer(new Node2(v+1,w+1));
				}
			}
			
			if(v-1>=0&&v-1<RAGNE) {
				if(!visited[v-1]||dist[v-1]>w+1) {
					dist[v-1]=w+1;
					visited[v-1]=true;
					queue.offer(new Node2(v-1,w+1));
				}
			}
			
			if(v*2>=0&&v*2<RAGNE) {
				if(!visited[v*2]||dist[v*2]>w) {
					dist[v*2]=w;
					visited[v*2]=true;
					queue.offer(new Node2(v*2,w));
				}
			}
	
		}
		
	}

}
