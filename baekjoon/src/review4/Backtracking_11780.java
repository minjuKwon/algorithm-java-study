package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Backtracking_11780 {

	static final int INF=1_000_000_000;
	static int [][] dist, path;
	static int n;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		n=Integer.parseInt(br.readLine());
		int m=Integer.parseInt(br.readLine());
		
		dist=new int[n+1][n+1];
		path=new int[n+1][n+1];
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				dist[i][j]=(i==j?0:INF);
				path[i][j]=-1;
			}
		}
		
		for(int i=0;i<m;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			dist[a][b]=Math.min(c,dist[a][b]);
			path[a][b]=a;
		}
		
		br.close();

		floywardshall();
		
		System.out.println(print());
		
	}
	
	static void floywardshall() {
		for(int k=1;k<=n;k++) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					if(dist[i][j]>dist[i][k]+dist[k][j]) {
						dist[i][j]=Math.min(dist[i][j], dist[i][k]+dist[k][j]);
						path[i][j]=path[k][j];
					}
				}
			}
		}
	}
	
	static StringBuilder print() {
		StringBuilder sb=new StringBuilder();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(dist[i][j]==INF) sb.append(0).append(' ');
				else sb.append(dist[i][j]).append(' ');
			}
			sb.append('\n');
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(path[i][j]==-1) sb.append(0).append('\n');
				else {
					Stack<Integer> stack=new Stack<>();
					int value=j;
					stack.push(value);
					
					while(i!=path[i][value]) {
						value=path[i][value];
						stack.push(value);
					}
					
					sb.append(stack.size()+1).append(' ');
					sb.append(i).append(' ');
					
					while(!stack.isEmpty()) {
						sb.append(stack.pop()).append(' ');
					}
					sb.append('\n');
				}
			}
		}
		
		return sb;
	}

}
