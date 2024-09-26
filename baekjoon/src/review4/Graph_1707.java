package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Graph_1707 {
	
	static final int RED=1;
	static final int BLUE=-1;
	
	static ArrayList<ArrayList<Integer>> arr;
	static int [] colors;
	static boolean isConnect;
	static int V,E;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int K=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		
		while(K-->0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			V=Integer.parseInt(st.nextToken());
			E=Integer.parseInt(st.nextToken());	
			
			arr=new ArrayList<>();
			colors=new int[V+1];
			isConnect=true;
			
			for(int i=0;i<=V;i++) {
				arr.add(new ArrayList<>());
				colors[i]=0;
			}
			
			for(int i=0;i<E;i++) {
				st=new StringTokenizer(br.readLine());
				int u=Integer.parseInt(st.nextToken());
				int v =Integer.parseInt(st.nextToken());
				
				arr.get(u).add(v);
				arr.get(v).add(u);
			}
			
			for(int i=1;i<=V;i++) {
				if(!isConnect) break;
				if(colors[i]==0) dfs(i,RED);
			}
			
			if(isConnect) sb.append("YES").append('\n');
			else sb.append("NO").append('\n');
			
		}
		br.close();
	
		System.out.println(sb);

	}
	
	static void dfs(int startV, int color) {
		colors[startV]=color;
		
		for(int v:arr.get(startV)) {
			if(colors[v]==color) {
				isConnect=false;
				return;
			}
			if(colors[v]==0){
				dfs(v,-color);
			}	
		}
		
	}

}
