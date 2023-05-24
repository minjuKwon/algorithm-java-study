package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/251
public class Step_DivideAndConquer_07_10830_03 {
	
	final static int VALUE=1000;
	static int [][] arrOrigin;
	static int N;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		N=Integer.parseInt(st.nextToken());
		long B=Long.parseLong(st.nextToken());
		
		arrOrigin=new int[N][N];
		int [][] arrResult=new int[N][N];
		
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				arrOrigin[i][j]=Integer.parseInt(st.nextToken());
			}
			arrResult[i][i]=1;
		}
		
		br.close();
		
		while(B>0) {
			if(B%2==1) {
				arrResult=multiply(arrResult,arrOrigin);
			}
			arrOrigin=multiply(arrOrigin,arrOrigin);
			B/=2;
		}
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				sb.append(arrResult[i][j]).append(' ');
			}
			sb.append('\n');
		}
		
		System.out.println(sb);

	}
	
	static int[][] multiply(int [][] arr1, int [][] arr2){
		
		int [][] arrRecency=new int[N][N];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				for(int k=0;k<N;k++) {
					arrRecency[i][j]+=arr1[i][k]*arr2[k][j];
					arrRecency[i][j]%=VALUE;
				}
			}
		}
		
		return arrRecency;
	
	}

}
