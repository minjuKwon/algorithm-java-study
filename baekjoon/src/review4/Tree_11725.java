package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tree_11725 {

	static ArrayList<ArrayList<Integer>> tree=new ArrayList<>();
	static int [] parent;
	static int N;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		
		parent=new int[N+1];
		for(int i=0;i<=N;i++) {
			tree.add(new ArrayList<>());
		}
		
		for(int i=1;i<N;i++){
			StringTokenizer st=new StringTokenizer(br.readLine());
			int u=Integer.parseInt(st.nextToken());
			int v=Integer.parseInt(st.nextToken());
			tree.get(u).add(v);
			tree.get(v).add(u);
		}
		br.close();
		
		findParent();
		
		StringBuilder sb=new StringBuilder();
		for(int i=2;i<=N;i++) {
			sb.append(parent[i]).append('\n');
		}
		
		System.out.println(sb);
		
	}
	
	static void findParent() {
		
		Queue<Integer> queue=new LinkedList<>();
		boolean [] visited=new boolean[N+1];
		
		queue.offer(1);
		visited[1]=true;
		
		while(!queue.isEmpty()) {
			int element=queue.poll();
			for(int n:tree.get(element)) {
				if(!visited[n]) {
					parent[n]=element;
					visited[n]=true;
					queue.offer(n);					
				}
			}
		}
		
	}

}
