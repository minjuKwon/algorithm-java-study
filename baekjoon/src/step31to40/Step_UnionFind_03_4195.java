package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Step_UnionFind_03_4195 {
	
	static int [] parent;
	static int [] level;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int T=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		
		while(T-->0) {
			
			int F=Integer.parseInt(br.readLine());
			
			parent=new int[F*2];
			level=new int[F*2];
			
			for(int i=0;i<F*2;i++) {
				parent[i]=i;
				level[i]=1;
			}
			
			HashMap <String,Integer> map=new HashMap<>();
			int idx=0;
			
			for(int i=0;i<F;i++) {
				String [] friends=br.readLine().split(" ");
				String p1=friends[0];
				String p2=friends[1];
				
				if(!map.containsKey(p1)) {
					map.put(p1, idx++);
				}
				
				if(!map.containsKey(p2)) {
					map.put(p2, idx++);
				}
				
				int result=union(map.get(p1),map.get(p2));
				sb.append(result).append('\n');
			}
			
		}
		
		br.close();
		
		System.out.println(sb);

	}
	
	static int union(int a, int b) {
		int x=find(a);
		int y=find(b);
		
		if(x!=y) {
			if(x>y) {
				parent[x]=y;
				level[y]+=level[x];
				return level[y];
			}else {
				parent[y]=x;
				level[x]+=level[y];
			}
		}
		
		return level[x];
	}
	
	static int find(int x) {
		if(x==parent[x]) return x;
		return parent[x]=find(parent[x]);
	}

}
