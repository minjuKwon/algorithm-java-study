package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_18_06_1149_02 {

	static int [][] cost;
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
		
		for(int i=1;i<N;i++) {
			arrMin[i][0]=Math.min(arrMin[i-1][1], arrMin[i-1][2])+cost[i][0];
			arrMin[i][1]=Math.min(arrMin[i-1][0],arrMin[i-1][2])+cost[i][1];
			arrMin[i][2]=Math.min(arrMin[i-1][0], arrMin[i-1][1])+cost[i][2];
		}
		
		int answer=Math.min(arrMin[N-1][0], Math.min(arrMin[N-1][1], arrMin[N-1][2]));
		
		System.out.println(answer);

	}

}
