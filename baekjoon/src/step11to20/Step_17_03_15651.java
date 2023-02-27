package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_17_03_15651 {

	static int [] arr;
	static StringBuilder sb=new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		br.close();
		
		arr=new int[M];
		
		dfs(N,M,0);
		
		System.out.println(sb);

	}
	
	static void dfs(int N, int M, int depth) {
		if(depth==M) {
			for(int num:arr) {
				sb.append(num).append(' ');
			}
			sb.append('\n');
			return;
		}
		for(int i=1;i<=N;i++) {
			arr[depth]=i;
			dfs(N,M,depth+1);
		}
	}

}
