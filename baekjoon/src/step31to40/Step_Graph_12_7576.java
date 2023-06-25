package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Step_Graph_12_7576 {
	
	static int [][] board;
	
	static int [] rangeX= {-1,0,1,0};
	static int [] rangeY= {0,1,0,-1};
	
	static int M,N;
	static Queue<Tomato> queue=new LinkedList<>();

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		M=Integer.parseInt(st.nextToken());
		N=Integer.parseInt(st.nextToken());
		
		board=new int[N][M];
		
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				board[i][j]=Integer.parseInt(st.nextToken());
				if(board[i][j]==1) {
					queue.offer(new Tomato(i,j));
				}
			}
		}
		
		br.close();
		
		System.out.println(bfs());

	}
	
	static int bfs() {
		
		while(!queue.isEmpty()) {
			
			Tomato tomato=queue.poll();
			int x=tomato.x;
			int y=tomato.y;
			
			for(int i=0;i<4;i++) {
				
				int dx=x+rangeX[i];
				int dy=y+rangeY[i];
				
				if(dx>=0&&dy>=0&&dx<N&&dy<M) {
					if(board[dx][dy]==0) {
						board[dx][dy]=board[x][y];
						queue.offer(new Tomato(dx,dy));
					}
				}
				
			}
			
		}
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(board[i][j]==0) {
					return -1;
				}else if(board[i][j]>max) {
					max=board[i][j];
				}
			}
		}
		
		return max-1;
		
	}

}

class Tomato{
	int x;
	int y;
	int z;
	public Tomato(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public Tomato(int z, int x, int y) {
		this.z=z;
		this.x=x;
		this.y=y;
	}
}
