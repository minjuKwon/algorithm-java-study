package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ShortestPath_11404 {
	
	static final int INF = 10_000_000;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		int M=Integer.parseInt(br.readLine());
		
		long [][] dist=new long[N+1][N+1];
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				dist[i][j]=(i==j?0:INF);
			}
		}
		
		for(int i=0;i<M;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int d=Integer.parseInt(st.nextToken());
			dist[a][b]=Math.min(dist[a][b], d);
		}
		br.close();

		for(int k=1;k<=N;k++) {
			for(int i=1;i<=N;i++) {
				for(int j=1;j<=N;j++) {
					dist[i][j]=Math.min(dist[i][j],dist[i][k]+dist[k][j]);
				}
			}
		}
		
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				if(dist[i][j]==INF) sb.append(0).append('\n');
				else sb.append(dist[i][j]).append(' ');
			}
			sb.append('\n');
		}
		
		System.out.println(sb);

	}

}
