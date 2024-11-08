package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backtracking_26169 {
	
	static int [][] board=new int[5][5];
	static int [] rangeX= {0,-1,0,1};
	static int [] rangeY= {1,0,-1,0};
	static int answer=0;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<5;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			for(int j=0;j<5;j++) {
				board[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int r=Integer.parseInt(st.nextToken());
		int c=Integer.parseInt(st.nextToken());
		br.close();
		
		dp(0,r,c,0);
		
		System.out.println(answer);
		
	}
	
	static void dp(int depth, int x, int y, int count) {
		
		if(depth==3) {
			if(count>=2) {
				answer=1;
			}
			return;
		}
		
		for(int i=0;i<4;i++) {
			int dx=x+rangeX[i];
			int dy=y+rangeY[i];
			
			if(dx<0||dy<0||dx>=5||dy>=5||board[dx][dy]==-1) continue;
			
			board[x][y]=-1;
			
			if(board[dx][dy]==1) {		
				dp(depth+1,dx,dy,count+1);
			}else if(board[dx][dy]==0) {
				dp(depth+1,dx,dy,count);
			}
			
			board[x][y]=0;
		}
		
	}

}
