package programmers;

import java.util.HashSet;
import java.util.Set;

public class PhoneNumberList {

	public static void main(String[] args) {
		
		String[] phone_book= {"119", "97674223", "1195524421"};
		
		Set<String> set =new HashSet<>();
        for(String num:phone_book){
            set.add(num);
        }
        
        boolean answer=true;
        StringBuilder sb=new StringBuilder();
        
        for(String num:phone_book){
            char [] arr=num.toCharArray();
            for(int i=0;i<arr.length-1;i++){
                sb.append(arr[i]);
                if(set.contains(sb.toString())) answer= false;
            }
            sb.setLength(0);
        }
        
        System.out.println(answer);

	}

}