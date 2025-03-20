package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class TheLargestNumber {

	public static void main(String[] args) {
		
		int[] numbers= {6, 10, 2};
		
		String [] num=new String[numbers.length];
        for(int i=0;i<numbers.length;i++){
            num[i]=String.valueOf(numbers[i]);
        }
        
        Arrays.sort(num, new Comparator<String>(){
           public int compare(String o1, String o2){
               String s1=o1+o2;
               String s2=o2+o1;
               return s2.compareTo(s1);
           } 
        });
        
        StringBuilder sb=new StringBuilder();
        for(String s:num){
            sb.append(s);
        }
        
        String answer = String.valueOf(sb);
        if(answer.charAt(0)=='0') answer="0";
        
        System.out.println(answer);

	}

}