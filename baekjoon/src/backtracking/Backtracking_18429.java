package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backtracking_18429 {
	
	static final int CONDITION=500;

	static int N,K,count;
	static int [] arr;
	static boolean [] visited;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		K=Integer.parseInt(st.nextToken());
		
		arr=new int[N];
		visited=new boolean[N];
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) arr[i]=Integer.parseInt(st.nextToken());
		
		br.close();
		
		dp(0,CONDITION);
		
		System.out.println(count);
		
	}
	
	static void dp(int depth, int sum) {
		
		if(depth==N) {
			count++;
			return;
		}		
		
		for(int i=0;i<N;i++) {
			if(!visited[i]) {
				int value=sum-K+arr[i];
				if(value>=CONDITION) {
					visited[i]=true;
					dp(depth+1,value);
					visited[i]=false;
				}
			}
		}
		
	}

}
