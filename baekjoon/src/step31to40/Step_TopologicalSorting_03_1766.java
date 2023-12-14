package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Step_TopologicalSorting_03_1766 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
		int [] edges=new int[N+1];
		
		for(int i=0;i<=N;i++) {
			graph.add(new ArrayList<>());
		}

		for(int i=0;i<M;i++) {
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			graph.get(a).add(b);
			edges[b]++;
		}
		
		br.close();
		
		StringBuilder sb=new StringBuilder();
		Queue<Integer> queue=new PriorityQueue<>();
		
		for(int i=1;i<=N;i++) {
			if(edges[i]==0) queue.offer(i);
		}
		
		while(!queue.isEmpty()) {
			int temp=queue.poll();
			sb.append(temp).append(' ');
			for(int a: graph.get(temp)) {
				edges[a]--;
				if(edges[a]==0) queue.offer(a);
			}
		}
		
		System.out.println(sb);

	}

}
