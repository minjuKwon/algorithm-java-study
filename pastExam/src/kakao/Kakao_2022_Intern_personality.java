package kakao;

import java.util.HashMap;
import java.util.Map;

public class Kakao_2022_Intern_personality {

	public static void main(String[] args) {
		String [] survey= {"AN", "CF", "MJ", "RT", "NA"};
		int [] choices= {5, 3, 2, 7, 5};
		System.out.println(solution(survey,choices));
	}
	
	static public String solution(String[] survey, int[] choices) {
        
        Map<Character,Integer>map=new HashMap<>();
        
        for(int i=0;i<survey.length;i++){
            char s1=survey[i].charAt(0);
            char s2=survey[i].charAt(1);
            if(choices[i]==4) continue;
            if(choices[i]>4){
                if(map.containsKey(s2)){
                    map.put(s2,map.get(s2)+choices[i]-4);
                }else{
                    map.put(s2,choices[i]-4);
                }
            }else{
                if(map.containsKey(s1)){
                    map.put(s1,map.get(s1)+4-choices[i]);
                }else{
                    map.put(s1,4-choices[i]);
                }
            }
        }
        
        String [] table={"RT","CF","JM","AN"};
        String answer = "";
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<4;i++){
            if(map.getOrDefault(table[i].charAt(0),0)>=map.getOrDefault(table[i].charAt(1),0)){
                sb.append(table[i].charAt(0));
            }else{
                sb.append(table[i].charAt(1));
            }
        }
        
        answer=sb.toString();
        return answer;
    }

}
