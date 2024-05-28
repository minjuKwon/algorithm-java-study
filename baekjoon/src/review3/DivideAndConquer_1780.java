package review3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DivideAndConquer_1780 {

	static int [][] board;
	static int n_1,n0,n1;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());

		board=new int[N][N];
		
		StringTokenizer st;
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				board[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		br.close();
		
		division(0,0,N);
		
		System.out.println(n_1+"\n"+n0+"\n"+n1);
		
	}
	
	static void division(int row, int column, int size) {
		if(checkNum(row, column, size)) {
			if(board[row][column]==-1) {
				n_1++;
			}else if(board[row][column]==0) {
				n0++;
			}else {
				n1++;
			}
			return;
		}
		
		int newSize=size/3;
		
		division(row, column, newSize);
		division(row, column+newSize, newSize);
		division(row, column+newSize*2, newSize);
		
		division(row+newSize, column, newSize);
		division(row+newSize, column+newSize, newSize);
		division(row+newSize, column+newSize*2, newSize);
		
		division(row+newSize*2, column, newSize);
		division(row+newSize*2, column+newSize, newSize);		
		division(row+newSize*2, column+newSize*2, newSize);		
	}
	
	static boolean checkNum(int row, int column, int size) {
		int value=board[row][column];
		for(int i=row;i<row+size;i++) {
			for(int j=column;j<column+size;j++) {
				if(board[i][j]!=value) return false;
			}
		}
		return true;
	}

}
