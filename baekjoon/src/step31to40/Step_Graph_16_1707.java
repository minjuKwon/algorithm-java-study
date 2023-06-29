package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
//https://gmlwjd9405.github.io/2018/08/23/algorithm-bipartite-graph.html
public class Step_Graph_16_1707 {
	
	static final int RED=1;
	static final int BLUE=-1;

	static ArrayList<ArrayList<Integer>> graph;
	static boolean isConnect;
	static int [] colors;
	static int V,E;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int K=Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb=new StringBuilder();
		
		while(K-->0) {
			
			st=new StringTokenizer(br.readLine());
			V=Integer.parseInt(st.nextToken());
			E=Integer.parseInt(st.nextToken());
			
			graph=new ArrayList<>();
			colors=new int[V+1];
			isConnect=true;
			
			for(int i=0;i<=V;i++) {
				graph.add(new ArrayList<Integer>());
				colors[i]=0;
			}
			
			for(int i=0;i<E;i++) {
				st=new StringTokenizer(br.readLine());
				int a=Integer.parseInt(st.nextToken());
				int b=Integer.parseInt(st.nextToken());
				
				graph.get(a).add(b);
				graph.get(b).add(a);
			}
			
			for(int i=1;i<=V;i++) {
				if(!isConnect) {
					break;
				}
				if(colors[i]==0) {
					dfs(i,RED);
				}
			}
			
			if(isConnect) {
				sb.append("YES").append('\n');
			}else {
				sb.append("NO").append('\n');
			}
			
		}
		
		br.close();
		
		System.out.println(sb);

	}
	
	static void dfs(int startV, int color) {
		
		colors[startV]=color;
		
		for(int v:graph.get(startV)) {
			if(colors[v]==color) {
				isConnect=false;
				return;
			}
			if(colors[v]==0) {
				dfs(v,-color);
			}
		}
		
	}

}
