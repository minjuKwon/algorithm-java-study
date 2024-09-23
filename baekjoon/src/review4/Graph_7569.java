package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Graph_7569 {

	static int [][][] arr;
	static int [] rangeX= {-1,0,1,0,0,0};
	static int [] rangeY= {0,1,0,-1,0,0};
	static int [] rangeZ= {0,0,0,0,1,-1};
	static Queue<Tomato> queue=new LinkedList<>();
	static int N,M,H;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		M=Integer.parseInt(st.nextToken());
		N=Integer.parseInt(st.nextToken());
		H=Integer.parseInt(st.nextToken());
		
		arr=new int[N][M][H];
		
		for(int k=0;k<H;k++) {
			for(int i=0;i<N;i++) {
				st=new StringTokenizer(br.readLine());
				for(int j=0;j<M;j++) {
					arr[i][j][k]=Integer.parseInt(st.nextToken());
					if(arr[i][j][k]==1) queue.offer(new Tomato(i,j,k));
				}
			}
		}
		br.close();

		System.out.println(bfs());
		
	}
	
	static int bfs() {
		
		while(!queue.isEmpty()) {
			Tomato tomato=queue.poll();
			for(int i=0;i<6;i++) {
				int dx=tomato.x+rangeX[i];
				int dy=tomato.y+rangeY[i];
				int dz=tomato.z+rangeZ[i];
				if(dx>=0&&dy>=0&&dz>=0&&dx<N&&dy<M&&dz<H) {
					if(arr[dx][dy][dz]==0) {
						arr[dx][dy][dz]=arr[tomato.x][tomato.y][tomato.z]+1;
						queue.offer(new Tomato(dx,dy,dz));
					}
				}
				
			}
		}
		
		int max=Integer.MIN_VALUE;
		for(int k=0;k<H;k++) {
			for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					if(arr[i][j][k]==0) return -1;
					else max=Math.max(max, arr[i][j][k]);
				}
			}
		}
		
		return max-1;
		
	}

}

class Tomato{
	int x;int y; int z;
	public Tomato(int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
}
