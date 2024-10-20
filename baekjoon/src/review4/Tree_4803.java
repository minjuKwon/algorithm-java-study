package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Tree_4803 {
	
	static ArrayList<ArrayList<Integer>> list;
	static StringBuilder sb=new StringBuilder();
	static boolean [] visited;
	static int idx,n,edgeCnt,vertexCnt;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			n=Integer.parseInt(st.nextToken());
			int m=Integer.parseInt(st.nextToken());
			if(n==0&&m==0) break;
			
			list=new ArrayList<>();
			visited=new boolean[n+1];
			
			for(int i=0;i<=n;i++) list.add(new ArrayList<>());
			for(int i=0;i<m;i++) {
				st=new StringTokenizer(br.readLine());
				int a=Integer.parseInt(st.nextToken());
				int b=Integer.parseInt(st.nextToken());
				list.get(a).add(b);
				list.get(b).add(a);
			}
			checkTree();
		}
		br.close();
		
		System.out.println(sb);

	}
	
	static void checkTree() {
		idx++;
		int treeCount=0;
		
		for(int i=1;i<=n;i++) {
			if(visited[i]) continue;
			vertexCnt=0;
			edgeCnt=0;
			dfs(i);
			if(edgeCnt==(vertexCnt-1)*2) treeCount++;
		}
	
		sb.append("Case ").append(idx).append(": ");
		if(treeCount==0) sb.append("No trees.");
		else if(treeCount==1) sb.append("There is one tree.");
		else sb.append("A forest of ").append(treeCount).append(" trees.");
		sb.append('\n');
	}
	
	static void dfs(int startV) {
		vertexCnt++;
		edgeCnt+=list.get(startV).size();
		
		visited[startV]=true;
		
		for(int i=0;i<list.get(startV).size();i++) {
			int next=list.get(startV).get(i);
			if(!visited[next]) dfs(next);
		}
	}

}
