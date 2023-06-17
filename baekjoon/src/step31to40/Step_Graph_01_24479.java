package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
//https://kang-james.tistory.com/entry/%EB%B0%B1%EC%A4%80-%EA%B9%8A%EC%9D%B4-%EC%9A%B0%EC%84%A0-%ED%83%90%EC%83%892447924480%EC%9E%90%EB%B0%94
public class Step_Graph_01_24479 {
	
	static ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
	static int [] visit;
	static int order;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int R=Integer.parseInt(st.nextToken());
		
		visit=new int[N+1];
		
		for(int i=0;i<=N;i++) {
			graph.add(new ArrayList<>());
		}
		
		for(int i=0;i<M;i++) {
			st=new StringTokenizer(br.readLine());
			int u=Integer.parseInt(st.nextToken());
			int v=Integer.parseInt(st.nextToken());
			
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		
		br.close();
		
		for(int i=1;i<=N;i++) {
			Collections.sort(graph.get(i));
		}
		
		order=1;
		
		dfs(R);
		
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<=N;i++) {
			sb.append(visit[i]).append('\n');
		}
		
		System.out.println(sb);

	}
	
	static void dfs(int v) {
		visit[v]=order;

		for(int i=0;i<graph.get(v).size();i++) {
			int next=graph.get(v).get(i);
			if(visit[next]==0) {
				order++;
				dfs(next);
			}
		}
		
	}

}
