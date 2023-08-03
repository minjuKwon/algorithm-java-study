package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_UnionFind_02_1976 {
	
	static int [] parent;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		int M=Integer.parseInt(br.readLine());
		
		parent=new int[N+1];
		
		for(int i=1;i<=N;i++) {
			parent[i]=i;
		}
		
		StringTokenizer st;
		for(int i=1;i<=N;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=1;j<=N;j++) {
				int isConnect=Integer.parseInt(st.nextToken());
				if(isConnect==1) {
					union(i,j);
				}
			}
		}
		
		st=new StringTokenizer(br.readLine());
		
		int start=find(Integer.parseInt(st.nextToken()));
		
		for(int i=1;i<M;i++) {
			int path=find(Integer.parseInt(st.nextToken()));
			if(start!=path) {
				System.out.println("NO");
				return;
			}
		}
		
		System.out.println("YES");

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
	
	static int find(int x) {
		if(x==parent[x]) return x;
		return parent[x]=find(parent[x]);
	}

}
