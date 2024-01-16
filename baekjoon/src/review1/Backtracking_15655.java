package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Backtracking_15655 {
	
	static StringBuilder sb=new StringBuilder();
	static int [] arr, arrDepth;
	static int N,M;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		arrDepth=new int[N];
		arr=new int[M];
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arrDepth[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arrDepth);
		
		br.close();
		
		dfs(0, 0);
		
		System.out.println(sb);

	}
	
	static void dfs(int depth, int index) {
		if(depth==M) {
			for(int a:arr) {
				sb.append(a).append(' ');
			}
			sb.append('\n');
			return;
		}
		for(int i=index;i<N;i++) {
			arr[depth]=arrDepth[i];
			dfs(depth+1 ,i+1);
		}
	}

}
