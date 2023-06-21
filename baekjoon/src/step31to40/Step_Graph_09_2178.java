package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Step_Graph_09_2178 {
	
	static int [][] map;
	static boolean [][] visited;
	
	static int [] rangeX= {-1,0,1,0};
	static int [] rangeY= {0,1,0,-1};
	
	static int N,M;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		map=new int[N][M];
		visited=new boolean[N][M];
		
		for(int i=0;i<N;i++) {
			String str=br.readLine();
			for(int j=0;j<M;j++) {
				map[i][j]=str.charAt(j)-'0';
			}
		}
		
		br.close();
		
		bfs(0,0);
		
		System.out.println(map[N-1][M-1]);

	}
	
	static void bfs(int x, int y) {
		
		Queue<Node> queue=new LinkedList<>();
		
		visited[x][y]=true;
		queue.offer(new Node(x,y));
		
		while(!queue.isEmpty()) {
			
			Node node=queue.poll();
			
			for(int i=0;i<4;i++) {
				
				int dx=node.x+rangeX[i];
				int dy=node.y+rangeY[i];
				
				if(dx>=0&&dy>=0&&dx<N&&dy<M) {
					if(map[dx][dy]==1&&!visited[dx][dy]) {
						queue.add(new Node(dx,dy));
						map[dx][dy]=map[node.x][node.y]+1;
						visited[dx][dy]=true;						
					}
				}
				
			}
			
		}
		
	}

}

class Node{
	int x;
	int y;
	public Node(int x, int y) {
		this.x=x;
		this.y=y;
	}
}
