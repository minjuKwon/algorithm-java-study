package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Backtracking_15664 {
	
	static ArrayList<String> answer;
	static int [] arr;
	static boolean [] visited;
	static int N,M;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		answer=new ArrayList<>();
		arr=new int[N];
		visited=new boolean[N];
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) arr[i]=Integer.parseInt(st.nextToken());
		
		br.close();
		
		Arrays.sort(arr);
		
		dp(0,0,"");
			
		StringBuilder sb=new StringBuilder();
		for(String s:answer) {
			String [] list=s.split(" ");
			for(int i=0;i<M;i++) {
				sb.append(list[i]).append(' ');
			}sb.append('\n');
		}
		
		System.out.println(sb);
		
	}
	
	static void dp(int depth, int idx, String str) {
		
		if(depth==M) {
			if(!answer.contains(str)) answer.add(str);
			return;
		}
		
		for(int i=idx;i<N;i++) {
			if(!visited[i]) {
				visited[i]=true;
				dp(depth+1,i,str+arr[i]+" ");
				visited[i]=false;
			}
		}
		
		
	}

}
