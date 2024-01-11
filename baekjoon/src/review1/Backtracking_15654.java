package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Backtracking_15654 {
	
	static int N,M;
	static int [] arr, arrDepth;
	static boolean [] visited;
	static StringBuilder sb=new StringBuilder();

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		arr=new int[M];
		arrDepth=new int[N];
		visited=new boolean[N];
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arrDepth[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arrDepth);
		
		dfs(0);
		
		System.out.println(sb);
		
	}
	
	static void dfs(int depth) {
		
		if(depth==M) {
			for(int num:arr) {
				sb.append(num).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for(int i=0;i<N;i++) {
			if(!visited[i]) {
				visited[i]=true;
				arr[depth]=arrDepth[i];
				dfs(depth+1);
				visited[i]=false;
			}
		}
		
	}

}
