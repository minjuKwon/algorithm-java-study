package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Graph_24445 {
	
	static ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
	static int [] visit;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int R=Integer.parseInt(st.nextToken());
		
		visit=new int[N+1];
		for(int i=0;i<=N;i++) {
			graph.add(new ArrayList<>());
		}
		
		for(int i=0;i<M;i++) {
			st=new StringTokenizer(br.readLine());
			int u=Integer.parseInt(st.nextToken());
			int v=Integer.parseInt(st.nextToken());
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		
		br.close();
		
		for(int i=1;i<=N;i++) {
			Collections.sort(graph.get(i), Collections.reverseOrder());
		}
		
		bfs(R);
		
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<=N;i++) {
			sb.append(visit[i]).append('\n');
		}
		
		System.out.println(sb);

	}
	
	static void bfs(int v) {
		int order=1;
		Queue<Integer> queue=new LinkedList<>();
		
		visit[v]=order++;
		queue.offer(v);
		
		while(!queue.isEmpty()) {
			int element=queue.poll();
			for(int i=0;i<graph.get(element).size();i++) {
				int next=graph.get(element).get(i);
				if(visit[next]==0) {
					visit[next]=order++;
					queue.offer(next);
				}
			}
		}
		
	}

}
