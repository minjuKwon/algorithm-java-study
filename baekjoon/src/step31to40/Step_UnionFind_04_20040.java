package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_UnionFind_04_20040 {

	static int [] parent;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		parent=new int[n];
		
		for(int i=0;i<n;i++) {
			parent[i]=i;
		}
		
		int result=0;
		for(int i=1;i<=m;i++) {
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			if(!union(a,b)) {
				result=i;
				break;
			}
		}
		
		br.close();

		System.out.println(result);
		
	}
	
	static boolean union(int a, int b) {
		int x=find(a);
		int y=find(b);
		
		if(x==y) {
			return false;
		}
		else {
			if(x>y) {
				parent[x]=y;
			}else {
				parent[y]=x;
			}
			return true;
		}
		
	}
	
	static int find(int x) {
		if(x==parent[x]) return x;
		return parent[x]=find(parent[x]);
	}

}
