package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Step_DpInTree_02_2213 {
	
	static ArrayList<ArrayList<Integer>> list=new ArrayList<>();
	static ArrayList<Integer> path=new ArrayList<>();
	static int [][] dp;
	static int [] weight;
	static boolean [] visited;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int N=Integer.parseInt(br.readLine());
		
		weight=new int[N+1];
		dp=new int[2][N+1];
		visited=new boolean[N+1];
		
		for(int i=0;i<=N;i++) {
			list.add(new ArrayList<>());
		}
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++) {
			weight[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=1;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			int U=Integer.parseInt(st.nextToken());
			int V=Integer.parseInt(st.nextToken());
			
			list.get(U).add(V);
			list.get(V).add(U);
		}
		
		br.close();
		
		getMax(1);
		
		visited=new boolean[N+1];
		
		StringBuilder sb=new StringBuilder();
		
		if(dp[0][1]>dp[1][1]) {
			sb.append(dp[0][1]).append('\n');
			getPath(1,0);
		}else {
			sb.append(dp[1][1]).append('\n');
			getPath(1,1);
		}
		
		Collections.sort(path);
		
		for(int num:path) {
			sb.append(num).append(' ');
		}
		
		System.out.println(sb);
		
	}
	
	static void getMax(int vertext) {
		
		int size=list.get(vertext).size();
		if(size==0) return;
		
		dp[0][vertext]=0;
		dp[1][vertext]=weight[vertext];
		
		visited[vertext]=true;
		
		for(int child : list.get(vertext)) {
			
			if(!visited[child]) {
				
				getMax(child);
				
				if(dp[0][child]>dp[1][child]) {
					dp[0][vertext]+=dp[0][child];
				}else {
					dp[0][vertext]+=dp[1][child];
				}
				
				dp[1][vertext]+=dp[0][child];
				
			}
			
		}
		
	}
	
	static void getPath(int vertext, int visit) {
		
		visited[vertext]=true;
		
		if(visit==1) {
			path.add(vertext);
			for(int child : list.get(vertext)) {
				if(!visited[child]) {
					getPath(child, 0);					
				}
			}
		}
		else {
			for(int child:list.get(vertext)) {
				
				if(!visited[child]) {
					if(dp[0][child]>dp[1][child]) {
						getPath(child,0);
					}else {
						getPath(child,1);
					}
				}
				
			}
		}
		
	}

}
