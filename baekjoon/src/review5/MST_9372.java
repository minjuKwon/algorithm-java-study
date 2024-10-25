package review5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MST_9372 {

	static int [] parent;
	static int count;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		
		while(T-->0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			int m =Integer.parseInt(st.nextToken());
			
			count=0;
			parent=new int[n+1];
			for(int i=1;i<=n;i++) parent[i]=i;
			
			for(int i=0;i<m;i++) {
				st=new StringTokenizer(br.readLine());
				int a=Integer.parseInt(st.nextToken());
				int b=Integer.parseInt(st.nextToken());
				union(a,b);
			}
			
			sb.append(count).append('\n');
		}
		
		br.close();
		
		System.out.println(sb);
		
	}
	
	static void union(int a, int b) {
		int x=find(a);
		int y=find(b);
		if(x==y) return ;
		count++;
		if(x>y) parent[x]=y;
		else parent[y]=x;
	}
	
	static int find(int x) {
		if(x==parent[x]) return x;
		return parent[x]=find(parent[x]);
	}

}
