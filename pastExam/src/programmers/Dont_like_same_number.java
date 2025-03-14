package programmers;

import java.util.ArrayList;

public class Dont_like_same_number {

	public static void main(String[] args) {
		
		int []arr= {1,1,3,3,0,1,1};
		
	    ArrayList<Integer> list=new ArrayList<>();
	        
        int temp=arr[0];
        list.add(temp);
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]==temp) continue;
            list.add(arr[i]);
            temp=arr[i];
        }
	    
        int len=list.size();
        int[] answer = new int[len];
        
        for(int i=0;i<len;i++){
            answer[i]=list.get(i);
        }
        
       StringBuilder sb=new StringBuilder();
       for(int num:answer) sb.append(num).append(' ');
       
       System.out.println(sb);

	}

}
