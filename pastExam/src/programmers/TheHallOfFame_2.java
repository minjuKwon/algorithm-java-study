package programmers;

import java.util.Arrays;
import java.util.PriorityQueue;

public class TheHallOfFame_2 {

	public static void main(String[] args) {
		
		int k=3;
		int[] score= {10, 100, 20, 150, 1, 100, 200};
		
		int len=score.length;
        int[] answer = new int[len];
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        
        for(int i=0;i<len;i++){
            queue.offer(score[i]);
            if(queue.size()>k){
                queue.poll();
            }
            answer[i]=queue.peek();
        }
        
        System.out.println(Arrays.toString(answer));

	}

}