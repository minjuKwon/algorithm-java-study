package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Step_Backtracking_09_11780 {
	
	static final int INF=10000000;
	static int [][] dist,path;
	static int n;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		n=Integer.parseInt(br.readLine());
		int m=Integer.parseInt(br.readLine());
		
		dist=new int[n+1][n+1];
		path=new int[n+1][n+1];
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				path[i][j]=-1;
				dist[i][j]=(i==j)?0:INF;
			}
		}
		
		StringTokenizer st;
		while(m-->0) {
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			
			dist[a][b]=Math.min(dist[a][b], c);
			path[a][b]=a;
		}
		
		floydWarshall();
		
		StringBuilder sb=print();
		
		System.out.println(sb);
	
	}
	
	static void floydWarshall() {
		
		for(int k=1;k<=n;k++) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					if(dist[i][j]>dist[i][k]+dist[k][j]) {
						dist[i][j]=dist[i][k]+dist[k][j];
						path[i][j]=path[k][j];
					}
				}
			}
		}
		
	}
	
	static StringBuilder print() {
		
		StringBuilder sb=new StringBuilder();
		//비용 출력
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(dist[i][j]==INF) {
					sb.append(0).append(' ');
				}else {
					sb.append(dist[i][j]).append(' ');
				}
			}
			sb.append('\n');
		}
		//경로 출력
		Stack<Integer>stack;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(path[i][j]==-1) { sb.append('0').append('\n');}
				else 
				{
					stack=new Stack<>();
					int temp=j;
					stack.push(temp);
					
					while(i!=path[i][temp]) {
						temp=path[i][temp];
						stack.push(temp);
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
