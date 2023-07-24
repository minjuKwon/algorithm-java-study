package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Step_Backtracking_06_13913 {
	
	static int [] visited=new int[100001];
	static int [] arr=new int[100001];
	static int K;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		K=Integer.parseInt(st.nextToken());
		
		br.close();
		
		StringBuilder sb=new StringBuilder();
		
		if(N==K) {
			sb.append(0).append('\n').append(N);
		}else {
			int result=bfs(N);
			
			sb.append(visited[result]).append('\n');
			
			Stack<Integer> stack=new Stack<>();
			stack.push(K);
			int idx=K;
			
			for(int i=0;i<visited[result];i++) {
				stack.push(arr[idx]);
				idx=arr[idx];
			}
			
			while(!stack.isEmpty()) {
				sb.append(stack.pop()).append(' ');
			}
						
		}
		
		System.out.println(sb);
		
	}
	
	static int bfs(int num) {
		
		Queue<Integer>queue=new LinkedList<>();
		queue.offer(num);
		
		visited[num]=1;
		
		while(!queue.isEmpty()) {
			
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
					arr[K]=temp;
					return temp;
				}
				
				if(next>=0&&next<100001&&visited[next]==0) {
					queue.offer(next);
					visited[next]=visited[temp]+1;
					arr[next]=temp;
				}
				
			}
			
		}
		
		return 0;
		
	}

}
