package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Graph_7576 {
	
	static int [][] arr;
	static int [] rangeX= {-1,0,1,0};
	static int [] rangeY= {0,1,0,-1};
	static Queue<Node> queue=new LinkedList<>();
	static int N,M;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		M=Integer.parseInt(st.nextToken());
		N=Integer.parseInt(st.nextToken());
		
		arr=new int[N][M];
		
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
				if(arr[i][j]==1) queue.offer(new Node(i,j));
			}
		}
		
		br.close();
		
		System.out.println(bfs());
		
	}
	
	static int bfs() {
		while(!queue.isEmpty()) {
			Node node=queue.poll();
			for(int i=0;i<4;i++) {
				int dx=rangeX[i]+node.x;
				int dy=rangeY[i]+node.y;
				if(dx>=0&&dy>=0&&dx<N&&dy<M) {
					if(arr[dx][dy]==0) {
						arr[dx][dy]=arr[node.x][node.y]+1;
						queue.offer(new Node(dx,dy));
					}
				}
			}
		}
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(arr[i][j]==0) return -1;
				else if(arr[i][j]>max) max=arr[i][j];
			}
		}
	
		return max-1;
	}

}
