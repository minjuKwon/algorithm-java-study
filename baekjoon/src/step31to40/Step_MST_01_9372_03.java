package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_MST_01_9372_03 {
	
	static int [] parent;
	static int count;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		int T=Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		while(T-->0) {
			st=new StringTokenizer(br.readLine());
			int N=Integer.parseInt(st.nextToken());
			int M=Integer.parseInt(st.nextToken());
			
			count=0;
			parent=new int[N+1];
			
			for(int i=0;i<=N;i++) {
				parent[i]=i;
			}
			
			for(int i=0;i<M;i++) {
				st=new StringTokenizer(br.readLine());
				int a=Integer.parseInt(st.nextToken());
				int b=Integer.parseInt(st.nextToken());
				
				union(a,b);				
			}
			
			sb.append(count).append('\n');
		}
		
		System.out.println(sb);
		
	}
	
	static void union(int a, int b) {
		int x=find(a);
		int y=find(b);
		
		if(x==y) return;
		
		count++;
		
		if(x>y) {
			parent[x]=y;
		}else {
			parent[y]=x;
		}
	}
	
	static int find(int x) {
		if(x==parent[x]) return x;
		return parent[x]=find(parent[x]);
	}

}
