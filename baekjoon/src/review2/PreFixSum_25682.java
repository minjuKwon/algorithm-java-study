package review2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PreFixSum_25682 {
	
	static int N,M,K;
	static char [][] board;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		K=Integer.parseInt(st.nextToken());
		
		board=new char[N][M];
		
		for(int i=0;i<N;i++) {
			String input=br.readLine();
			for(int j=0;j<M;j++) {
				board[i][j]=input.charAt(j);
			}
		}
		
		br.close();
		
		int count=Math.min(getCount('B'), getCount('W'));
		
		System.out.println(count);

	}
	
	static int getCount(char ch) {
		
		int [][] preSum=new int[N+1][M+1];
		int value=0;
		int count=Integer.MAX_VALUE;
		
		//잘못 칠해진 보드 1로 변환. 올바른 보드는 0.
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				
				if((i+j)%2==0) {
					if(board[i][j]!=ch) {
						value=1;
					}else {
						value=0;
					}
				}else {
					if(board[i][j]==ch) {
						value=1;
					}else {
						value=0;
					}
				}
				//누적 합
				preSum[i+1][j+1]=preSum[i][j+1]+preSum[i+1][j]-preSum[i][j]+value;
				
			}
		}
		
		//누적합 계산, 최솟값 구하기
		for(int i=1;i<=N-K+1;i++) {
			for(int j=1;j<=M-K+1;j++) {
				int num=preSum[i+K-1][j+K-1]-preSum[i-1][j+K-1]-preSum[i+K-1][j-1]+preSum[i-1][j-1];
				count=Math.min(count, num);
			}
		}
		
		return count;
	
	}

}
