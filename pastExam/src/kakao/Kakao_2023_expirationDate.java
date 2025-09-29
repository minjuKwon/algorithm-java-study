package kakao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Kakao_2023_expirationDate {

	public static void main(String[] args) {
		
		String today="2022.05.19";
		String[] terms= {"A 6", "B 12", "C 3"};
		String[] privacies= {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
		
		Map<String,Integer> map = new HashMap<>();
        for(String term:terms){
            String [] arr= term.split(" ");
            map.put(arr[0],Integer.parseInt(arr[1]));
        }
        
        String [] todayDate= today.split("\\.");
        int todayInt= Integer.parseInt(todayDate[0])*12*28+
            Integer.parseInt(todayDate[1])*28+Integer.parseInt(todayDate[2]);
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<privacies.length;i++){
            String [] arr= privacies[i].split(" ");
            String [] date= arr[0].split("\\.");
            
            int year= Integer.parseInt(date[0]);
            int month= Integer.parseInt(date[1]);
            int day = Integer.parseInt(date[2]);
            
            int deadline= year*12*28+month*28+day+map.get(arr[1])*28;
            if(deadline<=todayInt) list.add(i+1);
        }
        
        
        int[] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=list.get(i);
        }
        
        System.out.println(Arrays.toString(answer));

	}

}
