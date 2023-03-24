package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/128
public class Step_18_06_1149 {

	static int[][] cost;
	static int [][] arrMin;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		cost=new int[N][3];
		arrMin=new int[N][3];
		
		for(int i=0;i<N;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			cost[i][0]=Integer.parseInt(st.nextToken());
			cost[i][1]=Integer.parseInt(st.nextToken());
			cost[i][2]=Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		arrMin[0][0]=cost[0][0];
		arrMin[0][1]=cost[0][1];
		arrMin[0][2]=cost[0][2];
		
		int answer=Math.min(getCost(N-1,0), Math.min(getCost(N-1,1), getCost(N-1,2)));
		
		System.out.println(answer);

	}
	
	static int getCost(int n, int color) {
		
		if(arrMin[n][color]==0) {
			if(color==0) {
				arrMin[n][0]=Math.min(getCost(n-1,1), getCost(n-1,2))+cost[n][0];
			}else if(color==1) {
				arrMin[n][1]=Math.min(getCost(n-1,0), getCost(n-1,2))+cost[n][1];
			}else if(color==2) {
				arrMin[n][2]=Math.min(getCost(n-1,0), getCost(n-1,1))+cost[n][2];
			}
		}
		
		return arrMin[n][color];
		
	}

}
