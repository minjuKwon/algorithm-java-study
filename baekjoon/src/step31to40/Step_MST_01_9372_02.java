package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Step_MST_01_9372_02 {
	
	static ArrayList<ArrayList<Integer>> list;
	static int N, count;
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		int T=Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		while(T-->0) {
			st=new StringTokenizer(br.readLine());
			N=Integer.parseInt(st.nextToken());
			int M=Integer.parseInt(st.nextToken());
			
			list=new ArrayList<>();
			
			for(int i=0;i<=N;i++) {
				list.add(new ArrayList<>());
			}
			
			for(int i=0;i<M;i++) {
				st=new StringTokenizer(br.readLine());
				int a=Integer.parseInt(st.nextToken());
				int b=Integer.parseInt(st.nextToken());
				
				list.get(a).add(b);
				list.get(b).add(a);
			}
			
			bfs();
			
			sb.append(count-1).append('\n');
		}
		
		br.close();
		
		System.out.println(sb);

	}
	
	static void bfs() {
		Queue<Integer> queue=new LinkedList<>();
		boolean [] visited=new boolean[N+1];
		
		count=0;
		queue.add(1);
		
		while(!queue.isEmpty()) {
			int temp=queue.poll();
			
			if(visited[temp]) continue;
			visited[temp]=true;
			
			count++;
			
			for(int num:list.get(temp)) {
				if(!visited[num]) {
					queue.offer(num);
				}
			}
			
		}
		
	}

}
