package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Graph_2667 {
	
	static int [][] board;
	static boolean [][] visited;
	static int [] rangeX= {-1,0,1,0};
	static int [] rangeY= {0, 1, 0, -1};
	static int N,count;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		board=new int[N][N];
		visited=new boolean[N][N];
		
		for(int i=0;i<N;i++) {
			String input=br.readLine();
			for(int j=0;j<N;j++) {
				board[i][j]=input.charAt(j)-'0';
			}
		}
		
		br.close();
		
		ArrayList<Integer> answer=new ArrayList<>();
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(board[i][j]==1&&!visited[i][j]) {
					count=0;
					answer.add(dfs(i,j));					
				}
			}
		}
		
		Collections.sort(answer);
		
		sb.append(answer.size()).append('\n');
		
		for(int a:answer) {
			sb.append(a).append('\n');
		}
		
		System.out.println(sb);
		
	}
	
	static int dfs(int x, int y) {
		visited[x][y]=true;
		count++;
		
		for(int i=0;i<4;i++) {
			int dx=x+rangeX[i];
			int dy=y+rangeY[i];
			if(dx<0||dy<0||dx>=N||dy>=N) {
				continue;
			}
			if(board[dx][dy]==1&&!visited[dx][dy]) {
				dfs(dx,dy);				
			}
		}
		
		return count;
	}

}
