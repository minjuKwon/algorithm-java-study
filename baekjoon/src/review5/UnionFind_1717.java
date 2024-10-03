package review5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UnionFind_1717 {

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
		while(m-->0) {
			st=new StringTokenizer(br.readLine());
			int operation=Integer.parseInt(st.nextToken());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			if(operation==0) {
				union(a,b);
			}else {
				if(isUnion(a,b)) {
					sb.append("YES").append('\n');
				}else {
					sb.append("NO").append('\n');
				}
			}
		}
		br.close();
		
		System.out.println(sb);

	}
	
	static boolean isUnion(int a, int b) {
		int x=find(a);
		int y=find(b);
		
		if(x==y) return true;
		return false;
	}
	
	static void union(int a, int b) {
		int x=find(a);
		int y=find(b);
		if(x==y) return;
		if(x>y) parent[x]=y;
		else parent[y]=x;
	}
	
	static int find(int x) {
		if(x==parent[x]) return x;
		return parent[x]=find(parent[x]);
	}

}
