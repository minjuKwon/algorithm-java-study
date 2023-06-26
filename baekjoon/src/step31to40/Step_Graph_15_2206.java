package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Step_Graph_15_2206 {
	
	static int [][] map;
	static boolean [][][] visited;
	
	static int [] rangeX= {-1,0,1,0};
	static int [] rangeY= {0,1,0,-1};
	
	static int N,M;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		if(N-1==0&&M-1==0) {
			System.out.println(1);
			System.exit(0);
		}
		
		map=new int[N][M];
		visited=new boolean[N][M][2];
		
		for(int i=0;i<N;i++) {
			String str=br.readLine();
			for(int j=0;j<M;j++) {
				map[i][j]=str.charAt(j)-'0';
			}
		}
		
		br.close();
		
		bfs();

	}
	
	static void bfs() {
		
		Queue<Spot>queue=new LinkedList<>();
		
		queue.offer(new Spot(0,0,1,false));
		visited[0][0][0]=true;
		
		while(!queue.isEmpty()) {
			
			Spot spot=queue.poll();
			int x=spot.x;
			int y=spot.y;
			int count=spot.count;
			boolean destory=spot.d;
			
			if(x==N-1&&y==M-1) {
				System.out.println(count);
				return;
			}
			
			for(int i=0;i<4;i++) {
				
				int dx=x+rangeX[i];
				int dy=y+rangeY[i];
				
				if(dx>=0&&dy>=0&&dx<N&&dy<M) {
					
					if(map[dx][dy]==0) {
						if(!visited[dx][dy][0]&&!destory) {
							visited[dx][dy][0]=true;
							queue.offer(new Spot(dx,dy,count+1,false));
						}else if(!visited[dx][dy][1]&&destory) {
							visited[dx][dy][1]=true;
							queue.offer(new Spot(dx,dy,count+1,true));
						}
					}
					else {
						if(!destory) {
							visited[dx][dy][1]=true;
							queue.offer(new Spot(dx,dy,count+1,true));
						}
					}
					
				}
				
			}
			
		}
		
		System.out.println(-1);
		
	}

}

class Spot{
	int x;
	int y;
	int count;
	boolean d;
	public Spot(int x, int y, int count, boolean d) {
		this.x=x;
		this.y=y;
		this.count=count;
		this.d=d;
	}
}
