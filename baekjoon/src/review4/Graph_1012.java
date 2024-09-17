package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Graph_1012 {
	
	static int [][] arr;
	static boolean [][] visited;
	static int [] rangeX= {-1,0,1,0};
	static int [] rangeY= {0,1,0,-1};
	static int N,M;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		
		StringBuilder sb=new StringBuilder();
		
		while(T-->0) {
			StringTokenizer st=new StringTokenizer(br.readLine());			
			N=Integer.parseInt(st.nextToken());
			M=Integer.parseInt(st.nextToken());
			int K=Integer.parseInt(st.nextToken());
			
			arr=new int[N][M];
			visited=new boolean[N][M];
			
			for(int i=0;i<K;i++) {
				st=new StringTokenizer(br.readLine());
				int x=Integer.parseInt(st.nextToken());
				int y=Integer.parseInt(st.nextToken());
				arr[x][y]=1;
			}
			
			int count=0;
			for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					if(arr[i][j]==1&&!visited[i][j]) {
						count++;
						dfs(i,j);
					}
				}
			}
			
			sb.append(count).append('\n');
		
		}
		
		br.close();
		
		System.out.println(sb);

	}
	
	static void dfs(int x, int y) {
		visited[x][y]=true;
		
		for(int i=0;i<4;i++) {
			int dx=rangeX[i]+x;
			int dy=rangeY[i]+y;
			if(dx<0||dy<0||dx>=N||dy>=M) {
				continue;
			}
			if(arr[dx][dy]==1&&!visited[dx][dy]) {
				dfs(dx,dy);
			}
		}
		
	}

}
