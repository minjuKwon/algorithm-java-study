package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backtracking_10819_02 {
	
	static int [] arr, num;
	static boolean [] visited;
	static int N, max;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		
		arr=new int[N];
		num=new int[N];
		visited=new boolean[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) arr[i]=Integer.parseInt(st.nextToken());
		
		br.close();
		
		dp(0);
		
		System.out.println(max);
		
	}
	
	static void dp(int depth) {
		
		if(depth==N) {
			int sum=0;
			for(int i=1;i<N;i++) {
				sum+= Math.abs(num[i-1]-num[i]);
			}
			max=Math.max(max,sum);
			return;
		}
		
		for(int i=0;i<N;i++) {
			if(!visited[i]) {
				visited[i]=true;
				num[depth]=arr[i];
				dp(depth+1);
				visited[i]=false;
			}
		}
		
	}

}
