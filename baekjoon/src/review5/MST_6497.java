package review5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class MST_6497 {
	
	static int [] parent;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		while(true) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			int m=Integer.parseInt(st.nextToken());
			if(n==0&&m==0) break;
			
			parent=new int[n];
			for(int i=0;i<n;i++) parent[i]=i;
			
			int totalCost=0;
			ArrayList<Path> path=new ArrayList<>();
			
			for(int i=0;i<m;i++) {
				st=new StringTokenizer(br.readLine());
				int a=Integer.parseInt(st.nextToken());
				int b=Integer.parseInt(st.nextToken());
				int c=Integer.parseInt(st.nextToken());
				path.add(new Path(a,b,c));
				totalCost+=c;
			}
			
			Collections.sort(path);
			
			int minCost=0;
			for(Path p:path) {
				if(!isUnion(p.x,p.y)) {
					minCost+=p.distance;
					union(p.x,p.y);
				}
			}
			
			sb.append(totalCost-minCost).append('\n');
		}
		br.close();
		
		System.out.println(sb);

	}
	
	static boolean isUnion(int a, int b) {
		int x=find(a);
		int y=find(b);
		if(x==y) return true;
		else return false;
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

	static class Path implements Comparable<Path>{
		int x; int y; int distance;
		public Path(int x, int y, int distance) {
			this.x=x;
			this.y=y;
			this.distance=distance;
		}
		public int compareTo(Path p) {
			return this.distance-p.distance;
		}
	}
	
}
