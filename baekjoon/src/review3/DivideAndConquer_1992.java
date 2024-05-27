package review3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivideAndConquer_1992 {

	static int [][] board;
	static StringBuilder sb=new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());

		board=new int[N][N];
		
		for(int i=0;i<N;i++) {
			String input=br.readLine();
			for(int j=0;j<N;j++) {
				board[i][j]=input.charAt(j)-'0';
			}
		}
		
		br.close();
		
		division(0,0, N);
		
		System.out.println(sb);
		
	}
	
	static void division(int row, int column, int size) {
		if(checkNumber(row, column, size)) {
			sb.append(board[row][column]);
			return;
		}
		
		sb.append('(');
		
		int newSize=size/2;
		
		division(row,column,newSize);		
		division(row,column+newSize,newSize);		
		division(row+newSize,column,newSize);		
		division(row+newSize,column+newSize,newSize);
		
		sb.append(')');
	}
	
	static boolean checkNumber(int row, int column, int size) {
		int num=board[row][column];
		for(int i=row;i<row+size;i++) {
			for(int j=column;j<column+size;j++) {
				if(board[i][j]!=num) return false;
			}
		}
		return true;
	}

}
