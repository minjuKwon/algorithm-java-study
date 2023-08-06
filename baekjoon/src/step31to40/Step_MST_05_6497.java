package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Step_MST_05_6497 {
	
	static class Path implements Comparable<Path>{
		int x;
		int y;
		int z;
		public Path(int x, int y, int z) {
			this.x=x;
			this.y=y;
			this.z=z;
		}
		public int compareTo(Path p) {
			return z-p.z;
		}
	}
	
	static int [] parent;
	static int x,y;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		StringTokenizer st;
		while(true) {
			st=new StringTokenizer(br.readLine());
			int M=Integer.parseInt(st.nextToken());
			int N=Integer.parseInt(st.nextToken());
			
			if(M==0&&N==0) break;
			
			ArrayList<Path> list=new ArrayList<>();
			parent=new int[N];
			
			for(int i=0;i<N;i++) {
				parent[i]=i;
			}
			
			int totalCost=0;
			
			for(int i=0;i<N;i++) {
				st=new StringTokenizer(br.readLine());
				int x=Integer.parseInt(st.nextToken());
				int y=Integer.parseInt(st.nextToken());
				int z=Integer.parseInt(st.nextToken());
				
				list.add(new Path(x,y,z));
				totalCost+=z;
			}
			
			Collections.sort(list);
			
			int minCost=0;
			
			for(Path p:list) {
				if(!isUnion(p.x, p.y)) {
					minCost+=p.z;
					union();
				}
			}
			
			sb.append(totalCost-minCost).append('\n');
			
		}
		
		br.close();
		
		System.out.println(sb);

	}
	
	static boolean isUnion(int a, int b) {
		x=find(a);
		y=find(b);
		
		if(x==y) return true;
		else return false;
	}
	
	static void union() {
		if(x>y) {
			parent[x]=y;
		}else {
			parent[y]=x;
		}
	}
	
	static int find(int a) {
		if(a==parent[a]) return a;
		return parent[a]=find(parent[a]);
	}

}
