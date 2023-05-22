package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/245
public class Step_DivideAndConquer_06_2740_04 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		int [][] arrA=new int[N][M];
		
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				arrA[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		st=new StringTokenizer(br.readLine());
		
		st.nextToken();
		int K=Integer.parseInt(st.nextToken());
		
		int [][] arrB=new int[M][K];
		
		for(int i=0;i<M;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<K;j++) {
				arrB[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		br.close();
		
		int [][] arrC=new int[N][K];
		
		for(int k=0;k<M;k++) {
			for(int i=0;i<N;i++) {
				int value=arrA[i][k];
				for(int j=0;j<K;j++) {
					arrC[i][j]+=value*arrB[k][j];
				}
			}
		}
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<K;j++) {
				sb.append(arrC[i][j]).append(' ');
			}
			sb.append('\n');
		}
		
		System.out.println(sb);		

	}

}
