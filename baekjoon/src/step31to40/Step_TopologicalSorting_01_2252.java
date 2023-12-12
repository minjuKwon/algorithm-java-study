package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Step_TopologicalSorting_01_2252 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
				
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		List<ArrayList<Integer>>graph=new ArrayList<>();
		int [] edges=new int[N+1];
		
		for(int i=0;i<=N;i++) {
			graph.add(new ArrayList<>());
		}
		
		while(M-->0) {
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			graph.get(a).add(b);
			edges[b]++;
		}
		
		br.close();
		
		Queue<Integer> queue=new LinkedList<>();
		
		for(int i=1;i<=N;i++) {
			if(edges[i]==0) {
				queue.add(i);
			}
		}
		
		StringBuilder sb=new StringBuilder();
		List<Integer> list;
		
		while(!queue.isEmpty()) {
			
			int student=queue.poll();
			sb.append(student).append(' ');
			list=graph.get(student);
			
			for(int i=0;i<list.size();i++) {
				int temp=list.get(i);
				edges[temp]--;
				if(edges[temp]==0) {
					queue.offer(temp);
				}
			}
			
		}
		
		System.out.println(sb);

	}

}
