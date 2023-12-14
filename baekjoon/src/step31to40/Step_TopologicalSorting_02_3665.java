package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Step_TopologicalSorting_02_3665 {
	
	static List<ArrayList<Integer>> graph;
	static int [] edges;
	static int [] ranking;
	
	static Queue<Integer> queue;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb=new StringBuilder();
		
		while(T-->0) {
			
			int n=Integer.parseInt(br.readLine());
			
			graph=new ArrayList<>();
			edges=new int[n+1];
			ranking=new int[n+1];
			
			for(int i=0;i<=n;i++) {
				graph.add(new ArrayList<>());
			}
			
			st=new StringTokenizer(br.readLine());
			for(int i=0;i<n;i++) {
				ranking[i]=Integer.parseInt(st.nextToken());
			}
			
			for(int i=0;i<n;i++) {
				int grade=ranking[i];
				for(int j=i+1;j<n;j++) {
					graph.get(grade).add(ranking[j]);
					edges[ranking[j]]++;
				}
			}
			
			int m=Integer.parseInt(br.readLine());
			for(int i=0;i<m;i++) {
				st=new StringTokenizer(br.readLine());
				int a=Integer.parseInt(st.nextToken());
				int b=Integer.parseInt(st.nextToken());
				swap(a,b);
			}
			
			queue=new LinkedList<>();
			
			sb.append(getRanking(n)).append('\n');
			
		}
		
		br.close();
		
		System.out.println(sb);

	}
	
	static void swap(int a, int b) {
		if(graph.get(a).contains(b)) {
			graph.get(a).remove(Integer.valueOf(b));
			graph.get(b).add(a);
			edges[a]++;
			edges[b]--;
		}else {
			graph.get(b).remove(Integer.valueOf(a));
			graph.get(a).add(b);
			edges[b]++;
			edges[a]--;
		}
	}
	
	static String getRanking(int n) {
		
		for(int i=1;i<=n;i++) {
			if(edges[i]==0) {
				queue.add(i);
			}
		}
		
		int count=0;
		StringBuilder sb=new StringBuilder();
		
		while(!queue.isEmpty()) {
			
			if(queue.size()>1) return "?";
			
			int temp=queue.poll();
			count++;
			sb.append(temp).append(' ');
			
			for(int g:graph.get(temp)) {
				edges[g]--;
				if(edges[g]==0) queue.add(g);
			}
			
		}
		
		if(count!=n) return "IMPOSSIBLE";
		else return sb.toString();
		
	}

}
