package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Step_Graph_10_1697 {
	
	static int [] visited=new int[100001];
	static int N,K;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		K=Integer.parseInt(st.nextToken());
		
		br.close();
		
		if(N==K) {
			System.out.println(0);
		}else {
			bfs(N);
		}
		
	}
	
	static void bfs(int num) {
		
		Queue<Integer> queue=new LinkedList<>();
	
		queue.offer(num);
		visited[num]=1;
		
		while(!queue.isEmpty()){
			int temp=queue.poll();
			for(int i=0;i<3;i++) {
				int next;
				if(i==0) {
					next=temp+1;
				}else if(i==1) {
					next=temp-1;
				}else {
					next=temp*2;
				}
				
				if(next==K) {
					System.out.println(visited[temp]);
					return;
				}
				
				if(next>=0&&next<100001&&visited[next]==0) {
					queue.offer(next);
					visited[next]=visited[temp]+1;
				}
			}
		}
		
	}

}
