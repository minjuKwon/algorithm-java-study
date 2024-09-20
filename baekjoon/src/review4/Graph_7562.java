package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Graph_7562 {
	
	static int [] rangeX= {-2,-1,1,2,-2,-1,1,2};
	static int [] rangeY= {1,2,2,1,-1,-2,-2,-12};

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		
		while(T-->0) {
			int N=Integer.parseInt(br.readLine());
			
			Chess [] chess=new Chess[2];
			
			StringTokenizer st=new StringTokenizer(br.readLine());
			int startX=Integer.parseInt(st.nextToken());
			int startY=Integer.parseInt(st.nextToken());
			chess[0]=new Chess(startX,startY,0);
			
			st=new StringTokenizer(br.readLine());
			int endX=Integer.parseInt(st.nextToken());
			int endY=Integer.parseInt(st.nextToken());
			chess[1]=new Chess(endX,endY,0);
			
			sb.append(bfs(chess,N)).append('\n');
			
		}
		
		br.close();
		
		System.out.println(sb);
		
	}
	
	static int bfs(Chess[] chess, int n) {
		Queue<Chess> queue=new LinkedList<>();
		boolean [][] visited=new boolean[n][n];
		
		queue.offer(chess[0]);
		visited[chess[0].x][chess[0].y]=true;
		
		while(!queue.isEmpty()) {
			Chess element=queue.poll();
			if(chess[1].x==element.x&&chess[1].y==element.y) {
				return element.count;
			}
			for(int i=0;i<8;i++) {
				int dx=element.x+rangeX[i];
				int dy=element.y+rangeY[i];
				if(dx>=0&&dy>=0&&dx<n&&dy<n&&!visited[dx][dy]) {
					visited[dx][dy]=true;
					queue.offer(new Chess(dx,dy,element.count+1));
				}
			}
		}
		
		return 0;
	}

}

class Chess{
	int x; int y; int count;
	public Chess(int x, int y, int count) {
		this.x=x;
		this.y=y;
		this.count=count;
	}
}
