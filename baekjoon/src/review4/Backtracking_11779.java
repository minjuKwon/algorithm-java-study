package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Backtracking_11779 {
	
	static final int INF=Integer.MAX_VALUE;
	static ArrayList<ArrayList<N>> list=new ArrayList<>();
	static int [] dist, arrIdx;
	static int n;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		int m=Integer.parseInt(br.readLine());
		
		dist=new int[n+1];
		arrIdx=new int[n+1];
		
		for(int i=0;i<=n;i++) {
			list.add(new ArrayList<>());
			dist[i]=INF;
		}
		
		for(int i=0;i<m;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int u=Integer.parseInt(st.nextToken());
			int v=Integer.parseInt(st.nextToken());
			int w=Integer.parseInt(st.nextToken());
			list.get(u).add(new N(v,w));
		}
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int startV=Integer.parseInt(st.nextToken());
		int endV=Integer.parseInt(st.nextToken());
		
		br.close();
		
		dijstrak(startV);
		
		StringBuilder sb=new StringBuilder();
		
		sb.append(dist[endV]).append('\n');
		
		Stack<Integer> stack=new Stack<>();
		stack.push(endV);
		
		while(arrIdx[endV]!=0) {
			stack.push(arrIdx[endV]);
			endV=arrIdx[endV];
		}
		
		sb.append(stack.size()).append('\n');
		
		while(!stack.isEmpty()) {
			sb.append(stack.pop()).append(' ');
		}
		
		System.out.println(sb);

	}
	
	static void dijstrak(int startV) {
		
		PriorityQueue<N> queue=new PriorityQueue<>();
		boolean [] visited=new boolean[n+1];
		
		queue.offer(new N(startV,0));
		dist[startV]=0;
		
		while(!queue.isEmpty()) {
			N n=queue.poll();
			int endV=n.vertex;
			
			if(visited[endV]) continue;
			visited[endV]=true;
			
			for(N node:list.get(endV)) {
				if(dist[node.vertex]>dist[endV]+node.weight) {
					dist[node.vertex]=dist[endV]+node.weight;
					queue.offer(new N(node.vertex,dist[node.vertex]));
					arrIdx[node.vertex]=endV;
				}
			}
		}
		
	}

}
