package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Step_Tree_01_11725 {
	
	static ArrayList<ArrayList<Integer>> list=new ArrayList<>();
	static int [] arr;
	static int N;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		
		arr=new int[N+1];
		
		for(int i=0;i<=N;i++) {
			list.add(new ArrayList<>());
		}
		
		StringTokenizer st;
		for(int i=1;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			
			int u=Integer.parseInt(st.nextToken());
			int v=Integer.parseInt(st.nextToken());
			
			list.get(u).add(v);
			list.get(v).add(u);
		}
		
		br.close();
		
		bfs();
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=2;i<=N;i++) {
			sb.append(arr[i]).append('\n');
		}
		
		System.out.println(sb);

	}
	
	static void bfs() {
		
		Queue<Integer>queue=new LinkedList<>();
		boolean [] visited=new boolean[N+1];
		
		queue.offer(1);
		
		while(!queue.isEmpty()) {
			int temp=queue.poll();
			
			for(int num:list.get(temp)) {
				if(!visited[num]) {
					visited[num]=true;
					arr[num]=temp;
					queue.offer(num);
				}
			}
			
		}
		
	}

}
