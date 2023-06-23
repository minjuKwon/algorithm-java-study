package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Step_Graph_11_7562 {
	
	static int [] rangeX= {-2,-1,2,1,-2,-1,2,1};
	static int [] rangeY= {1,2,1,2,-1,-2,-1,-2};

	public static void main(String[] args)  throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int T=Integer.parseInt(br.readLine());
		
		int startX,startY,endX,endY;
		StringTokenizer st;
		StringBuilder sb=new StringBuilder();
		
		while(T-->0) {
			
			int N=Integer.parseInt(br.readLine());
			
			Chess[] chess=new Chess[2];

			st=new StringTokenizer(br.readLine());
			startX=Integer.parseInt(st.nextToken());
			startY=Integer.parseInt(st.nextToken());
			chess[0]=new Chess(startX,startY);
			
			st=new StringTokenizer(br.readLine());
			endX=Integer.parseInt(st.nextToken());
			endY=Integer.parseInt(st.nextToken());
			chess[1]=new Chess(endX,endY);
			
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
			
			Chess temp=queue.poll();
			
			if(temp.x==chess[1].x&&temp.y==chess[1].y) {
				return temp.count;
			}
			
			for(int i=0;i<8;i++) {
				
				int dx=temp.x+rangeX[i];
				int dy=temp.y+rangeY[i];
				
				if(dx>=0&&dy>=0&&dx<n&&dy<n) {
					if(!visited[dx][dy]) {
						visited[dx][dy]=true;
						queue.offer(new Chess(dx,dy,temp.count+1));
					}
				}
				
			}
			
		}
		
		return -1;
		
	}

}

class Chess{
	int x;
	int y;
	int count;
	public Chess(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public Chess(int x, int y, int count) {
		this.x=x;
		this.y=y;
		this.count=count;
	}
}
