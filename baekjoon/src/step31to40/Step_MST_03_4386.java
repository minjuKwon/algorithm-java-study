package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Step_MST_03_4386 {
	
	static int [] parent;
	static int x, y;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		
		Star [] stars=new Star[n];
		parent=new int[n];
		
		for(int i=0;i<n;i++) {
			parent[i]=i;
		}
		
		StringTokenizer st;
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(br.readLine());
			double x=Double.parseDouble(st.nextToken());
			double y=Double.parseDouble(st.nextToken());
			stars[i]=new Star(i, x ,y);
		}
		
		br.close();
		
		ArrayList<Cost> list=new ArrayList<>();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				double weight=getDistance(stars[i],stars[j]);
				list.add(new Cost(stars[i].position, stars[j].position, weight));
			}
		}
		
		Collections.sort(list);
		
		double cost=0;
		for(Cost c:list) {
			if(!isUnion(c.start,c.end)) {
				cost+=c.weight;
				union();
			}
		}
		
		System.out.println(cost);
		
	}
	
	static double getDistance(Star a, Star b) {
		return Math.sqrt(Math.pow(a.x-b.x, 2)+Math.pow(a.y-b.y, 2));
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
	
	static int find(int x) {
		if(x==parent[x]) return x;
		return parent[x]=find(parent[x]);
	}
	
	static class Star {
		int position;
		double x;
		double y;
		
		public Star(int position, double x, double y) {
			this.position=position;
			this.x=x;
			this.y=y;
		}
	}
	
	static class Cost implements Comparable<Cost>{
		int start;
		int end;
		double weight;
		
		public Cost(int start, int end, double weight) {
			this.start=start;
			this.end=end;
			this.weight=weight;
		}
		
		@Override
		public int compareTo(Cost c) {
			if(weight<c.weight) return -1;
			else return 1;
		}
	}

}
