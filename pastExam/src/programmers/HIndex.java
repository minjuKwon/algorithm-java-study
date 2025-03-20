package programmers;

import java.util.Arrays;

public class HIndex {

	public static void main(String[] args) {
		
		int[] citations= {3, 0, 6, 1, 5};
		
		Arrays.sort(citations);
        
        int len=citations.length;
        for(int i=0;i<len;i++){
            int num=len-i;
            if(num<=citations[i]){
                System.out.println(num);
                System.exit(0);
            }
        }
        
        System.out.println(0);

	}

}