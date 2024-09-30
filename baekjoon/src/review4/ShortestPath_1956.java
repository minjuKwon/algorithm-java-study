package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ShortestPath_1956 {
	
	static final int INF=8_000_000;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int V=Integer.parseInt(st.nextToken());
		int E=Integer.parseInt(st.nextToken());
		
		int [][] dist=new int[V+1][V+1];
		
		for(int i=1;i<=V;i++) {
			for(int j=1;j<=V;j++) {
				dist[i][j]=(i==j?0:INF);
			}
		}
		
		while(E-->0) {
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			dist[a][b]=c;
		}
		br.close();

		for(int k=1;k<=V;k++) {
			for(int i=1;i<=V;i++) {
				for(int j=1;j<=V;j++) {
					dist[i][j]=Math.min(dist[i][j], dist[i][k]+dist[k][j]);
				}
			}
		}
		
		int answer=INF;
		for(int i=1;i<=V;i++) {
			for(int j=1;j<=V;j++) {
				if(i==j) continue;
				if(dist[i][j]!=INF&&dist[j][i]!=INF) {
					answer=Math.min(answer, dist[i][j]+dist[j][i]);
				}
			}
		}
		
		if(answer==INF) {
			System.out.println(-1);
		}else {
			System.out.println(answer);
		}
		
	}

}
