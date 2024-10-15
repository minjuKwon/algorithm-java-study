package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tree_1167 {
	
	static ArrayList<ArrayList<Node>> list=new ArrayList<>();
	static int [] dist;
	static int V;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		V=Integer.parseInt(br.readLine());
		
		for(int i=0;i<=V;i++) {
			list.add(new ArrayList<>());
		}
		
		for(int i=0;i<V;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int u=Integer.parseInt(st.nextToken());
			while(true) {
				int v=Integer.parseInt(st.nextToken());
				if(v==-1) break;
				int w=Integer.parseInt(st.nextToken());
				list.get(u).add(new Node(v,w));
			}
		}
		br.close();
		
		int longV=bfs(1);
		int result=bfs(longV);
		
		System.out.println(dist[result]);
		
	}
	
	static int bfs(int startV) {
		Queue<Node> queue=new LinkedList<>();
		boolean [] visited=new boolean[V+1];
		dist=new int[V+1];
		int max=0;
		
		queue.offer(new Node(startV,0));
		
		while(!queue.isEmpty()) {
			Node n=queue.poll();
			int v=n.x;
			
			if(visited[v]) continue;
			visited[v]=true;
			
			for(Node a:list.get(v)) {
				if(!visited[a.x]) {
					queue.offer(a);
					dist[a.x]=dist[v]+a.y;
					max=Math.max(max, dist[a.x]);
				}
			}
		}
		
		int maxId=0;
		for(int i=1;i<=V;i++) {
			if(dist[i]==max) {
				maxId=i;
				break;
			}
		}		
		
		return maxId;
	}

}
