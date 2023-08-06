package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Step_MST_04_1774 {
	
static class Universe {
	int position;
	int x;
	int y;
	public Universe(int position, int x, int y){
		this.position=position;
		this.x=x;
		this.y=y;
	}
}

static class Path implements Comparable<Path>{
	int start;
	int end;
	double weight;
	public Path(int start, int end, double weight) {
		this.start=start;
		this.end=end;
		this.weight=weight;
	}
	@Override
	public int compareTo(Path p) {
		if(weight<p.weight) return -1;
		else return 1;
	}
}
	static int [] parent;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		Universe[] universe=new Universe[N+1];
		parent=new int[N+1];
		
		for(int i=1;i<=N;i++) {
			parent[i]=i;
		}
		
		for(int i=1;i<=N;i++) {
			st=new StringTokenizer(br.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			universe[i]=new Universe(i, x, y);
		}
		
		for(int i=0;i<M;i++) {
			st=new StringTokenizer(br.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			union(x,y);
		}
		
		br.close();
		
		ArrayList<Path> list=new ArrayList<>();
		
		for(int i=1;i<=N;i++) {
			for(int j=i+1;j<=N;j++) {
				double distance=getDistance(universe[i],universe[j]);
				list.add(new Path(universe[i].position, universe[j].position, distance));
			}
		}
		
		Collections.sort(list);
		
		double answer=0;
		
		for(Path p:list) {
			if(!isUnion(p.start, p.end)) {
				answer+=p.weight;
				union(p.start, p.end);
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
