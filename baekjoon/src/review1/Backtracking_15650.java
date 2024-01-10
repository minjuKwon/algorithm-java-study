package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backtracking_15650 {
	
	static int N,M;
	static int [] arr;
	static StringBuilder sb=new StringBuilder();

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		br.close();
		
		arr=new int[M];
		
		dfs(0, 0);
		
		System.out.println(sb);
		
	}
	
	static void dfs(int start, int depth) {
		
		if(depth==M) {
			for(int num:arr) {
				sb.append(num).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for(int i=start;i<N;i++) {
			arr[depth]=i+1;
			dfs(i+1, depth+1);
		}
		
	}

}
