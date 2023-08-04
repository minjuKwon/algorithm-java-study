package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Step_MST_01_9372 {
	
	static ArrayList<ArrayList<Integer>> list=new ArrayList<>();

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		int T=Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		while(T-->0) {
			st=new StringTokenizer(br.readLine());
			int N=Integer.parseInt(st.nextToken());
			int M=Integer.parseInt(st.nextToken());
			
			for(int i=0;i<=N;i++) {
				list.add(new ArrayList<>());
			}
			
			for(int i=0;i<M;i++) {
				st=new StringTokenizer(br.readLine());
				int a=Integer.parseInt(st.nextToken());
				int b=Integer.parseInt(st.nextToken());
				
				list.get(a).add(b);
				list.get(b).add(a);
			}
			
			sb.append(N-1).append('\n');
			
		}
		
		br.close();
		
		System.out.println(sb);

	}

}
