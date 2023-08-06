package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Step_MST_02_1197 {
	
	static int [] parent;
	static int x,y;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int V=Integer.parseInt(st.nextToken());
		int E=Integer.parseInt(st.nextToken());
		
		ArrayList<Node> list=new ArrayList<>();
		
		for(int i=0;i<E;i++) {
			st=new StringTokenizer(br.readLine());
			int A=Integer.parseInt(st.nextToken());
			int B=Integer.parseInt(st.nextToken());
			int C=Integer.parseInt(st.nextToken());
			
			list.add(new Node(A,B,C));
		}
		
		Collections.sort(list);
		
		br.close();
		
		parent=new int[V+1];
		
		for(int i=1;i<=V;i++) {
			parent[i]=i;
		}
		
		int answer=0;
		
		for(int i=0;i<E;i++) {
			Node n=list.get(i);
			if(!isUnion(n.x, n.y)) {
				answer+=n.weight;
				union();
			}
		}

		System.out.println(answer);
		
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
	
	static class Node implements Comparable<Node>{
		
		int x;
		int y;
		int weight;
		
		public Node(int x, int y, int weight) {
			this.x=x;
			this.y=y;
			this.weight=weight;
		}

		@Override
		public int compareTo(Node n) {
			return this.weight-n.weight;
		}
	
	}

}
