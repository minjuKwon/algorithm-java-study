package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Graph_2206 {

	static int [][] arr;
	static boolean [][][] visited;
	static int [] rangeX= {-1,0,1,0};
	static int [] rangeY= {0,1,0,-1};
	static int N,M;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		if(N==1&&M==1) {
			System.out.println(1);
			System.exit(0);
		}
		
		arr=new int [N][M];
		visited=new boolean[N][M][2];
		
		for(int i=0;i<N;i++) {
			String input=br.readLine();
			for(int j=0;j<M;j++) {
				arr[i][j]=input.charAt(j)-'0';
			}
		}
		br.close();
		
		bfs();

	}
	
	static void bfs() {
		Queue<Spot> queue=new LinkedList<>();
		queue.add(new Spot(0,0,1,false));
		visited[0][0][0]=true;
		
		while(!queue.isEmpty()) {
			
			Spot spot=queue.poll();
			if(spot.x==N-1&&spot.y==M-1) {
				System.out.println(spot.count);
				return;
			}
			
			for(int i=0;i<4;i++) {
				int dx=spot.x+rangeX[i];
				int dy=spot.y+rangeY[i];
				if(dx>=0&&dy>=0&&dx<N&&dy<M) {
					if(arr[dx][dy]==0) {
						if(!visited[dx][dy][0]&&!spot.isDestory) {
							visited[dx][dy][0]=true;
							queue.offer(new Spot(dx,dy,spot.count+1,false));
						}else if(!visited[dx][dy][1]&&spot.isDestory) {
							visited[dx][dy][1]=true;
							queue.offer(new Spot(dx,dy,spot.count+1,true));
						}
					}else {
						if(!spot.isDestory) {
							visited[dx][dy][1]=true;
							queue.offer(new Spot(dx,dy,spot.count+1,true));							
						}
					}
				}
			}
			
		}
		
		System.out.println(-1);
		
	}

}

class Spot{
	int x; int y;
	int count; boolean isDestory;
	public Spot(int x, int y, int count, boolean isDestory) {
		this.x=x;
		this.y=y;
		this.count=count;
		this.isDestory=isDestory;
	}
}
