package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_DivideAndConquer_07_10830_02 {
	
	final static int VALUE=1000;
	static int [][] arrOrigin;
	static int N;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		N=Integer.parseInt(st.nextToken());
		long B=Long.parseLong(st.nextToken());
		
		arrOrigin=new int[N][N];
		
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				arrOrigin[i][j]=Integer.parseInt(st.nextToken())%VALUE;
			}
		}
		
		br.close();
		
		int [][] arrResult=pow(arrOrigin,B);
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				sb.append(arrResult[i][j]).append(' ');
			}
			sb.append('\n');
		}
		
		System.out.println(sb);

	}
	
	static int [][] pow(int [][] arr, long exponent){
		
		if(exponent==1L) {
			return arr;
		}
		
		int [][] arrRecency=pow(arr,exponent/2);
		
		arrRecency=mutiply(arrRecency,arrRecency);
		
		if(exponent%2==1L) {
			arrRecency=mutiply(arrRecency,arrOrigin);
		}
	
		return arrRecency;
		
	}
	
	static int [][] mutiply(int [][] arr1, int [][] arr2){
		
		int [][] arrRecency=new int[N][N];
		int temp;
		
		for(int k=0;k<N;k++) {
			for(int i=0;i<N;i++) {
				temp=arr1[i][k];
				for(int j=0;j<N;j++) {
					arrRecency[i][j]+=temp*arr2[k][j];
					arrRecency[i][j]%=VALUE;
				}
			}
		}
		
		return arrRecency;
		
	}

}
