package programmers;

import java.util.Arrays;

public class TheSumOfSuccessiveNumbers {

	public static void main(String[] args) {
		
		int num=3;
		int total=12;
		
		int[] answer = new int[num];
        int sum= (num-1)*num/2;
        int first= (total-sum)/num;
        
        for(int i=0;i<num;i++) answer[i]=first++;
        
        System.out.println(Arrays.toString(answer));

	}

}
