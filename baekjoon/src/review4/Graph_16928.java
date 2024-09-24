package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Graph_16928 {
	
	static int [] arr=new int[101];
	static int [] counts=new int[101];
	static boolean [] visited=new boolean[101];

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		while(N+M -->0) {
			st=new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			int m=Integer.parseInt(st.nextToken());
			arr[n]=m;
		}
		br.close();
		
		bfs();
		
	}
	
	static void bfs() {
		
		Queue<Integer> queue=new LinkedList<>();
		queue.offer(1);
		visited[1]=true;
		
		while(!queue.isEmpty()) {
			
			int element=queue.poll();
			if(element==100) {
				System.out.println(counts[100]);
				return;
			}
			
			for(int i=1;i<7;i++) {
				
				int next=element+i;
				if(next>100||visited[next]) continue;
				visited[next]=true;
				
				if(arr[next]>0&&!visited[arr[next]]) {
					counts[arr[next]]= counts[element]+1;
					visited[arr[next]]=true;
					queue.offer(arr[next]);
				}else {
					counts[next]=counts[element]+1;
					queue.offer(next);
				}
				
			}
			
		}
		
	}

}
