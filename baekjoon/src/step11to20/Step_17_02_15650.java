package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/115
public class Step_17_02_15650 {
	
	static int[] arr;
	static StringBuilder sb=new StringBuilder();

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		br.close();
		
		arr=new int[M];
		
		dfs(N,M,1,0);

		System.out.println(sb);

	}
	
	static void dfs(int N,int M, int index, int depth) {

		if(depth==M) {
			for(int num:arr) {
				sb.append(num).append(' ');
			}
			sb.append('\n'); 
			return;
		}
		
		for(int i=index;i<=N;i++) {
			arr[depth]=i;
			dfs(N,M,i+1,depth+1);
		}
		
		
	}

}
