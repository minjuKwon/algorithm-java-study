package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_Dp1_10_10844_02 {
	
	final static long MOD=1000000000;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		br.close();
		
		long [][] stairsNum=new long[N+1][10];
		
		for(int i=1;i<10;i++) {
			stairsNum[1][i]=1;
		}
		
		for(int i=2;i<=N;i++) {
			for(int j=0;j<10;j++) {
				if(j==0) {
					stairsNum[i][0]=stairsNum[i-1][1]%MOD;
				}else if(j==9) {
					stairsNum[i][9]=stairsNum[i-1][8]%MOD;
				}else {
					stairsNum[i][j]=(stairsNum[i-1][j-1]+stairsNum[i-1][j+1])%MOD;
				}
			}
		}
		
		long result=0;
		for(int i=0;i<10;i++) {
			result+=stairsNum[N][i];
		}
		
		System.out.println(result%MOD);

	}

}
