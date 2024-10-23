package review5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class UnionFind_4195 {
	
	static int [] parent, level;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		
		while(T-->0) {
			
			int F=Integer.parseInt(br.readLine());
			int idx=0;
			
			parent=new int[F*2];
			level=new int[F*2];
			Map<String,Integer> map=new HashMap<>();
			
			for(int i=0;i<F*2;i++) {
				parent[i]=i;
				level[i]=1;
			}
			
			for(int i=0;i<F;i++) {
				StringTokenizer st=new StringTokenizer(br.readLine());
				String p1=st.nextToken();
				String p2=st.nextToken();
				if(!map.containsKey(p1)) map.put(p1, idx++);
				if(!map.containsKey(p2)) map.put(p2, idx++);
				sb.append(union(map.get(p1),map.get(p2))).append('\n');
			}
			
		}
		
		br.close();
		
		System.out.println(sb);
		
	}

	static int union(int a, int b) {
		int x=find(a);
		int y=find(b);
		if(x==y) return 0;
		if(x>y) {
			parent[x]=y;
			return level[y]+=level[x];
		}else {
			parent[y]=x;
			
		}
		return level[x]+=level[y];
	}
	
	static int find(int x) {
		if(x==parent[x]) return x;
		return parent[x]=find(parent[x]); 
	}

}
