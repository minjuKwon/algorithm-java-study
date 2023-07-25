package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Step_Backtracking_08_11779 {
	
	static final int INF=100000000;
	static ArrayList<ArrayList<Node2>> list=new ArrayList<>();
	static int [] dist, arr;
	static int n;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		n=Integer.parseInt(br.readLine());
		int m=Integer.parseInt(br.readLine());
		
		dist=new int[n+1];
		arr=new int[n+1];
		
		for(int i=0;i<=n;i++) {
			list.add(new ArrayList<>());
			dist[i]=INF;
		}
		
		StringTokenizer st;
		for(int i=0;i<m;i++) {
			st=new StringTokenizer(br.readLine());
			int u=Integer.parseInt(st.nextToken());
			int v=Integer.parseInt(st.nextToken());
			int w=Integer.parseInt(st.nextToken());
			
			list.get(u).add(new Node2(v,w));
		}
		
		st=new StringTokenizer(br.readLine());
		int startV=Integer.parseInt(st.nextToken());
		int endV=Integer.parseInt(st.nextToken());
		
		br.close();
		
		dijkstra(startV);
		
		StringBuilder sb=new StringBuilder();
		
		sb.append(dist[endV]).append('\n');
		
		Stack<Integer> stack=new Stack<>();
		
		stack.push(endV);
		
		int idx=endV;
		while(arr[idx]!=0) {
			stack.push(arr[idx]);
			idx=arr[idx];
		}
		
		sb.append(stack.size()).append('\n');
		
		while(!stack.isEmpty()) {
			sb.append(stack.pop()).append(' ');
		}
		
		System.out.println(sb);
		
	}
	
	static void dijkstra(int startV) {
		
		PriorityQueue<Node2>queue=new PriorityQueue<>();
		boolean [] visited=new boolean[n+1];
		
		queue.offer(new Node2(startV,0));
		dist[startV]=0;
		
		while(!queue.isEmpty()) {
			Node2 node2=queue.poll();
			int endV=node2.vertex;
			
			if(visited[endV]) {continue;}
			visited[endV]=true;
			
			for(Node2 n :list.get(endV)) {
				if(dist[n.vertex]>dist[endV]+n.weight) {
					dist[n.vertex]=dist[endV]+n.weight;
					queue.offer(new Node2(n.vertex,dist[n.vertex]));
					arr[n.vertex]=endV;
				}
			}
			
		}
		
	}

}

