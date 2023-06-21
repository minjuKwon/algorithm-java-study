package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Step_Graph_07_2667 {
	
	static boolean [][] visited;
	static int [][] map;
	static int [] rangeX= {-1,0,1,0};
	static int [] rangeY= {0,1,0,-1};
	static int count=0;
	static int N;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		
		map=new int [N][N];
		visited=new boolean[N][N];
		
		String str;
		for(int i=0;i<N;i++) {
			str=br.readLine();
			for(int j=0;j<N;j++) {
				map[i][j]=str.charAt(j)-'0';
			}
		}
		
		br.close();
		
		ArrayList<Integer> answer=new ArrayList<>();
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(map[i][j]==1&&!visited[i][j]) {
					count=0;
					dfs(i,j);
					answer.add(count);
				}
			}
		}
		
		Collections.sort(answer);
		
		StringBuilder sb=new StringBuilder();
		
		sb.append(answer.size()).append('\n');
		
		for(int a:answer) {
			sb.append(a).append('\n');
		}
		
		System.out.println(sb);

	}
	
	static void dfs(int x, int y) {
		
		visited[x][y]=true;
		count++;
		
		for(int i=0;i<4;i++) {
			
			int dx=x+rangeX[i];
			int dy=y+rangeY[i];
			
			if(dx>=0&&dy>=0&&dx<N&&dy<N) {
				if(map[dx][dy]==1&&!visited[dx][dy]) {
					dfs(dx,dy);
				}
			}
			
		}
		
	}
	
}
