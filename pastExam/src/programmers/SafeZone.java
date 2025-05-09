package programmers;

public class SafeZone {

	public static void main(String[] args) {
		
		int[][] board= {
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0}, 
				{0, 0, 0, 0, 0},
				{0, 0, 1, 0, 0},
				{0, 0, 0, 0, 0}
				};
        int [] rangeX={-1, 0, 1, -1, 1, -1, 0, 1};
        int [] rangeY={-1, -1, -1, 0, 0, 1, 1, 1};
        int len=board.length;
        
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(board[i][j]==1){
                    for(int k=0;k<8;k++){
                        int dx=rangeX[k]+i;
                        int dy=rangeY[k]+j;
                        if(dx>=0&&dx<len&&dy>=0&&dy<len){
                            if(board[dx][dy]==0){
                                board[dx][dy]=2;
                            } 
                        }
                    }
                }
            }
        }
        
        int answer = 0;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(board[i][j]==0) answer++;
            }
        }
        
        System.out.println(answer);

	}

}
