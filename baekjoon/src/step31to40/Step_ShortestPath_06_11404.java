package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_ShortestPath_06_11404 {
	
	static final int INF=10000000;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		int m=Integer.parseInt(br.readLine());
		
		int [][] dist=new int[n+1][n+1];
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				dist[i][j]=(i==j?0:INF);
			}
		}
		
		int a,b,c;
		StringTokenizer st;
		for(int i=0;i<m;i++) {
			st=new StringTokenizer(br.readLine());
			a=Integer.parseInt(st.nextToken());
			b=Integer.parseInt(st.nextToken());
			c=Integer.parseInt(st.nextToken());
			dist[a][b]=Math.min(dist[a][b], c);
		}
		
		br.close();
		
		for(int k=1;k<=n;k++) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					dist[i][j]=Math.min(dist[i][j], dist[i][k]+dist[k][j]);
				}
			}
		}
		
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(dist[i][j]==INF) {
					sb.append(0).append(' ');	
				}else {
					sb.append(dist[i][j]).append(' ');					
				}
			}
			sb.append('\n');
		}
		
		System.out.println(sb);

	}

}
