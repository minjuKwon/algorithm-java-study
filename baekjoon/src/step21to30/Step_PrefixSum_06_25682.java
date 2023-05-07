package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_PrefixSum_06_25682 {
	
	static char [][] board;
	static int N,M,K;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		K=Integer.parseInt(st.nextToken());
		
		board=new char[N][M];
		
		for(int i=0;i<N;i++) {
			String column=br.readLine();
			for(int j=0;j<M;j++) {
				board[i][j]=column.charAt(j);
			}
		}
		
		br.close();
		
		System.out.println(Math.min(paintChess('B'), paintChess('W')));

	}
    
	static int paintChess(char color) {
		
		int count=Integer.MAX_VALUE;
		int value;
		int [][] prefixSum=new int[N+1][M+1];
		
		//transfer board
		for(int i=0;i<N;i++) {
			
			for(int j=0;j<M;j++) {
				
				if((i+j)%2==0) {
					if(board[i][j]!=color) {
						value=1;
					}else {
						value=0;
					}
				}else {
					if(board[i][j]==color) {
						value=1;
					}else {
						value=0;
					}
				}
				
				prefixSum[i+1][j+1]=prefixSum[i][j+1]+prefixSum[i+1][j]-prefixSum[i][j]+value;

			}
			
		}
		//prefixSum
		for(int i=1;i<=N-K+1;i++) {
			for(int j=1;j<=M-K+1;j++) {
				int num=prefixSum[i+K-1][j+K-1]-prefixSum[i+K-1][j-1]-prefixSum[i-1][j+K-1]+prefixSum[i-1][j-1];
				count=Math.min(count, num);
			}
		}
		
		return count;
	
	}

}
