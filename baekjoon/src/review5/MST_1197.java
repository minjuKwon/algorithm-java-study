package review5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class MST_1197 {

	static int [] parent;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int v=Integer.parseInt(st.nextToken());
		int e=Integer.parseInt(st.nextToken());
		
		ArrayList<Node> list=new ArrayList<>();
		parent=new int[v+1];
		
		for(int i=0;i<=v;i++) parent[i]=i;
		
		for(int i=0;i<e;i++) {
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			list.add(new Node(a,b,c));
		}
		br.close();
		
		Collections.sort(list);
		
		int answer=0;
		for(int i=0;i<e;i++) {
			Node node=list.get(i);
			if(!isUnion(node.x,node.y)) {
				answer+=node.weight;
				union(node.x,node.y);
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

	static int find(int a) {
		if(a==parent[a]) return a;
		return parent[a]=find(parent[a]);
	}
	
}

class Node implements Comparable<Node>{
	int x; int y; int weight;
	public Node(int x, int y, int weight) {
		this.x=x;
		this.y=y;
		this.weight=weight;
	}
	public int compareTo(Node n) {
		return this.weight-n.weight;
	}
}


