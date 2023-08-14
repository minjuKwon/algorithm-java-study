package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
//https://bbangson.tistory.com/54
public class Step_DpInTree_01_15681_02 {
	
	static ArrayList<ArrayList<Integer>> list=new ArrayList<>();
	static boolean [] visited;
	static int [] size;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int R=Integer.parseInt(st.nextToken());
		int Q=Integer.parseInt(st.nextToken());
		
		visited=new boolean[N+1];
		size=new int[N+1];
		
		for(int i=0;i<=N;i++) {
			list.add(new ArrayList<>());
		}
		
		for(int i=1;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			int U=Integer.parseInt(st.nextToken());
			int V=Integer.parseInt(st.nextToken());
			
			list.get(U).add(V);
			list.get(V).add(U);
		}
		
		dp(R);
		
		StringBuilder sb=new StringBuilder();
		
		while(Q-->0) {
			int q=Integer.parseInt(br.readLine());
			sb.append(size[q]).append('\n');
		}
		
		br.close();
		
		System.out.println(sb);

	}
	
	static int dp(int node) {
		if(size[node]!=0) return size[node];
		
		visited[node]=true;
		int count=1;
		
		for(int a:list.get(node)) {
			if(visited[a]) continue;
			count+=dp(a);
		}
		
		size[node]=count;
		
		return size[node];
	}

}
