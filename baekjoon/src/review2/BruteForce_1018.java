package review2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BruteForce_1018 {
	
	static boolean [][]board;
	static int min=64;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		board=new boolean[N][M];
		
		for(int i=0;i<N;i++) {
			String input=br.readLine();
			for(int j=0;j<M;j++) {
				if(input.charAt(j)=='W') {
					board[i][j]=true;
				}else {
					board[i][j]=false;
				}
			}
		}
		br.close();
		
		for(int i=0;i<N-7;i++) {
			for(int j=0;j<M-7;j++) {
				chessBoard(i,j);
			}
		}

		System.out.println(min);
		
	}
	
	static void chessBoard(int x, int y) {
		int count=0;
		boolean temp=board[x][y];
		for(int i=x;i<x+8;i++) {
			for(int j=y;j<y+8;j++) {
				if(board[i][j]!=temp) {
					count++;
				}
				temp=!temp;
			}
			temp=!temp;
		}
		count=Math.min(count, 64-count);
		min=Math.min(count, min);
	}

}
