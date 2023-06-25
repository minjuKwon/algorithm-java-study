package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Step_Graph_14_16928 {
	
	static int [] count=new int[101];
	static int [] snakeAndLadder=new int[101];
	static boolean [] visited=new boolean[101];

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		for(int i=0;i<N+M;i++) {
			st=new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			int m=Integer.parseInt(st.nextToken());
			snakeAndLadder[n]=m;
		}
		
		br.close();
		
		bfs();

	}
	
	static void bfs() {
		
		Queue<Integer>queue=new LinkedList<>();
		
		queue.offer(1);
		visited[1]=true;
		
		while(!queue.isEmpty()) {
			
			int temp=queue.poll();
			
			if(temp==100) {
				System.out.println(count[100]);
				return;
			}
			
			for(int i=1;i<7;i++) {
				
				int position=temp+i;
				
				if(position>100) {continue;}
				if(visited[position]) {continue;}
				
				visited[position]=true;
				
				if(snakeAndLadder[position]!=0) {
					if(!visited[snakeAndLadder[position]]) {
						queue.offer(snakeAndLadder[position]);
						visited[snakeAndLadder[position]]=true;
						count[snakeAndLadder[position]]=count[temp]+1;						
					}
				}else {
					queue.offer(position);
					count[position]=count[temp]+1;
				}
				
			}
			
		}
		
	}

}
