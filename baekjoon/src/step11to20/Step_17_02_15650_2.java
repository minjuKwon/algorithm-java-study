package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/115
public class Step_17_02_15650_2 {
	
	static int[] arr;
	static int N,M;
	static StringBuilder sb=new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		br.close();
		
		arr=new int[M];
		
		dfs(1,0);
		
		System.out.println(sb);

	}
	
	static void dfs(int index, int depth) {
		if(depth==M) {
			for(int num:arr) {
				sb.append(num).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for(int i=index;i<=N;i++) {
			arr[depth]=i;
			dfs(i+1,depth+1);
		}
		
	}

}
