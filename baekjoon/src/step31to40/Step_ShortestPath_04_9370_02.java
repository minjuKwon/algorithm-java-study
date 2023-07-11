package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
//https://dragon-h.tistory.com/22
public class Step_ShortestPath_04_9370_02 {

	static ArrayList<ArrayList<Node2>> list;
	static int [] dist;
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
				
				if((a==g&&b==h)||a==h&&b==g) {
					list.get(a).add(new Node2(b, d*2-1));
					list.get(b).add(new Node2(a, d*2-1));		
				}else {
					list.get(a).add(new Node2(b,d*2));
					list.get(b).add(new Node2(a,d*2));					
				}
				
			}
			
			ArrayList<Integer> answer=new ArrayList<>();
			
			for(int i=0;i<t;i++) {
				answer.add(Integer.parseInt(br.readLine()));
			}
			
			dijkstra(s);
			
			Collections.sort(answer);
			
			for(int val:answer) {
				if(dist[val]%2==1) {
					sb.append(val).append(' ');
				}
			}
		
			sb.append('\n');		
			
		}
		
		br.close();
		
		System.out.println(sb);
		
	}
	
	private static void dijkstra(int startV) {
		
		PriorityQueue<Node2> queue=new PriorityQueue<>();
		
		dist=new int[n+1];
		boolean [] visited=new boolean[n+1];
		
		Arrays.fill(dist, 50000000);
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

	}

}
