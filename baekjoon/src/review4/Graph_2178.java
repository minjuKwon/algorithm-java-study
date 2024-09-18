package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Graph_2178 {
	
	static int [][] board;
	static boolean [][] visited;
	static int [] rangeX= {-1,0,1,0};
	static int [] rangeY= {0,1,0,-1};
	static int N,M;
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		board=new int[N][M];
		visited=new boolean[N][M];
		
		for(int i=0;i<N;i++) {
			String input=br.readLine();
			for(int j=0;j<M;j++) {
				board[i][j]=input.charAt(j)-'0';
			}
		}
		
		br.close();
		
		bfs();
		
		System.out.println(board[N-1][M-1]);
		
	}
	
	static void bfs() {
		
		Queue<Node> queue=new LinkedList<>();
		
		visited[0][0]=true;
		queue.offer(new Node(0,0));
		
		while(!queue.isEmpty()) {
			Node element=queue.poll();
			for(int i=0;i<4;i++) {
				int dx=element.x+rangeX[i];
				int dy=element.y+rangeY[i];
				if(dx<0||dy<0||dx>=N||dy>=M) {
					continue;
				}
				if(board[dx][dy]==1&&!visited[dx][dy]) {
					queue.offer(new Node(dx,dy));
					board[dx][dy]=board[element.x][element.y]+1;
					visited[dx][dy]=true;
				}
			}
		}
		
	}

}

class Node{
	int x; int y;
	public Node(int x, int y) {
		this.x=x;
		this.y=y;
	}
}


