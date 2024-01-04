package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursion_2447 {

	static char [][] arr;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		br.close();
			
		arr=new char[N][N];
		
		makePattern(0,0,N,false);
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				sb.append(arr[i][j]);
			}sb.append('\n');
		}
		
		System.out.println(sb);

	}
	
	static void makePattern(int x, int y, int len, boolean isBlank) {
		
		if(isBlank) {
			for(int i=x;i<x+len;i++) {
				for(int j=y;j<y+len;j++) {
					arr[i][j]=' ';
				}
			}
			return;
		}
		
		if(len==1) {
			arr[x][y]='*';
			return;
		}
		
		int size=len/3;
		int count=0;
		
		for(int i=x;i<x+len;i+=size) {
			for(int j=y;j<y+len;j+=size) {
				count++;
				if(count==5) {
					makePattern(i, j, size, true);
				}else {
					makePattern(i, j, size, false);
				}
			}
		}
		
	}

}
