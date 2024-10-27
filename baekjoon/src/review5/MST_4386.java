package review5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class MST_4386 {

	static int [] parent;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		Start [] starts=new Start[n];
		parent=new int[n];
		
		for(int i=0;i<n;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			double x=Double.parseDouble(st.nextToken());
			double y=Double.parseDouble(st.nextToken());
			starts[i]=new Start(i,x,y);
			parent[i]=i;
		}
		br.close();
		
		ArrayList<Cost> list=new ArrayList<>();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				double distance=getDistance(starts[i],starts[j]);
				list.add(new Cost(starts[i].position, starts[j].position, distance));
			}
		}
		
		Collections.sort(list);
		double answer=0;
		
		for(Cost cost:list) {
			if(!isUnion(cost.x,cost.y)) {
				answer+=cost.weight;
				union(cost.x,cost.y);
			}
		}
		
		System.out.println(answer);
		
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
	
	static double getDistance(Start s1, Start s2) {
		return Math.sqrt(Math.pow(s1.x-s2.x, 2)+Math.pow(s1.y-s2.y, 2));
	}
	
	static class Start{
		int position; double x; double y;
		public Start(int position, double x, double y) {
			this.position=position;
			this.x=x;
			this.y=y;
		}
	}
	
	static class Cost implements Comparable<Cost>{
		int x; int y; double weight;
		public Cost(int x, int y, double weight) {
			this.x=x;
			this.y=y;
			this.weight=weight;
		}
		public int compareTo(Cost c) {
			return (int) (this.weight-c.weight);
		}
	}

}
