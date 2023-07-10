package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
//https://gre-eny.tistory.com/76
public class Step_ShortestPath_04_9370 {
	
	static ArrayList<ArrayList<Node2>> list;
	static int n;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int T=Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb=new StringBuilder();
		
		while(T-->0) {
			st=new StringTokenizer(br.readLine());
		    n=Integer.parseInt(st.nextToken());
			int m=Integer.parseInt(st.nextToken());
			int t=Integer.parseInt(st.nextToken());
			
			list=new ArrayList<>();
			
			for(int i=0;i<=n;i++) {
				list.add(new ArrayList<>());
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
				
				list.get(a).add(new Node2(b,d));
				list.get(b).add(new Node2(a,d));
			}
			
			PriorityQueue<Integer> answer=new PriorityQueue<>();
			
			for(int i=0;i<t;i++) {
				int x=Integer.parseInt(br.readLine());
				int path1=dijkstra(s,g)+dijkstra(g,h)+dijkstra(h,x);
				int path2=dijkstra(s,h)+dijkstra(h,g)+dijkstra(g,x);
				int path3=dijkstra(s,x);
				if(Math.min(path1, path2)==path3) {
					answer.offer(x);
				}
			}
			
			while(!answer.isEmpty()) {
				sb.append(answer.poll()).append(' ');
			}
			
			sb.append('\n');
			
		}
		
		br.close();
		
		System.out.println(sb);

	}
	
	static private int dijkstra(int startV, int endV) {
		
		PriorityQueue<Node2> queue=new PriorityQueue<>();
		
		int [] dist=new int[n+1];
		boolean [] visited=new boolean[n+1];
		
		Arrays.fill(dist, Integer.MAX_VALUE);
		queue.offer(new Node2(startV,0));
		dist[startV]=0;
		
		while(!queue.isEmpty()) {
			
			Node2 node=queue.poll();
			int v=node.vertex;
			
			if(visited[v]) {continue;}
			visited[v]=true;
			
			for(Node2 n:list.get(v)) {
				if(dist[n.vertex]>dist[v]+n.weight) {
					dist[n.vertex]=dist[v]+n.weight;
					queue.offer(new Node2(n.vertex,dist[n.vertex]));
				}
			}
			
		}
		
		return dist[endV];
		
	}

}
