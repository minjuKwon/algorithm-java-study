package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Step_Graph_13_7569 {
	
	static int [][][] board;
	
	static int[] rangeX= {-1,0,1,0,0,0};
	static int[] rangeY= {0,1,0,-1,0,0};
	static int[] rangeZ= {0,0,0,0,-1,1};
	
	static int M,N,H;
	static Queue<Tomato> queue=new LinkedList<>();

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		M=Integer.parseInt(st.nextToken());
		N=Integer.parseInt(st.nextToken());
		H=Integer.parseInt(st.nextToken());
		
		board=new int[H][N][M];
		
		for(int i=0;i<H;i++) {
			for(int j=0;j<N;j++) {
				st=new StringTokenizer(br.readLine());
				for(int k=0;k<M;k++) {
					board[i][j][k]=Integer.parseInt(st.nextToken());
					if(board[i][j][k]==1) {
						queue.offer(new Tomato(i,j,k));
					}
				}
			}
		}
		
		br.close();
		
		System.out.println(bfs());

	}
	
	static int bfs() {
		
		while(!queue.isEmpty()) {
			
			Tomato tomato=queue.poll();
			int z=tomato.z;
			int x=tomato.x;
			int y=tomato.y;
			
			for(int i=0;i<6;i++) {
				
				int dz=z+rangeZ[i];
				int dx=x+rangeX[i];
				int dy=y+rangeY[i];
				
				if(dz>=0&&dx>=0&&dy>=0&&dz<H&&dx<N&&dy<M) {
					if(board[dz][dx][dy]==0) {
						board[dz][dx][dy]=board[z][x][y]+1;
						queue.offer(new Tomato(dz,dx,dy));
					}
				}
				
			}
			
		}
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<H;i++) {
			for(int j=0;j<N;j++) {
				for(int k=0;k<M;k++) {
					if(board[i][j][k]==0) {
						return -1;
					}else if(board[i][j][k]>max) {
						max=board[i][j][k];
					}
				}
			}
		}
		
		return max-1;
		
	}

}
