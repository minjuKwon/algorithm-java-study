package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Step_MST_06_17472 {
	
	static class Position {
		int x, y;
		public Position(int x, int y) {
			this.x=x;
			this.y=y;
		}
	}
	
	static class Node implements Comparable<Node>{
		int start, end, len;
		public Node(int start, int end, int len) {
			this.start=start;
			this.end=end;
			this.len=len;
		}
		public int compareTo(Node n) {
			return this.len-n.len;
		}
	}
	
	static int [][] map;
	static boolean [][] visited;
	static int [] rangeX= {-1, 0 ,1 , 0};
	static int [] rangeY= {0, 1, 0, -1};
	static int [] parent;
	static Queue<Node> pQueue=new PriorityQueue<>();
	static int index=1;
	static int bridge=0;
	static int N, M, x, y;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		map=new int[N][M];
		visited=new boolean[N][M];
		
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		br.close();
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(map[i][j]==1&&!visited[i][j]) {
					landIndexing(i, j, ++index);
				}
			}
		}
			
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(map[i][j]!=0) {
					makeBridge(i, j, map[i][j]);
				}
			}
		}
		
		parent=new int[index+1];
		
		for(int i=0;i<=index;i++) {
			parent[i]=i;
		}
		
		int result=getShortest();
		
		System.out.println(result);

	}
	
	static void landIndexing(int x, int y, int idx) {
		
		Queue<Position> queue=new LinkedList<>();
		
		queue.offer(new Position(x,y));
		
		map[x][y]=idx;
		visited[x][y]=true;
		
		while(!queue.isEmpty()) {
			
			Position position=queue.poll();
			
			for(int i=0;i<4;i++) {
				int dx=rangeX[i]+position.x;
				int dy=rangeY[i]+position.y;
				
				if(dx<0||dy<0||dx>=N||dy>=M||visited[dx][dy]) {continue;}
				
				if(map[dx][dy]==1) {
					map[dx][dy]=idx;
					visited[dx][dy]=true;
					queue.offer(new Position(dx,dy));
				}
			}
			
		}
		
	}
	
	static void makeBridge(int x, int y, int idx) {
		
		Queue<Node> queue=new LinkedList<>();
		
		for(int i=0;i<4;i++) {
			
			queue.offer(new Node(x,y,0));

			while(!queue.isEmpty()) {
				
				Node node=queue.poll();
				int dx=rangeX[i]+node.start;
				int dy=rangeY[i]+node.end;
				
				if(dx<0||dy<0||dx>=N||dy>=M) {continue;}
				
				if(map[dx][dy]!=idx) {
					if(map[dx][dy]!=0) {
						if(node.len>1) {
							pQueue.add(new Node(idx, map[dx][dy], node.len));
							break;
						}
					}else {
						queue.add(new Node(dx, dy, node.len+1));
					}
				}
				
			}
			
			queue.clear();
			
		}
		
	}
	
	static int getShortest() {
		int sum=0;
		int size=pQueue.size();
		
		for(int i=0;i<size;i++) {
			Node node=pQueue.poll();
			int start=node.start;
			int end=node.end;
	
			if(!isUnion(start, end)) {
				union();
				++bridge;
				sum+=node.len;
			}
		}
		
		if(index!=bridge+2) {
			return -1;
		}
		
		return sum;
	}
	
	static boolean isUnion(int a, int b) {
		x=find(a);
		y=find(b);
		if(x==y) return true;
		else return false;
	}
	
	static void union() {
		if(x>y) {
			parent[x]=y;
		}else {
			parent[y]=x;
		}
	}
	
	static int find(int x) {
		if(x==parent[x]) return x;
		return parent[x]=find(parent[x]);
	}

}
