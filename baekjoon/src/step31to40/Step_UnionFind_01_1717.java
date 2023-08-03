package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_UnionFind_01_1717 {

	static int [] parent;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		parent=new int[n+1];
		
		for(int i=0;i<=n;i++) {
			parent[i]=i;
		}
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<m;i++) {
			st=new StringTokenizer(br.readLine());
			int command=Integer.parseInt(st.nextToken());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			
			if(command==0) {
				union(a,b);
			}else {
				boolean result=isUnion(a,b);
				sb.append(result?"YES":"NO").append('\n');
			}
		}
		
		br.close();
		
		System.out.println(sb);

	}
	
	static void union(int a, int b) {
		
		int x=find(a);
		int y=find(b);
		
		if(x==y) return;
		
		if(x>y) {
			parent[x]=y;
		}else {
			parent[y]=x;
		}
		
	}
	
	static boolean isUnion(int a, int b) {
		int x=find(a);
		int y=find(b);
		
		if(x==y) return true;
		else return false;
	}
	
	static int find(int x) {
		if(x==parent[x]) { return x; }
		return parent[x]=find(parent[x]);
	}
	
}
