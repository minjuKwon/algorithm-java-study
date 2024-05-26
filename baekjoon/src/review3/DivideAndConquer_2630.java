package review3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DivideAndConquer_2630 {
	
	static int [][] papers;
	static int white;
	static int blue;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		papers=new int[N][N];
		
		StringTokenizer st;
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				papers[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		br.close();
		
		division(0,0,N);
		
		System.out.println(white+"\n"+blue);

	}
	
	static void division(int row, int column, int size) {
		
		if(checkColor(row, column, size)) {
			if(papers[row][column]==0) {
				white++;	
			}else {
				blue++;
			}
			return;
		}
	
		int newSize=size/2;
		
		division(row, column, newSize);
		division(row, column+newSize, newSize);
		division(row+newSize, column, newSize);
		division(row+newSize, column+newSize, newSize);
		
	}
	
	static boolean checkColor(int row, int column, int size) {
		int color=papers[row][column];
		
		for(int i=row;i<row+size;i++) {
			for(int j=column;j<column+size;j++) {
				if(papers[i][j]!=color) return false;
			}
		}
		return true;
		
	}

}
