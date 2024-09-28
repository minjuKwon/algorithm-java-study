package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class ShortestPath_13549 {
	
	static final int RANGE=100_001;
	
	static int [] dist;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		br.close();
		
		dist=new int[RANGE];
		
		dijstrak(N);
		
		System.out.println(dist[K]);
		
	}
	
	static void dijstrak(int startV) {
		PriorityQueue<N> queue=new PriorityQueue<>();
		boolean [] visited=new boolean[RANGE];
	
		queue.offer(new N(startV,0));
		visited[startV]=true;
		dist[startV]=0;
		
		while(!queue.isEmpty()) {
			N n=queue.poll();
			int v=n.vertex;
			int w=n.weight;

			if(v-1>=0&&v-1<RANGE) {
				if(!visited[v-1]||dist[v-1]>w+1) {
					dist[v-1]=w+1;
					visited[v-1]=true;
					queue.offer(new N(v-1,w+1));
				}
			}
			
			if(v+1>=0&&v+1<RANGE) {
				if(!visited[v+1]||dist[v+1]>w+1) {
					dist[v+1]=w+1;
					visited[v+1]=true;
					queue.offer(new N(v+1,w+1));
				}
			}
			
			if(v*2>=0&&v*2<RANGE) {
				if(!visited[v*2]||dist[v*2]>w) {
					dist[v*2]=w;
					queue.offer(new N(v*2,w));
				}
			}
		}
		
	}

}
