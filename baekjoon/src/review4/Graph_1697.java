package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Graph_1697 {
	
	static int [] visited;
	static int K;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		K=Integer.parseInt(st.nextToken());
		br.close();
		
		visited=new int[K+1];
		
		if(N==K) {
			System.out.println(0);
		}else {
			bfs(N);			
		}

	}
	
	static void bfs(int v) {
		Queue<Integer> queue=new LinkedList<>();
		queue.offer(v);
		visited[v]=1;
		
		while(!queue.isEmpty()) {
			int element=queue.poll();
			for(int i=0;i<3;i++) {
				int next;
				if(i==0) {
					next=element-1;
				}else if(i==1) {
					next=element+1;
				}else {
					next=element*2;
				}
				if(next==K) {
					System.out.println(visited[element]);
					return;
				}
				if(next>=0&&next<=K&&visited[next]==0) {
					queue.offer(next);
					visited[next]=visited[element]+1;
				}
			}
		}
		
	}

}
