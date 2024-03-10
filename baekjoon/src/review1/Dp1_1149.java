package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dp1_1149 {
	
	static int N;
	static int [][] colors;
	static int [][] cost;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		colors=new int[N][3];
		cost=new int[N][3];
		
		StringTokenizer st;
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			colors[i][0]=Integer.parseInt(st.nextToken());
			colors[i][1]=Integer.parseInt(st.nextToken());
			colors[i][2]=Integer.parseInt(st.nextToken());
			
		}
		
		br.close();
		
		cost[0][0]=colors[0][0];
		cost[0][1]=colors[0][1];
		cost[0][2]=colors[0][2];
		
		int min=Math.min(getCost(N-1,0), Math.min(getCost(N-1,1), getCost(N-1, 2)));
		
		System.out.println(min);
			
	}
	
	static int getCost(int n, int color) {
		if(cost[n][color]==0) {
			if(color==0) {
				cost[n][color]=Math.min(getCost(n-1,1), getCost(n-1, 2))+colors[n][0];
			}else if(color==1) {
				cost[n][color]=Math.min(getCost(n-1,0), getCost(n-1, 2))+colors[n][1];
			}else if(color==2) {
				cost[n][color]=Math.min(getCost(n-1,0), getCost(n-1, 1))+colors[n][2];
			}
		}
		return cost[n][color];
	}

}
