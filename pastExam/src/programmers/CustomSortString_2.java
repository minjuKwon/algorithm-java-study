package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CustomSortString_2 {

	public static void main(String[] args) {
		
		int n=1;
		String[] strings= {"sun", "bed", "car"};
		
		int len=strings.length;
        ArrayList<String> list=new ArrayList<>();
        
        for(int i=0;i<len;i++){
            StringBuilder sb=new StringBuilder();
            sb.append(strings[i].charAt(n)).append(strings[i]);
            list.add(sb.toString());
        }
        
        Collections.sort(list);
        
        String[] answer = new String[len];
        for(int i=0;i<len;i++){
            String temp=list.get(i);
            answer[i]=temp.substring(1,temp.length());
        }
        
        System.out.println(Arrays.toString(strings));

	}

}