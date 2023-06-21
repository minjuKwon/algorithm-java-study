package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_Graph_08_1012 {
	
	static int [][] field;
	static boolean [][] visited;
	
	static int [] rangeX= {-1,0,1,0};
	static int [] rangeY= {0,1,0,-1};
	
	static int N,M;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int T=Integer.parseInt(br.readLine());
		
		int K,x,y,count;
		StringTokenizer st;
		StringBuilder sb=new StringBuilder();
		
		while(T-->0) {
			
			st=new StringTokenizer(br.readLine());
			M=Integer.parseInt(st.nextToken());
			N=Integer.parseInt(st.nextToken());
			K=Integer.parseInt(st.nextToken());
			
			field=new int[M][N];
			visited=new boolean[M][N];
			
			for(int i=0;i<K;i++) {
				st=new StringTokenizer(br.readLine());
				x=Integer.parseInt(st.nextToken());
				y=Integer.parseInt(st.nextToken());
				field[x][y]=1;
			}
			
			count=0;
			
			for(int i=0;i<M;i++) {
				for(int j=0;j<N;j++) {
					if(field[i][j]==1&&!visited[i][j]) {
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
			
			int dx=x+rangeX[i];
			int dy=y+rangeY[i];
			
			if(dx>=0&&dy>=0&&dx<M&&dy<N) {
				if(field[dx][dy]==1&&!visited[dx][dy]) {
					dfs(dx,dy);
				}
			}
			
		}
		
	}

}
