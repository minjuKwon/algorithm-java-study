package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_11_05_2447 {
	
	static char[][] arr;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		arr=new char [N][N];
		
		star_pattern(0,0,N,false);
		
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) 
				sb.append(arr[i][j]);
			sb.append('\n');
		}
		
		System.out.println(sb);

	}
	
	static void star_pattern(int x, int y, int N, boolean blank) {
		if(blank) {
			for(int i=x;i<x+N;i++) {
				for(int j=y;j<y+N;j++) {
					arr[i][j]=' ';
				}
			}return;
		}
		
		if(N==1) {
			arr[x][y]='*';
			return;
		}
		
		int size=N/3;
		int count=0;
		for(int i=x;i<x+N;i+=size) {
			for(int j=y;j<y+N;j+=size) {
				count++;
				if(count==5)
					star_pattern(i,j,size,true);
				else
					star_pattern(i,j,size,false);
			}
		}
	}

}
