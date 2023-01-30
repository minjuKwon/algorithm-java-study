package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/101
public class Step_12_04_1018 {
	
	static boolean[][] board;
	static int min=64;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		board=new boolean [N][M];
		
		for(int i=0;i<N;i++) {
			String str=br.readLine();
			for(int j=0;j<M;j++) {
				if(str.charAt(j)=='W')
					board[i][j]=true;
				else
					board[i][j]=false;
			}
		}
		
		for(int i=0;i<N-7;i++) {
			for(int j=0;j<M-7;j++) {
				find(i,j);
			}
		}
		
		System.out.println(min);

	}
	
	public static void find(int x, int y) {
		
		int count=0;
		boolean arr=board[x][y];
		
		for(int i=x;i<x+8;i++) {
			for(int j=y;j<y+8;j++) {
				if(board[i][j]!=arr)
					count++;
				arr=!arr;
			}
			arr=!arr;
		}
		
		count=Math.min(count	, 64-count);
		min=Math.min(min, count);
		
	}

}
