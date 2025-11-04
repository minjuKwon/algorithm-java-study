package kakao;

import java.util.Stack;

public class Kakao_2019_Intern_clawMachine {

	public static void main(String[] args) {
		 
		int [][] board= {
				{0,0,0,0,0},
				{0,0,1,0,3},
				{0,2,5,0,1},
				{4,2,4,4,2},
				{3,5,1,3,1}
		};
		int [] moves= {1,5,3,5,1,2,1,4};
		
		solution(board, moves);

	}
	
	static public int solution(int[][] board, int[] moves) {
        
        int len= board.length;
        int [] idx= new int[len+1];
        
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(board[j][i]!=0){
                    idx[i+1]=j;
                    break;
                } 
            }
        }
        
        int answer = 0;
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        
        for(int move:moves){
            if(idx[move]==len) continue;
            int element=board[idx[move]][move-1];
            if(element == stack.peek()){
                stack.pop();
                answer+=2;
            }else{
                stack.push(element);
            } 
            idx[move]++;
        }
        
        return answer;
    }

}
