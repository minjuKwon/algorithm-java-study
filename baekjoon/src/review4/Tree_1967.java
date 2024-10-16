package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Tree_1967 {
	
	static ArrayList<ArrayList<N>> list=new ArrayList<>();
	static boolean [] visited;
	static int longV,max;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		for(int i=0;i<=n;i++) list.add(new ArrayList<>());
		
		for(int i=1;i<n;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			list.get(a).add(new N(b,c));
			list.get(b).add(new N(a,c));
		}
		
		br.close();
		
		visited=new boolean[n+1];
		dfs(1,0);
		
		visited=new boolean[n+1];
		dfs(longV,0);
		
		System.out.println(max);

	}
	
	static void dfs(int startV, int dist) {
		
		if(dist>max) {
			max=dist;
			longV=startV;
		}
		
		visited[startV]=true;
		
		for(int i=0;i<list.get(startV).size();i++) {
			N node=list.get(startV).get(i);
			if(!visited[node.vertex]) {
				dfs(node.vertex,node.weight+dist);
			}
		}
		
	}

}
