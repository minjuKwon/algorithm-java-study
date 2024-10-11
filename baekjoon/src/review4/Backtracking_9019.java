package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Backtracking_9019 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		
		while(T-->0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int A=Integer.parseInt(st.nextToken());
			int B=Integer.parseInt(st.nextToken());
			
			String [] str=new String[10_000];
			boolean [] visited=new boolean[10_000];
			Queue<Integer> queue=new LinkedList<>();
			
			queue.offer(A);
			visited[A]=true;
			str[A]="";
			
			while(!queue.isEmpty()&&!visited[B]) {
				int element=queue.poll();
				int D=(element*2)%10000;
				int S=(element==0?9999:element-1);
				int L=(element%1000)*10+element/1000;
				int R=(element%10)*1000+(element/10);
				
				if(!visited[D]) {
					visited[D]=true;
					queue.offer(D);
					str[D]=str[element]+"D";
				}
				
				if(!visited[S]) {
					visited[S]=true;
					queue.offer(S);
					str[S]=str[element]+"S";
				}
				
				if(!visited[L]) {
					visited[L]=true;
					queue.offer(L);
					str[L]=str[element]+"L";
				}
				
				if(!visited[R]) {
					visited[R]=true;
					queue.offer(R);
					str[R]=str[element]+"R";
				}
			}
			
			sb.append(str[B]).append('\n');
		}
		
		br.close();
		
		System.out.println(sb);

	}

}
