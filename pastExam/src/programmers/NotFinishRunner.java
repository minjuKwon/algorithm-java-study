package programmers;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NotFinishRunner {

	public static void main(String[] args) {
		
		String[] participant= {"leo", "kiki", "eden"};
		String[] completion= {"eden", "kiki"};
		
		String answer = "";
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<participant.length;i++){
            map.put(participant[i],map.getOrDefault(participant[i],0)+1);
        }
        
        for(int i=0;i<completion.length;i++){
            if(map.containsKey(completion[i])){
                if(map.get(completion[i])==1){
                    map.remove(completion[i]);
                }else{
                    map.replace(completion[i],map.get(completion[i])-1);
                }
            }
        }
        
        Set<String> key=map.keySet();
        for(String s:key) answer=s;
        
        System.out.println(answer);

	}

}