package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TheHallOfFame {

	public static void main(String[] args) {
		
		int k=3;
		int[] score= {10, 100, 20, 150, 1, 100, 200};
		
		int len=score.length;
        int[] answer = new int[len];
        ArrayList<Integer> list= new ArrayList<>();
        
        for(int i=0;i<len;i++){
            list.add(score[i]);
            if(list.size()>k){
                list.remove(Collections.min(list));
            }
            answer[i] =Collections.min(list);
        }
        
        System.out.println(Arrays.toString(answer));

	}

}