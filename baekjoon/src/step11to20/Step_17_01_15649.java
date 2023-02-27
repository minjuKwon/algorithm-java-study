package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_17_01_15649 {
	
	static boolean [] visit;
	static int [] arr;
	static StringBuilder sb=new StringBuilder();

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		br.close();
		
		visit=new boolean[N];
		arr=new int[M];
		
		dfs(N,M,0);
		
		System.out.println(sb);
		
	}
	
	static void dfs(int N, int M, int depth) {
		
		if(M==depth) {
			for(int num : arr) {
				sb.append(num).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for(int i=0;i<N;i++) {
			if(!visit[i]) {
				visit[i]=true;
				arr[depth]=i+1;
				dfs(N,M,depth+1);
				visit[i]=false;
			}
		}
		
	}

}
