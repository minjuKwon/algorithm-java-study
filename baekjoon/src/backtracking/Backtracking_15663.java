package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Backtracking_15663 {

	static int N,M;
	static int [] arr;
	static boolean [] visited;
	static ArrayList<String> list=new ArrayList<>();
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		arr=new int[N];
		visited=new boolean[N];
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) arr[i]=Integer.parseInt(st.nextToken());
		
		br.close();
		
		Arrays.sort(arr);
		
		f(0,"");
		
		StringBuilder sb=new StringBuilder();
		for(String s:list) {
			String [] str=s.split(" ");
			for(int i=0;i<M;i++) {
				sb.append(str[i]).append(' ');
			}
			sb.append('\n');
		}
		
		System.out.println(sb);

	}
	
	static void f(int depth, String str) {
		if(depth==M) {
			if(!list.contains(str)) list.add(str);
			return;
		}
		for(int i=0;i<N;i++) {
			if(!visited[i]) {
				visited[i]=true;
				f(depth+1,str+arr[i]+" ");
				visited[i]=false;
			}
		}
	}

}
