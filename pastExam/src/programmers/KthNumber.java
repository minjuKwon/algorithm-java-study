package programmers;

import java.util.Arrays;

public class KthNumber {

	public static void main(String[] args) {
		
		int[] array= {1, 5, 2, 6, 3, 7, 4};
		int[][] commands= {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		int len=commands.length;
        int[] answer = new int[len];
        
        for(int i=0;i<len;i++){
            int [] temp=commands[i];
            int [] num= Arrays.copyOfRange(array,temp[0]-1,temp[1]);
            Arrays.sort(num);
            answer[i]=num[temp[2]-1];
        }
        
        System.out.println(Arrays.toString(answer));

	}

}