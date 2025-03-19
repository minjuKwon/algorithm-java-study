package programmers;

import java.util.Arrays;

public class TheClosestEquivalentLetter {

	public static void main(String[] args) {
		
		String s="banana";
		
		int len=s.length();
        int[] answer = new int[len];
        int [] position=new int[26];
        
        for(int i=1;i<=len;i++){
            int idx= s.charAt(i-1)-'a';
            if(position[idx]==0){
                answer[i-1]=-1;
            }else{
              answer[i-1]=i-position[idx];   
            }
            position[idx]=i;
        }
        
        System.out.println(Arrays.toString(answer));

	}

}
