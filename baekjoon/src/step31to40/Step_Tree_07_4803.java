package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Step_Tree_07_4803 {
	
	static ArrayList<ArrayList<Integer>> list;
	static StringBuilder sb=new StringBuilder();
	static boolean [] visited;
	static int n, idx, vertexCnt, edgeCnt;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;

		while(true) {
			
			st=new StringTokenizer(br.readLine());
			n=Integer.parseInt(st.nextToken());
			int m=Integer.parseInt(st.nextToken());
			
			if(n==0&&m==0) break;

			list=new ArrayList<>();
			visited=new boolean[n+1];
			
			for(int i=0;i<=n;i++) {
				list.add(new ArrayList<>());
			}
			
			for(int i=0;i<m;i++) {
				st=new StringTokenizer(br.readLine());
				int u=Integer.parseInt(st.nextToken());
				int v=Integer.parseInt(st.nextToken());
				
				list.get(u).add(v);
				list.get(v).add(u);
			}
			
			checkTree();
			
		}
		
		br.close();
		
		System.out.println(sb);

	}
	
	static void checkTree() {
		idx++;
		int treeCnt=0;
		
		for(int i=1;i<=n;i++) {
			if(visited[i]) {continue;}
			vertexCnt=0;
			edgeCnt=0;
			dfs(i);
			if(edgeCnt==(vertexCnt-1)*2) {treeCnt++;}
		}
		
		sb.append("Case").append(' ').append(idx).append(':');
		
		if(treeCnt==0) {
			sb.append(" No trees.");
		}else if(treeCnt==1) {
			sb.append(" There is one tree.");
		}else {
			sb.append(" A forest of ").append(treeCnt).append(" trees.");
		}
		
		sb.append('\n');
		
	}
	
	static void dfs(int start) {
		
		vertexCnt++;
		edgeCnt+=list.get(start).size();
		
		visited[start]=true;
		
		for(int i=0;i<list.get(start).size();i++) {
			int num=list.get(start).get(i);
			if(!visited[num]) {
				dfs(num);
			}
		}
	}

}
