package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Backtracking_15657 {
	
	static int N,M;
	static int [] arr,arrDepth;
	static StringBuilder sb=new StringBuilder();

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		arr=new int[N];
		arrDepth=new int[M];
	
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		br.close();
		
		Arrays.sort(arr);
		
		dfs(0,0);
		
		System.out.println(sb);

	}
	
	static void dfs(int depth, int index) {
		if(depth==M) {
			for(int num:arrDepth) {
				sb.append(num).append(' ');
			}sb.append('\n'); return;
		}
		for(int i=index;i<N;i++) {
			arrDepth[depth]=arr[i];
			dfs(depth+1, i);
		}
	}

}
