package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Step_Backtracking_07_9019 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int T=Integer.parseInt(br.readLine());
		
		StringBuilder sb=new StringBuilder();
		
		while(T-->0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int A=Integer.parseInt(st.nextToken());
			int B=Integer.parseInt(st.nextToken());
			
			boolean [] visited=new boolean[10000];
			String [] arr=new String[10000];
			Queue<Integer> queue=new LinkedList<>();
			
			visited[A]=true;
			queue.offer(A);
			arr[A]="";
			
			while(!queue.isEmpty()&&!visited[B]) {
				int temp=queue.poll();
				int D=(temp*2)%10000;
				int S=temp==0?9999:temp-1;
				int L=(temp%1000)*10+temp/1000;
				int R=(temp%10)*1000+(temp/10);
				
				if(!visited[D]) {
					queue.offer(D);
					visited[D]=true;
					arr[D]=arr[temp]+"D";
				}
				if(!visited[S]) {
					queue.offer(S);
					visited[S]=true;
					arr[S]=arr[temp]+"S";
				}
				if(!visited[L]) {
					queue.offer(L);
					visited[L]=true;
					arr[L]=arr[temp]+"L";
				}
				if(!visited[R]) {
					queue.offer(R);
					visited[R]=true;
					arr[R]=arr[temp]+"R";
				}
				
			}
			
			sb.append(arr[B]).append('\n');
			
		}
		
		br.close();
		
		System.out.println(sb);

	}

}
