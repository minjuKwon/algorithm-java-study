package review5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class MST_1774 {
	
	static int [] parent;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		Universe [] uni=new Universe[N+1];
		parent=new int[N+1];
		
		for(int i=1;i<=N;i++) parent[i]=i;
		
		for(int i=1;i<=N;i++) {
			st=new StringTokenizer(br.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			uni[i]=new Universe(x,y,i);
		}
		
		for(int i=0;i<M;i++) {
			st=new StringTokenizer(br.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			union(x,y);
		}
		br.close();
		
		ArrayList<Cost> list=new ArrayList<>();
		
		for(int i=1;i<=N;i++) {
			for(int j=i+1;j<=N;j++) {
				double distance=getDistance(uni[i],uni[j]);
				list.add(new Cost(uni[i].position,uni[j].position,distance));
			}
		}
		
		Collections.sort(list);
		
		double answer=0;
		
		for(Cost c:list) {
			if(!isUnion(c.start,c.end)) {
				answer+=c.weight;
				union(c.start,c.end);
			}
		}
		
		System.out.println(String.format("%.2f", answer));

	}
	
	static double getDistance(Universe u1, Universe u2) {
		return Math.sqrt(Math.pow(u1.x-u2.x, 2)+Math.pow(u1.y-u2.y, 2));
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
		if(x>y) parent[x]=y;
		else parent[y]=x;
	}
	
	static int find(int x) {
		if(x==parent[x]) return x;
		return parent[x]=find(parent[x]);
	}
	
	static class Cost implements Comparable<Cost>{
		int start; int end; double weight;
		public Cost(int start, int end, double weight) {
			this.start=start;
			this.end=end;
			this.weight=weight;
		}
		public int compareTo(Cost c) {
			return Double.compare(weight, c.weight);
		}
	}
	
	static class Universe{
		int x; int y; int position;
		public Universe(int x, int y, int position) {
			this.x=x;
			this.y=y;
			this.position=position;
		}
	}

}
